# Java Static Analysis Tools

Many tools exist for doing static analysis of Java. In this section, we're going
to mention a few, then use one which gives us quite a few bits of functionality
in one go, and is something you could use with existing projects, GitHub and so
on.

## Tools In Combination

A few years ago, running sets of Java-specific tools in sequence like the
following were popular among some Java developers:

* [SpotBugs](https://spotbugs.github.io) (previously FindBugs, which SpotBugs
  replaced) looks for bugs
* [PMD](https://pmd.github.io) finds common programming flaws like unused
variables, empty catch blocks, unnecessary object creation, etc.
* [Checkstyle](https://checkstyle.sourceforge.io) checks whether the code is
  compliant with specified coding rules

These could have been run in a sequence, checking for slightly different (but
sometimes overlapping) things and then the whole set of findings brought
together, analysed and worked on in order to improve the code.

However, another product and tool was also available, covering lots of different
languages. Its Java static code analysis initially ran those three tools above
in sequence, and it's that tool we're going to look at next, get running, and
use for some real analysis and fixing up of code.

## SonarQube

[SonarQube](https://www.sonarsource.com/products/sonarqube/) is a self-managed,
automatic code review tool. When analysing Java code, it previously included all
three of the above tools, now seamlessly integrated into a single check for
bugs, vulnerabilities and "code smells".

SonarQube has different installations, including a simple local install (which
we'll do later), as well as functionality to be used in GitHub actions and CI.
SonarQube is useful in situations where you're working on self-maintained
enterprise installations (in-house) but there's also a cloud variant -
SonarCloud - were you to be working on cloud-based projects. While you'd be
welcome to try SonarQube in GitHub as an extension later on, if you have time,
we won't get into SonarCloud here but some more details are below, if you're
really interested:

* https://community.sonarsource.com/t/sonarcloud-vs-sonarqube/9557
* https://www.sonarsource.com/blog/sq-sc_guidance/

In the next few sections, we'll install SonarQube and get it running on a couple
of projects, ending with a chance for you to try it with some of your own Java
(or another language!) projects.

### Installation

Firstly, we're going to get SonarQube downloaded and installed as a local
instance.

> N.B. The steps in this section largely follow [SonarQube's own
> documentation](https://docs.sonarqube.org/latest/try-out-sonarqube/) but with
> some specific guidance for those of you working on MacOS.

SonarQube requires a "LTS" (long-term support) version of Java, such as Java 17
so if:

```
java -version
```

returns anything other than 17.x, either downgrade or upgrade Java as
appropriate to this recommended LTS version using `brew`.

From [SonarQube
downloads](https://www.sonarsource.com/products/sonarqube/downloads/) select the
free community edition, unzip this somewhere on your machine, then move the
contents to `/opt/sonarqube/`. If you want to do this on the command line, it'll
be something like the following, done from the directory in which you unzipped
everything:

```
mv sonarqube-9.9.0.65466/ /opt/sonarqube/
```

Start SonarQube and wait for the line as shown below - it can take a little
while, especially the first time:

```
/opt/sonarqube/bin/macosx-universal-64/sonar.sh console
[...]
2023.02.16 18:28:26 INFO  app[][o.s.a.SchedulerImpl] SonarQube is operational
```

You should now be able to browse to http://localhost:9000/ and log in as `admin`
with password `admin`. Follow the instructions to update the password.

SonarQube is now installed and running - the steps below involve getting some
code or a project to be checked by it, configuring SonarQube to have a matching
project for that, and then connecting the two!

### Example 1: basic Java code

For now, we're just going to get _something_ working with SonarQube. It's not
going to tell us anything we really care about in terms of code, but it will
tell us whether we've got SonarQube working correctly.

We're also going to be using VS Code (not IntelliJ) and also Gradle, which you
may have worked with before, to avoid setting up too many new things in one go.

> For these steps, at the time of writing, you'll need Gradle 7.x not Gradle
> 8.x. If you've not got the right version, simply uninstall Gradle (`brew
> uninstall gradle`) then install the right version (`brew install gradle@7`).
> Speak with your coach(es) if you have any problems.

<!-- OMITTED -->

In a terminal, create a new directory `sonarqube_quick_test`, then `cd` into it
and run `gradle init`. The options you should choose next are as per
https://github.com/makersacademy/java-fundamentals/blob/main/main/04_testing_with_junit.md
- you'll see we're doing similar steps at the beginning, creating the directory
before initialising Gradle from inside that directory, the picking the options.

From a new VS Code window, `open` the recently created `sonarqube_quick_test`
directory - you should see various Gradle files in VS Code's Explorer, as well
as `app/src/main/` and `app/src/test/`. We're going to use the prepopulated
`.java` files from those two directories as our code to be analysed by
SonarQube.

From your [local SonarQube installation's homepage](http://localhost:9000/) in
your browser:

* Click to manually create a new project
* Call it `sonarqube_quick_test` (name and key), leaving the branch as `main`
* Set it up
* We will analyse the project `locally`
* Click to generate a new token - you don't need to change anything here, nor
  necessarily note down the token
* Click to continue
* We're using Gradle, so select `gradle` from the list of build descriptions
* Copy the first block of text about `plugins` into your `build.gradle` file and
  save it - you can add it below any existing plugins that's already defined, as
  a new block

The final step is to run the second block of text about `gradlew` in VS Code's
own terminal, from within the same `sonarqube_quick_test` directory - copy all
of the lines, `/` characters included, and press enter. You should see something
like this:

```
% ./gradlew sonar \
  -Dsonar.projectKey=sonarqube_quick_test \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=sqp_cae254ee659d6c20c195b4d697134d7e834922ea
Starting a Gradle Daemon, 2 incompatible Daemons could not be reused, use --status for details

> Task :app:sonar
SCM provider autodetection failed. Please use "sonar.scm.provider" to define SCM of your project, or disable the SCM Sensor in the project settings.

BUILD SUCCESSFUL in 11s
3 actionable tasks: 3 executed
```

Congratulations! You can now switch back to your browser and take a look at what
SonarQube is showing for your project which you've just analysed - the page
should refresh automatically. There should be a big green "Passed" box, along
with various other numbers.

Feel free to poke around, but don't worry about trying to fix anything up - this
was just our trial run to check our SonarQube install and see the steps for
connecting a local project to a SonarQube project.

### Example 2: Acebook exercise

> Acebook, if you've not met it already as part of some other project work, is a
> two-week long project the Software Developers work on during their course.
> Makers have created some code as a starting point and the developers build
> upon it. As such, there's already a whole project of Java code just waiting
> for SonarQube to analyse!

Next, we're going to run SonarQube on the Java Acebook project files which
Makers have already built. There's a video at the end of this section showing a
few of the post-installation steps if you get stuck, but have a go for
yourself/yourselves first.

Fork https://github.com/makersacademy/acebook-java-template and clone it
locally. The instructions are all in that page for getting it up and running,
but the minimum required steps are:

* Create a new Postgres database called `acebook_springboot_development`
* Install Maven i.e. `brew install maven` (if not already installed - you could
  check this by doing `mvn --version`)
* Open the project in a new VS Code window
* Make sure `chromedriver` is up to date:
  * `brew upgrade chromedriver` to upgrade it (i.e. to be compatible with your
    browser which is probably automatically upgraded to the most recent version)
* Make sure `chromedriver` is in the right location:
  * Selenium uses ChromeDriver to interact with the Chrome browser. If you're on
    a Mac, ChromeDriver needs to be in `/usr/local/bin`. You can find out where
    it is like this: `which chromedriver`. If it's in the wrong place, move it
    using `mv` or create a symlink e.g. `ln -s /opt/homebrew/bin/chromedriver
    /usr/local/bin`
* And make sure `chromedriver` has permissions:
  * If you need to tell Mac that it is secure, go to Finder, press
    `Command+Shift+G` and type `/usr`, locate `chromedriver`, `Ctrl+click` it
    and choose Open - you can accept this app as being secure by this method
* Build the app and start the server, using the Maven command `mvn
  spring-boot:run`

Once you're able to browse to [the initial Acebook site and sign-up
page](http://localhost:8080/users/new), you're all set for connecting that local
Acebook project to a new project you'll set up in SonarQube.

Use the same steps in the previous example to create a project in SonarQube for
Acebook, now.

> N.B. This project uses Maven, not Gradle, so remember to check that build
> description when making the project in SonarQube!

Once you have run an analysis of the existing Java code supplied by Makers, pick
a problem, read about it, how to address it, and try to fix one or two. Re-run
SonarQube after each attempt, to see how your code - and its grading! - changes
over time.

To help, here's a [video on using SonarQube with
Acebook](https://youtu.be/wZT2iEz3Yo4).

### Example 3: your own project(s)

As the third of the three exercises, run SonarQube again but on one of your own
projects. This doesn't have to be Java, despite the two previous examples being
Java, so it's up to you what you choose. If you're interested in integrating it
into GitHub for one of your repositories, note that's what the next Extensions
page is all about.

[Next Challenge](06_extensions.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F05_static_analysis_java.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F05_static_analysis_java.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F05_static_analysis_java.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F05_static_analysis_java.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F05_static_analysis_java.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

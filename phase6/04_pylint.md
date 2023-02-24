# Linters

A *lint* or *linter* is the name for a static analysis tool which checks code
for bugs and stylistic errors which should be reviewed and potentially
addressed.

## Pylint

For Python, a tool called **Pylint** exists which will give us a good amount of
feedback on those sorts of problems, and it can be added as a VS Code plugin.

> If you want more details on Pylint, including how to use it outside of VS
> Code, you could read more about it [here](https://pypi.org/project/pylint/).

## Installation

If you don't already have it, go to your VS Code "Extensions" tab, search for
"pylint" and install the extension.

Once it's installed, make sure you have VS Code's "Panel" open which usually
lists tabs called Problems, Output, Debug Console and Terminal.

> If you can't see the Panel, go to VS Code's View menu -> Appearance -> then
> check Panel to enable it.

Switch to the "Problems" tab in the Panel and then open some Python code you've
written at an earlier stage in the course. You *might* see the Problems tab
update to show a list of red/orange ("must fix") and blue ("could fix") labeled
findings - the only reason you wouldn't see that would be if the code contained
no problems at all!

Spend a few minutes looking at some of the problems that have been found,
clicking on them to see them highlight the associated line of code, perhaps
searching online for what some of the messages mean. If you haven't got any
problems reported - congratulations! - you'll get a chance to see and fix some
problems in this next exercise.

## Exercise

Before starting this exercise, disable the Pylint extension and reload VS Code -
the extension will give you a button to do that after you've chosen to disable
it.

A [badly written file called lint_me.py](./04_resources/lint_me.py) exists which
you should go and open *but don't try to run it* - it won't do anything useful!
It's just there as an example piece of Python code for you to use with Pylint.
Open the file now and look through it.

How many problems can you see? Take a few minutes now to visually inspect it
yourself.

It's likely that VS Code's Problems tab will say:

> No problems have been detected in the workspace.

if you've got no other linters installed and enabled, and equally there are no
VS Code underlining of problems in the file either. But you may well have
already spotted some things that don't look quite right in lint_me.py...

Enable Pylint once again and inspect the Problems tab - you should now see
around 8 problems listed in there. If you don't see any and you weren't seeing
any before with your own code either, it's likely that Pylint isn't installed,
is disabled, etc. so go back and check that it's installed and running
correctly.

How many of those 8 Pylint problems were things you'd notice earlier? Hopefully
Pylint has been helpful and has found some things you hadn't spotted or didn't
previously know were a problem - if so, that's perfectly OK, as that's what
these tools are for!

Work through Pylint's reported problems for lint_me.py, fixing them as you go
and as you see fit. If you need to, do some online searching for `pylint CO304`
and similar to find out how to address them. Your goal is to get to zero
reported problems, but retaining as much of the code as possible. You don't need
to get the code to run correctly nor do anything "useful" - this is just about
getting it to pass in Pylint's checks by making minor corrections.

## Exercise Continued

By now, you should have a version of lint_me.py that Pylint thinks is
good-to-go! But is it?

Aside from the fact that there is no directory called "subdir" and no "foo.txt",
there are some other problems in here as well. The return from the function
isn't used by anything for starters, which doesn't make much sense. Also, if
"subdir" isn't found, we print some sort of error message but then try to return
a variable that was never assigned and so running the code would produce
something like:

```
% python3 lint_me.py
couldn't find the file or directory
Traceback (most recent call last):
[...]
UnboundLocalError: local variable 'contents' referenced before assignment
```

However, Pylint isn't complaining about these things. It's identified stylistic
things it doesn't like (e.g. the blank line at the end) and some critical
problems (e.g. the import of a module that doesn't exist) but there are some
other fundamental problems that it hasn't raised.

A linter is a valuable tool, but it will only get you so far. Much like some of
the accessibility tools from earlier in this module, one tool on its own is
good, a few that complement each other are better, but when they are combined
with a tester's own skills and abilities to analyse is when you're likely to get
the most value.

[Next Challenge](05_static_analysis_java.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F04_pylint.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F04_pylint.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F04_pylint.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F04_pylint.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F04_pylint.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

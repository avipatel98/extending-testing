## Using the Information

> Exercise: You have been tasked with planning ahead for the company's
> development of version 5. It's expected that 5.1, 5.2, 5.3 and so on will be
> produced over many months. By now, you have a suitable environment, acceptance
> criteria of "performance degradation of no worse than 5% compared with the
> previous version" defined and agreed across all of the metrics, and an
> appropriate set of test cases that have been reviewed. You decide to automate
> as much as possible.
> 
> What should happen when a metric worsens by more than 5%? Is there any
> variability in performance and would one 5.001% degradation be sufficient or
> would we need more confidence? If we're comparing version 5.1 with 4.2, what
> version are we comparing 5.2 against?

Whether we're automating all, some or none of our performance testing, we need
to think about what happens once we have data and results from that work.
Regardless of whether a bug is being raised, it's good practice to do at least
the following performance-testing specific steps:

* Summarise the findings - some written highlights of what's been found, perhaps
  which metrics have degraded and by how much.
* Present the data - think graphs and/or tables as a way to show the data in a
  format that's readable or reviewable (think: "[a picture is worth a thousand
  words](https://en.wikipedia.org/wiki/A_picture_is_worth_a_thousand_words)").
* Include the data - while your summary and graph might be accurate, preserving
  the data will allow for more graphs to be produced, for the data to be fed
  into something else for analysis, etc. and note that these things could be
  useful many months/versions later down the line.

It might be helpful for any unacceptable behaviour to trigger a test suite
failure or perhaps even a bug to be automatically raised reporting the finding.
But it might be difficult to work out exactly when to do that, even with the
acceptance criteria.

### Variation

Firstly, performance testing can often show variations in things like speed,
responsiveness, memory and so on even in environments that are isolated and not
being used by anything or anyone else. To show this, let's "time" how long a
search takes on your computer - we're going to use `find` on the command line as
our command, and `/usr/bin/time` to time how long that command took. Try the
following command for yourself - don't worry too much about what it is doing:

```
/usr/bin/time find / -maxdepth 3 -name "this-does-not-exist" 2>&1 | grep -v "Permission denied\|Operation not permitted"
```

You'll see something like the following returned:

```
        0.05 real         0.00 user         0.03 sys
```

That first `real` value is the amount of time, in "real time" seconds, that it
took to run the `find` command and get you the results (which is simply that it
wasn't able to find anything called "this-does-not-exist"). This looks great,
but try running it a few more times - the likelihood is that you won't see the
same `real` value each time, but instead you'll see some variation.

If you were trying to compare performance on your laptop for that command for
today with, let's say, yesterday then that variation is going to cause you some
problems if you were only taking a single reading each day.

While there are a few tactics, including using different metrics, further
"improving" the environment, etc. a common one is to run the performance testing
more than once in order to determine something simple like an average or more
complex including standard deviations and so on. From that, you should then have
a higher confidence that something has actually worsened.

### Compounds

Secondly, at what point do we get worried about the following:

* Version 5.1 is 2% slower than version 4.2
* Version 5.2 is 2% slower than version 5.1
* Version 5.3 is 2% slower than version 5.2
* etc.

noting that each of these performance degradations is well below the 5%
threshold of what's acceptable. Unfortunately, some quick maths:

> 1.02 * 1.02 * 1.02 = 1.0612

tells us that after just three comparisons of a 2% slow down each time, version
5.3 from above is 6.12% slower than we had in version 4.2. Just as [compound
interest](https://en.wikipedia.org/wiki/Compound_interest) can work in your bank
account's favour over time, compound regressions where subsequent versions are
acceptable compared with the previous one, aren't acceptable overall are
something you may need to consider in your analysis and reporting of performance
testing results.

### During vs Final

Lastly, it may not be the case that there's some "final" figure. While you could
take a reading of memory usage right at the end of performance testing, it might
be more valuable to have a profile of memory usage during performance testing.
For example: are there points in time where the memory usage spikes, compared
with a previous version of the product where there was no such behaviour?

If you're in a situation where there's no final value to look at and compare,
you might have to do things like averaging metrics over time, looking at maximum
and/or minimum values, or even taking readings of those metrics at different
points e.g. when individual tests are run.

### Conclusion

There's no continuation of the exercise this time! Depending on your situation
and context, you may need to take care when and how you're looking at the
metrics, as well as what you're comparing them against.

In a lot of the cases, it's a case of looking at metrics over time in order to
build up a better picture of what's going on, but it also may be the case that
the performance testing itself is built up over time, as more things are
learned, more needs discovered, and better ways emerge of looking at what's
going on.

[Next Challenge](08_exercises.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F07_using_the_information.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F07_using_the_information.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F07_using_the_information.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F07_using_the_information.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F07_using_the_information.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

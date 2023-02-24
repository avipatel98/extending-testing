## Coverage

> Exercise: You have once again been tasked with performance testing another new
> version of the product, 4.2 this time. By now, you have a valid, independent
> and stable test environment, this and the previous 4.1 version installed on
> it, and a list of metrics of interest (for both information and checking
> against acceptance criteria and thresholds). You run some tests - login,
> opening pages, doing some happy path actions and so on - before reporting back
> that the performance looks the same across the versions.
> 
> How confident are you that the system performs acceptably under load? Is there
> anything you could be missing?

We've seen before that there are an inexhaustible number of defects to uncover,
requiring risk-based and/or context-driven testing to determine what tests to
run, and what of those we run first.

Performance testing is no different - you won't be surprised to hear! Just
because you've run some performance testing with particular cases or scenarios,
doesn't mean that the same performance would be observed with other scenarios.
It only takes one missed edge case which a customer decides to do themselves
later on in live, for the performance to suddenly become a temporary or more
long-term issue.

With these tests likely to be expensive (cf. end-to-end tests costs), choosing
how to get appropriate coverage of different scenarios but at an efficient
costs, is likely to be necessary. You can't run everything, so once again you'll
be choosing what to run based on factors such as risk or giving appropriate
coverage, say across all the different parts of a site.

In addition to different cases, you might have over environmental concerns to
include - perhaps your system under test can be installed on customers' premises
and hence performance testing needs to include different operating systems or
server capabilities. The list of possibilities is endless, so work with the team
and relevant stakeholders to determine what is *appropriate in your context*.

<!-- OMITTED -->

coverage and test cases

* Factors: from the earlier examples, other factors like the number of users or
  what actions/operations are being carried out can make up a large piece of the
  puzzle around performance testing. There's overlap with environments here too,
  as those can be both important factors to consider when setting up, but might
  be something to vary during the tests as well (e.g. different OS versions,
  different AWS instances' capabilities).

* test cases and coverage - maybe it's just N users, but it could be more
  complicated than that so how do you pick which cases to do; time is a
  consideration as it's an e2e test and these things tend to be slower/more
  costly

> Exercise continued: After discussion with the team, you create a lot more test
> cases for the particular environment you have and then redo the performance
> testing. A few of the new scenarios uncover a new critical issue - which you
> dutifully report as a bug with all the relevant details. You're now working
> out what to do in terms of preserving ideas for future performance testing -
> what of the original cases that passed, new cases that passed, and new cases
> that identified an issue should be re-run, say when version 5.1 is being
> developed?

<details>
  <summary>Click here for our thoughts on this part of the exercise.</summary>

Given some of the new cases did uncover something critical, you are likely to
want ongoing coverage to make sure that eventual fix for the bug you raised
doesn't regress at some point later on.

Whether the other new cases which didn't find anything are worth including or
not, really depends on your particular situation. At this point, peer reviews
with other testers and the team might be advisable if an appropriate way forward
isn't clear, so there's some visibility of the work, some agreement and shared
ownership of the end decision that's taken.

If you're wondering about the fact that a *lot* more cases were added, we might
be concerned about that as well. It might be that it was appropriate in that
situation to *defocus* the test efforts in order to help generate some new
ideas, but that now with a wealth of those new ideas, it would be worth
*focusing* in again on those that are worth preserving for future runs.
</details>

[Next Challenge](07_using_the_information.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F06_coverage.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F06_coverage.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F06_coverage.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F06_coverage.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F06_coverage.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

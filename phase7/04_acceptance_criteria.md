## Acceptance Criteria

> Exercise: You have been tasked with comparing the performance of two versions
> of some software, 2.1 and 2.2, in an isolated environment that's been
> determined to be suitable for performance testing. It contains an appropriate
> amount and structure of customer-like data, and has capabilities previously
> determined to give representative feedback on what the performance might be
> when deployed to live. You run the tests once and find that 2.2 is 8% slower
> than 2.1.
> 
> How would you go about handling those findings? Would you go straight to the
> stakeholders and/or developers? Are there more tests that you should run? How
> bad is this outcome?

In other types of functional and non-functional testing, **test oracles**
providing guidance on what is acceptable or not are what you're utilising to
determine whether a test has passed or failed. Those could range from functional
specifications, to Web Content Accessibility Guidelines, to your own experience
and expectations developed from using other similar products.

For performance testing, acceptance criteria are just as important. Finding out
whether performance has degraded in some way is just one part of the process -
determining how bad those outcomes are, what the impact/risk is, and what to do
about them, has to happen afterwards. Ensuring you have some sort of definition
of what's acceptable and what's not is crucial for you to determine how to
interpret the data.

Once you have some sort of defined threshold, for whatever metric or metrics are
of interest (see below for more on metrics), you're in a position to interpret
the performance test data and outcomes and give feedback. If you're automating
both the running of your tests and the interpretation of the outcomes, this
threshold of what's acceptable is something that can be used to trigger a
failure in a test suite.

*Tip*: if there's no clear guidance from a stakeholder around acceptance
criteria for performance, you might look more to stress testing first and report
on the uncovered limits as a way to start a conversation around what is and what
is not *acceptable*.

> Exercise continued: You get some clear guidance from the stakeholders that a
> small degradation of up to 5% would be acceptable, given the huge number of
> new features and contract-winning functionality that version 2.2 will bring.
> You decide to re-run your tests another couple of times and find that after
> the 8% degradation, the next runs show 6% then 4% degradation. What would you
> do next?

<details>
  <summary>Click here for our thoughts on this part of the exercise.</summary>

There's enough in those three runs to suggest we're around or above what's been
stated as acceptable, that the stakeholders should be informed. If they decide
that ~5% isn't sufficiently concerning, that's their call to make.

If you're wondering why each run is reporting a smaller amount of degradation
each time:

* 8% for the 1st
* 5% for the 2nd
* 4% for the 3rd

that's something we might suggest looking into as well. Perhaps there's some
slowness on the first time it is run while things are being initialised, and
reinstalling the software before each run of the performance tests (or doing
some steps that initialise things before starting performance tests) might give
more consistent readings across the runs.
</details>

[Next Challenge](05_metrics.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F04_acceptance_criteria.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F04_acceptance_criteria.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F04_acceptance_criteria.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F04_acceptance_criteria.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F04_acceptance_criteria.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

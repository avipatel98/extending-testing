## Environments

> Exercise: You have been tasked with running some load performance testing of
> version 1.2 of some software which is intended to replace version 1.1,
> currently deployed to the live/production environment and being used by
> customers. The stakeholders would like to know a comparison of the new
> version's performance with the old version.
> 
> How do you work out the current version 1.1 performance on live? Where do you
> install or set up version 1.2 to run performance testing on that? What sorts
> of problems could the options available to you cause?

Environments play a huge part in the performance of software. A piece of code
running on some modern MacBook will show one speed, but when run on a 2010
MacBook Air - much less powerful - is likely to show much worse performance.
Similarly, live or production environments are often more capable, expensive,
etc. compared with what might be available or cost effective to give to a test
team.

It's rare that you'll be asked to run performance testing on a live environment.
Imagine what would happen if you started stress testing on live, where vital
customers were working! But the live environment may well have particular traits
which aren't the same in test environments - along with the capabilities as
mentioned above, there's also the possibility of specific configurations done
for the live environment, as well as different data specific to those customers
and users.

Finding a way to ensure the performance tests you're running are valuable, for a
given environment, is a very important consideration. With reference to the
exercise, here are some tactics you could consider employing, which might be
good ones in particular contexts:

* You could look at the performance on live before and after the new version is
  deployed, but not actively run any tests yourself, instead relying on "normal
  usage" to add some load to the system. Some drawbacks are that you'd only find
  out the performance comparison after deploying, and also that "normal usage"
  might not be entirely consistent so would need monitoring along with the
  performance.
* You could choose to install both versions on different environments away from
  live, then compare the performance observed on those environments. While that
  might give you a relative comparison (i.e. in that environment, version 1.2 is
  50% slower than version 1.1) it's not guaranteed to be reflected when deployed
  to live. It might however provide enough of an indication of problems or
  sufficient confidence to go ahead.
* You could create a "copy" of the live environment with the same capabilities.
  Not only could cost be a concern, but also maintaining that environment over
  time such that it matches live, and also what data exists within it might not
  match what's in live either.

Environment selection and setup is a complex but critical consideration in
performance testing. Most importantly, you need to be aware of the risks and
drawbacks of decisions you make around what to test, where and how, so that you
can mitigate what you can, and provide feedback with appropriate caveats.

> Exercise continued: You decide to install 1.1 and 1.2 on a shared test team
> server you have available. You then run performance testing on each version in
> turn, finding that 1.2 is 50% slower. What would be in your report back to the
> stakeholders - what would you tell them you'd done, why, what findings, and
> what risks would you talk about as well?

<details>
  <summary>Click here for our thoughts on this part of the exercise.</summary>

We might suggest including at least these details to the stakeholders:

* What testing was run, with what versions
* That it was run on a different environment to live and roughly how it might
  compare or differ (e.g. 1/10th as powerful, dummy customer data only)
* That a 50% speed degradation was observed
* Tests could be repeated (if time) which might give more confidence in the
  findings, or different tests run, etc.
* A level of confidence in the findings, noting that while it could give an
  indication of relative performance between the versions, it's not certain the
  same would be seen in live

If you're wondering about the issue with the server being *shared* by the test
team, that's important too - perhaps the load on the server wasn't consistent
during performance testing due to other testers using it for other jobs, skewing
the observed performance...
</details>

[Next Challenge](04_acceptance_criteria.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F03_environments.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F03_environments.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F03_environments.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F03_environments.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F03_environments.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

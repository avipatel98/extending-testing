## Metrics

> Exercise: You have been tasked with checking the performance of a new version
> of some website, version 3.2, is no worse than version 3.1. You've been given
> some performance test data and outcomes from a previous set of tests run
> against version 3.1, which was done in the same environment and under the same
> conditions as you're going to use for 3.2. During your performance testing,
> you find that most of the time the pages load quickly but sometimes there's a
> delay that wasn't previously observed and the memory usage in the environment
> at the end is unusually high.
> 
> Are the occasional dips in performance that important? Could there be other
> interesting details beyond responsiveness and memory you're not currently
> seeing? What's worth feeding back, to whom, and for what reasons?

Note that it's not just something like the speed or responsiveness that matters.
While that metric might be extremely important to someone like users and
stakeholders, other metrics like memory usage or other internal measurements
might be equally important to someone like a developer.

For example, an increase in measured page file reads and writes might not be
coupled with an overall performance degradation, but if there's a 50% increase
in those metrics and this is something the developers want to be informed about,
that's very important to feed back - maybe it's indicative of a future problem,
or could be improved to actually improve overall performance.

You should try to work with the developers and stakeholders to determine what
metrics should be measured, but you may also need to look for interesting and
relevant metrics, depending on the situation.

In terms of measuring the metrics, it's important to realise that monitoring
those metrics during the performance testing is probably going to be necessary.
Sometimes, outcomes or behaviours like a server crashing are quite obvious, but
things like CPU usage would be better examined throughout or at particular
moments/intervals.

Another consideration may be your access to those metrics in the first place.
Again, we come back to the notion of **testability** and whether all of the
important metrics are measurable or accessible. Routes to access the data can
include logging, OS-level monitoring of processes, through to
application-specific reporting of internal metrics to be analysed and checked.
While we won't go into this topic any further, this begins to touch upon
[software observability](https://en.wikipedia.org/wiki/Software_observability)
and the ability to capture that internal information.

> Exercise continued: After reporting back the memory usage to the developer,
> they recommend you re-run the tests and monitor it over time. Again, you
> observe occasional delays when loading pages and this time you're able to
> produce a graph of the memory consumption which shows spikes at certain
> intervals. The developer analyses your findings and notes that, while it's a
> valid and good observation, there's nothing sinister in this particular
> instance and it's due to the addition of some new functionality. At this
> point, what would you feed back to the stakeholder? What would you note down
> for future performance test activities?

<details>
  <summary>Click here for our thoughts on this part of the exercise.</summary>

The dips in performance could be an issue. While there might not be an overall
or consistent unacceptable degradation in performance, the dips were not
observed with the previous version and warrant some review.

Also, while the memory increase wasn't important this time, it could be in the
future. The developer considered the finding valuable enough to analyse and dig
into what was going on, so it might be worth continuing to monitor that in
subsequent runs. Just because it wasn't signalling a major issue this time,
doesn't mean it wouldn't next time.
</details>

[Next Challenge](06_coverage.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F05_metrics.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F05_metrics.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F05_metrics.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F05_metrics.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F05_metrics.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

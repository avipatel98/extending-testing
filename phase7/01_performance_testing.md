# Performance Testing

We'll start with a story...

Imagine a team has built a website. It's full of helpful functionality that
really benefits the users, it's accessible, well-documented and has been
carefully penetration tested. It's not perfect and bug free - we know by now
that's not possible! - but it's looking really promising, so it gets deployed to
production, the company sends out a notification to their customers and they are
let loose on the site.

The site unexpectedly crashes in the first few minutes. Various teams scramble
to get it back online and, while it doesn't crash straight afterwards this time,
reports come in from users that it's pretty slow to respond with clicks to new
pages taking over 10s. As the day progresses and the teams ponder why it's slow,
new reports come in that it feels like it's getting worse. Then, it crashes
again.

## More Non-functional Testing

Another non-functional characteristic of a product is its performance and hence
*performance testing* might be another important consideration for those who
care about quality.

## Why we do it

The easiest way to start to understand more about performance and performance
testing, is to look at the motivations behind it and the sorts of risks and
problems we're trying to uncover.

Performance testing is done in order to help guard against things like sites
running slowly or coming down completely. Like the other types of testing, it's
designed to uncover information about the thing under test - perhaps the thing
we're testing fares less well under certain conditions, or there are hints at
memory leaks, etc. and importantly *what* causes those things to occur.

Performance testing might generally look at things related to speed and time,
but as we'll see at the end of this page, there are often other factors worth
considering as well.

## Variants

There are a number of different variants or types of performance testing. Here,
we'll discuss three of the main ones - **stress**, **load** and **soak** and how
these all relate to the, rather catastrophic, example scenario above.

### Stress

Stress testing is the most extreme of the three. It's essentially designed to
determine what the potential operational capacity is, by stressing the system
until it reaches a breaking point.

One might imagine that someone has tested car tyres by increasing the pressure
until they explode - after which, given the limit you can then more fairly
determine an appropriate maximum pressure (probably way below its determined
limit). If you found after stress testing that it couldn't cope with what might
be considered a "normal" pressure, you've got a serious problem with your tyre
design/manufacturing. You could also think of the pressure limit as a type of
boundary value.

With our crashing/slow website earlier on, a large number of users all logging
in at the same time - right after the notification went out - is likely the
cause behind the server crashing. Stressing the server before it went live to
determine how many users it could cope with logging in at the same time, may
have given some useful information, but perhaps knowing how many users were
expected would have helped determine whether the capacity of the system was
sufficient.

Stress testing can help tell us our limits and also how at risk we are of
encountering a serious problem.

### Load

Load testing is the more gentle and normal of the three, but is still vital.
Simply put, load testing tests with what's expected to be a "normal" load. This
could be a number of users, number of requests, both, or anything else relevant
to a particular thing under test.

A wheelbarrow used by bricklayers will almost certainly have some stress limit
where the whole thing collapses and breaks the wheel(s). Knowing how many bricks
can logistically fit into the wheelbarrow and whether that *load* causes any
problems, including whether the wheelbarrow can be picked up and rolled
forwards, might be a good load test of the product.

Our crashing/slow website seemed to struggle to respond quickly once users were
finally logged in. A 10s response time for navigating the site is probably below
what would've been considered acceptable! If some load testing had been run
beforehand, let's say with the number of users on the notification being sent
out, we might've been able to see that under normal load, the system wasn't
acceptably responsive and usable.

Determining expected load can be a difficult thing. Sometimes, working from some
acceptance criteria (e.g. our website must support up to 100 concurrent users)
is enough to test with and report against. Determining expected or acceptable
performance can be just as difficult! We'll come back to this again in the next
page.

### Soak

Soak testing is a sort of sub-category of load testing in that it too uses a
normal or expected load on the system. Its angle though is to look at what
happens over time.

The home furnishings manufacturer IKEA used to have glass booths in some
showrooms of robots mimicking typical human behaviour of sitting down into
chairs. These robots would press down into the chair with some padded-robotic
arm with the action repeated over and over again, tens of thousands of times, to
demonstrate that under *normal load* of say, an averagely-weighted human, their
chairs wouldn't break for tens of thousands of uses.

Once more, returning to our crashing/slow website, soak testing may have helped
us determine what happens over time. Sure, we managed to get all the users
logged in eventually and using it - albeit slowly - but seeing the
responsiveness of the site degrade over time indicates some sort of problem such
as a memory leak. The more operations that are done, the more memory is leaked,
and the less resources the hosting environment has to dedicate to running the
server, and the slower it gets.

A single check that N users (or whatever) is feasible is one thing. Checking
that it's still feasible and the system behaves the same way 1, 10, 100 hours or
whatever later, is where soak testing comes in and adds its own value.

## When & Who

Performance testing often requires more of the system to be put together and is
hence often part of end-to-end tests, but it doesn't have to be. You could
imagine thinking about and testing the performance of a single component,
looking to see whether its design is optimised or whether there's a more
efficient algorithm.

Performance testing is often done by testers, but developers, IT teams and
others can also do it or be heavily involved both in terms of planning and
design, as well as execution and the later analysis of the findings. Unlike
exploratory testing and other activities where you could get someone like a
stakeholder involved with some guidance on *how to*, performance testing usually
requires more time to set up, run and analyse, as well as some technical or more
specialist knowledge.

## Tools

Tools could be third-party (e.g. JMeter, which we'll discuss later) and/or ones
that have been developed in-house for specific jobs. They could also be for
running the tests, and/or for monitoring the behaviour, and/or for creating some
of the load or stress in the first place. Testing your system can cope with 100
users should make you think "automation!" rather than trying to find 99 willing
friends or colleagues.

## Profiling

We saw in an earlier module that the metrics around testing aren't always that
simple and it's sometimes the same with performance testing as well. It's fair
to say that "performance" as a term usually relates to things like speed, but
we've already seen with the website that there's more than just whether it is
responsive - there's a question of whether it's stable in the first place, but
also around memory usage and that memory leak.

*Profiling* is an activity frequently related to performance testing which gives
you more information about the system and how it's behaving. Sure, the thing
you're testing might be running slowly but you'll possibly need to know more
about why it is running slowly. If you can see more detailed information on the
product and/or environment on which it is running, you might be able to give
more information to the developer(s) in your bug report.

> Note: profiling can also be run to look at code performance too (e.g. duration
> & frequency of a function call), using a code profiler.

Profiling might be done after the event, perhaps by looking through log files or
anything else into which data has been written that would give an insight into
the *profile* of the system while it was being tested. Profiling can also be
done during the event, such as by inspecting `top` at the command line or
through to profilers by third parties or built in-house.

[Next Challenge](02_considerations.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F01_performance_testing.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F01_performance_testing.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F01_performance_testing.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F01_performance_testing.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F01_performance_testing.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

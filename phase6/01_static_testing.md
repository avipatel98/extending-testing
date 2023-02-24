# Static Testing

"Static testing" is an activity that doesn't involve *running* any code. It
encompasses a lot of different test activities - some of which you've already
been doing, so there will be some familiarity! You've reviewed a test plan,
looked through existing code to spot problems and looked at a program
specification for things like ambiguities or lack of clarity.

You'll notice that none of those activities require any code to be run or
executed. It's this distinction that separates *static* testing from *dynamic*
testing, where code does need to be run in order for the testing to occur.

## Exercise

Set aside 5 or 10 minutes to think about all of the sorts of testing activities
you've been doing up to this point. Start writing down a list of those that
didn't require any code to actually be run, but you were still *testing* in some
way. Note that things like "writing a test plan" isn't doing testing, so doesn't
come under either static or dynamic testing.

<details>
  <summary>When you're done, click here for more examples!</summary>

There are lots of things that can be tested in a static manner - they're
essentially all in written form, and are mostly documents that are being
reviewed:

* Specifications (of any type)
* User requirements
* Manuals
* Test Plans
* Setup steps/guides
* Code

If that last one - code - seems unexpected, remember there's a big difference
between inspecting/reading/reviewing code, and running the code. The former
still counts as static testing as the code isn't being run, just looked at.
</details>

## When do we do static testing?

Simply put, static testing can be done at any time there's a piece of
documentation-like material which can be inspected, reviewed and *tested*.

Static testing can be done later in the development cycle. Sometimes it's
absolutely necessary because the materials it's testing are produced later on,
such as user guides and manuals.

Static testing can also be done very early in the development cycle - and
probably *should* be done early, too. Any time there are materials like user
requirements written down or a functional specification, those can be tested. In
earlier modules, we've spoken about the benefits of testing earlier in the
cycle, as that can provide earlier feedback which is usually cheaper and/or
easier to fix...

We're already moving onto some of the "Whys" of static testing, so let's switch
away from the "Whens" and over to that instead!

## Why do we do static testing?

We already know one reason - it's because we can do it early on some things, and
anything we can catch earlier is usually going to be cheaper and/or easier to
fix than if we'd have discovered the problems late on in the project instead. If
we can review the functional specification and resolve an ambiguity that would
otherwise have remained hidden until late on, uncovered by end-to-end tests, all
we need to do is fix something simple in a document... rather than unpick lots
of complicated code.

It's also possible that static testing more easily finds some particular defects
than dynamic testing. To continue with the functional specification ambiguity
from above: perhaps it's obviously an ambiguity when reading the document, but
maybe the defect is in some difficult/costly to execute piece of code so you'd
be less likely to stumble across it by functional testing.

It's worth noting that the two testing types - static and dynamic - complement
one another, as they more easily uncover different types of defects. Just
because there's no code written yet in a particular project, doesn't mean that
your testing skills aren't usable yet - speak up in meetings to ask "what if?"
questions, help the team have conversations about quality, and also find some
materials and get static testing!

## How do we do static testing?

You'll be learning about some ways in which you can do static testing in the
rest of this phase. This will include reviews of materials like documentation,
as well as introducing some tools to support that test activity. We'll also be
looking at how to static test the code itself - a term called "static analysis"
which we'll introduce and then do towards the end of this phase.

[Next Challenge](02_reviews.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F01_static_testing.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F01_static_testing.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F01_static_testing.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F01_static_testing.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F01_static_testing.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

# Tools

The previous section looked at reviews - manual, human-lead efforts involving
inspecting documents or other materials, perhaps with some guidelines such as
looking at it from different perspectives or having a checklist of things which
should be present.

It's also possible for tools to be used to do some sort of review as well. It
shouldn't surprise you to learn that, yet again, those tools can be used in
combination with a manual review, as they're likely to uncover a different set
of problems.

## Text Tools

Spell checkers and grammar checkers are useful automated tools for doing static
testing, and you'll almost certainly have used them at some point in the past!
These tools quickly spot defects of the spelling or grammar variety, providing
quick feedback to a user and often with suggestions of how to resolve problems.

Much like bug reports with different levels of severity, these tools often label
what's been found as either "wrong" or "advisory" - you may sometimes see red
underlining on the former and blue on the latter, allowing a degree of decision
making to come in regarding at least the latter ones.

If you are asked to review a document, it's probably worth running some sort of
checker rather than make a - potentially incorrect - assumption that the author
will either have done so manually, or have one automatically configured to run.
But take care: these tools still can't find everything e.g. a typo in a
particular context could be a correctly spelled word in others.

Tools like these can be built into pipelines. For example, if the author of this
page has introduced a typo while writing this paragraph, after committing and
doing a `git push`, an automated spell checker will run on GitHub actions and
report its findings, so that the author can address the problem.

## Code Tools

In the first page in this phase, we mentioned that looking at code still counts
as static testing, so long as we're not running it. Naturally, there are tools
to support the static testing of code in the same way as there are tools to
support static testing of text-based documents.

Tools which do this work are called **static analysis** tools (or sometimes
static code analysis tools), and are a subset of the overall static testing
topic we're covering in this phase.

These static analysis tools are tailored to specific languages and, where
different tools cover the same language, can find different types of issues and
so it *may* be beneficial to not just rely upon one. A bit like having more than
one tester looking at some functionality, different perspectives, viewpoints and
approaches can help find new issues.

The static analysis tools can be thought of as covering two distinct areas:

* stylistic concerns i.e. compliance with coding standards, inconsistencies that
  could later lead to errors
* coding concerns i.e. bugs and programming flaws

We'll talk about both of these, for tools useful with both Python and Java, in
the next pages.

[Next Challenge](04_pylint.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F03_tools.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F03_tools.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F03_tools.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F03_tools.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase6%2F03_tools.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

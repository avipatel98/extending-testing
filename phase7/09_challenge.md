# Challenge

This is a process feedback challenge. Now that you have been able to generate
some performance data from the site's News page and view the graph, you can
begin the challenge and start recording your video for submission.

## Warnings

1. CSV files which JMeter writes to are created if they don't already exist, but
   are **appended to** if they do exist. If you want to re-run a test, either
   make a new CSV file or delete the old one first.
2. If and when you're starting requests at the same time, you might find your
   CSV file contains unordered data, producing some "interesting" line graphs!
   If that happens, you can sort your data by the values in the first column
   with something like the following command, then using the new sorted file
   contents in `10users_0s_sorted.csv` for your input to `gnuplot`:

```
tail -n +2 10users_0s.csv | sort -t ";" -k 2,2 | cat <(head -1 10users_0s.csv) - | tee 10users_0s_sorted.csv
```

## Challenge Details

For the video submission, work through the following steps:

* Review the graph you generated in the previous page - talk on the video about
  what's interesting about it, how does it compare with the screenshot Makers
  provided as an example, and perhaps speculate as to what might be going on?
* For each of the new tests below, in turn (noting that test_id=0 is the one
  you've already done):
  * Before running the test, say what you think might happen and what you might
    expect to see in the new graphs that are generated. It doesn't matter if you
    get this correct - you're forming a hypothesis of what might happen, before
    testing it.
  * Update your command to generate a new CSV filename for the data.
  * Run the test.
  * After running the test, analyse the data (e.g. by plotting a graph, sorting
    the data if needed - see above) and talk on the video about what you're
    seeing, what's changed from the previous test(s) and what the data might be
    telling you.
* At the end of the four tests below, speculate on what type of performance
  testing you have been doing, and what tests you might consider running next.

| test_id | threads (users/requests) | `rampup` (s) | |
|-|-|-|-|
| _0_ | _10_ | _10_ | _you've already run this one_
| 1 | 10 | 0 |
| 2 | 100 | 10 |
| 3 | 100 | 0 |
| 4 | 1000 | 0 |

> We're not expecting perfect performance testing data analysis and total
> comprehension of what's going on in the back-end of the website during this
> challenge!
> 
> But we do want to see you inspecting the data, highlighting
> anything that's surprising or unexplained, looking for trends within a single
> test, and comparing outcomes of tests with other outcomes.

[After you're done, submit your
recording](https://airtable.com/shrNFgNkPWr3d63Db?prefill_Item=et_as05).

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F09_challenge.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F09_challenge.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F09_challenge.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F09_challenge.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase7%2F09_challenge.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

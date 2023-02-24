# Postman Challenge

**This is a process feedback challenge.** That means you should record yourself
doing it and submit that recording to your coach for feedback. [How do I do
this?](https://github.com/makersacademy/golden-square-in-python/blob/main/pills/process_feedback_challenges.md)

Using your current knowledge of Postman, together with the 
[Restful Booker](https://restful-booker.herokuapp.com/) documentation, record 
yourself completing the following steps using this API:

_**Reminder:** If you're unlucky, the Restful Booker website might reset its 
database while you're working through these steps. It's a good idea to keep your
tabs open, so that you can easily repeat requests if you find that your data has 
vanished._

1. Make a request to the Create Booking (JSON) endpoint, changing the default 
body payload to include your name, the dates that you want to stay, and the 
price that you want to pay.
2. Look at the response from the Create Booking endpoint, and find the unique
`bookingid` value in the response.
3. Send a request to the Get Booking endpoint, modifying the URL's path variable 
to reflect the booking ID which you just created, and confirm that you 
are able to retrieve the booking.
4. Send a request to the Delete Booking endpoint, and see if you can delete the 
booking ID that you just created. (Spoilers, it's not going to work - what do 
you see in the response?)
5. In order to successfully use the Delete Booking endpoint, you need to 
generate an authentication token via the Create Token endpoint. Then, within 
the `Headers` tab of the Delete Booking endpoint, change the cookie value from 
`token=abc123` to `token=YOUR_GENERATED_TOKEN`.
6. Now try to submit the Delete Booking request again. This time, it should be 
successful (as your authentication succeeded).

After you're done, [submit your recording here.](https://airtable.com/shrNFgNkPWr3d63Db?prefill_Item=et_as04)

## Summary

We've seen how to perform requests within Postman, utilise dynamic data, and 
evaluate the response data. But wouldn't it be great if we could evaluate those 
responses automatically? Next, we'll move on to show you how to write tests 
directly within the Postman interface.

[Next Challenge](09_automated_api_checks_with_postman.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F08_postman_challenge.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F08_postman_challenge.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F08_postman_challenge.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F08_postman_challenge.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F08_postman_challenge.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

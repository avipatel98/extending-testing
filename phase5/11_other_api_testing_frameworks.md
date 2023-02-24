# Other API testing frameworks

Postman might be the most popular API testing tool, but that doesn't mean that 
it's the only one, or necessarily the best one for any given situation. 

* There are other direct competitors in the marketplace, such as 
[Insomnia](https://insomnia.rest/).
* There are other tools and extensions which can help you to make API requests 
and view their responses, such as the [REST Client extension for VS 
Code](https://marketplace.visualstudio.com/items?itemName=humao.rest-client).
* There is language-specific tooling which is focused on checking the behaviour 
of APIs, such as [Rest Assured for Java](https://rest-assured.io/).
* Playwright can be [configured for API 
testing](https://playwright.dev/java/docs/api-testing) so that it makes direct 
HTTP requests, rather than opening a browser.

However, keep in mind Maslow's famous adage: _"If all you have is a hammer, 
everything looks like a nail."_ Make sure you pick a tool which is suited for 
the job you need, rather than trying to manipulate something which isn't really
fit-for-purpose. For example, whilst it's technically possible to test API 
endpoints via Selenium, it will still attempt to access these through its web 
browser context, and it doesn't expose the same granular response data as the 
other tools that we've discussed. (Further reading: [Selenium API Testing: Is 
It Possible?](https://www.blazemeter.com/blog/selenium-api-testing))

## Summary

We've learned a little about the distinct challenges of testing (and getting 
visibility into) APIs, and we've looked at some of the tooling which can help 
to make these tasks easier. Now that you've got these skills in your tool belt, 
try to create the opportunity to practice them in your everyday work.

[Next Challenge](12_extensions.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F11_other_api_testing_frameworks.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F11_other_api_testing_frameworks.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F11_other_api_testing_frameworks.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F11_other_api_testing_frameworks.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F11_other_api_testing_frameworks.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

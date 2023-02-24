# Introduction to APIs

In the Web and Cloud modules, you learned about the fundamentals of how web 
traffic operates. We might simplify this as follows:

* Your computer makes a **request** for a particular resource.
* The typical HTTP method for this request will be either `GET` (a simple 
request to load a resource) or a `POST` (which sends an accompanying payload 
of data, for example when a user submits a form).
* The request is received by a **web server**, which handles the request within 
its application code, and decides what it is going to send back.
* Your computer receives a **response** to this request - this will include a 
**response code** (e.g. 200 "OK", or 404 "Not Found") and a **response body** 
(the content of the resource that you requested).

Often we want more clarity in what we're requesting, and more certainty of what 
we'll get in return. This gives us predictability, controllability, and 
hopefully also makes it easier to test. The most popular way of doing this is 
via an **Application Programming Interface** (API for short).

## What is an API?

A web API is a defined **interface** which specifies a series of **endpoints** 
(generally expressed as URLs, how a request should be made (including whether 
it's a `GET` or a `POST`, and details of any mandatory/optional request 
parameters) and an equivalent format for the response (i.e. what data 
attributes will be returned).

Typically (but not always!) an API's request/response data is exchanged in 
JSON format; for example, if you requested `GET /cars`, a small part of the 
response might look like this:

```json
[
  { 
    "make": "Aston Martin",
    "models": [
      "DB5",
      "DB7",
      "Vanquish"
    ]
  },
  {
    "make": "Lotus",
    "models": [
      "Elan",
      "Elise",
      "Esprit"
    ]
  }
]
```

This gives your application developers some degree of predictability when they 
are implementing features. For instance, if they are building a webpage to 
display a list of all cars, they can imply the following whenever they make a 
request to the `/cars` endpoint:

* The response will be returned as an array, in JSON format.
* Each item in the array will have a `make` (a string containing the make of 
car).
* Each item in the array will have a `models` property (an array, containing a 
list of strings representing this manufacturer's models).

At this point, it doesn't matter whether you have 2 or 200 makes in your data 
set: you understand the data structure, so you can produce code which is 
capable of handling any dynamic volume of data which might be returned.

## Client-Server Model

Web APIs use HTTP (HyperText Transfer Protocol) for their communication and HTTP
operates according to a _client-server model_. A client is responsible for
making a request and a server is responsible for responding to the request via
by creating and sending back a response. The client-server model has a few
important properties in terms of HTTP, one of which is it's the client that's
always responsible for initiating things - a server can't just ad hoc send a
message to a client of its choosing!

If for now we assume that there is a single server involved, say a server that's
serving a particular URL, it's possible for there to be many separate and
distinct clients which are making requests (or could make requests) to that
server.

Not only can there be many clients, but those clients can be of different types.
If you imagine a URL for something like the BBC news website, there can be many
Firefox browsers around the UK navigating to that site (and therefore making
requests and getting responses - the news - back from it), but those could be
different browser version, different vendors, on different operating systems...
or maybe not even browsers in the first place.

For now, pick a browser of your choosing and navigate to
https://reqres.in/api/users/1. What do you see returned? What structure is the
data in?

## Public v Private

When we talk about APIs, we often talk in terms of them being either **public** 
or **private**:

* A **public API** is one which, as the name suggests, is built (and documented)
in such a way that it can be utilised ("consumed") by the general public, or 
more commonly by developers of other applications. For instance, if you wanted 
to display the latest weather on your website, you could build your own weather 
prediction software (which sounds time-consuming), or you could utilise a 
publicly-available weather API (such as 
[OpenWeather](https://openweathermap.org/api)) to get the relevant data for 
you.
* A **private API** behaves in a similar fashion, but it's designed purely for 
internal use. It may still be well-documented (so that your developers know how 
to consume it), however they serve a particular purpose for your application 
which doesn't warrant publishing for public reuse. For instance, while your 
application might have a public API endpoint called `/register`, a request to 
this endpoint might also generate a range of private API requests; for instance, 
a private `/add-user-to-database` endpoint might be useful in a given stack, 
but you don't want your customers to be doing database insertions themselves!

Note that just because we refer to these as "public" and "private" APIs, this 
doesn't imply anything about their authentication or security. It's possible 
that a public API may still require a username/password (or a user token) in 
order to utilise it, or it may have both free and paid tiers, with restrictions 
on usage (e.g. maximum 100 requests a day on the free tier).

Similarly, a private API doesn't necessarily _require_ authentication - 
although this is generally good practice, because if you're building something 
purely for internal consumption, authentication gives you some degree of 
certainty that it's really only being used by the people that you expect.

## Exercise

1. Take a look at [this huge list of public APIs from 
GitHub](https://github.com/public-apis/public-apis), and find one which sounds 
interesting to you.
2. Click on the name of the API to go to its website or its GitHub repository. 
Evaluate whether the documentation seems useful:
 * Can you tell what endpoints are available (what functionality is offered)?
 * Does the API require authentication?
 * Are there any restrictions/limits on its usage?

Feel free to repeat this for a couple of other APIs in the list, to get a feel 
for how well-documented (or not!) these APIs might be.

## Summary

APIs are helpful for setting expectations around the sending and receiving of 
data payloads, allowing engineers to create and consume data within 
applications with a degree of confidence about the format of data that they're 
dealing with.

Given all of this new terminology, you might assume there are specific 
tools and strategies associated with testing APIs - and you'd be absolutely 
correct! We'll look at some of these in the coming exercises.

[Next Challenge](02_using_curl.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F01_introduction_to_apis.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F01_introduction_to_apis.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F01_introduction_to_apis.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F01_introduction_to_apis.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase5%2F01_introduction_to_apis.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

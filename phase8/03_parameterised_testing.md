# Parameterised Testing

In the previous section, you learned about one of the two main building blocks
of data driven testing - how to load data from a file. In this section, you'll
learn how to write a single test which gets executed multiple times with
different inputs. This is called _parameterised testing_.

> TestNG has particularly nice support for parameterised testing, which is why
> we're using it here.

## But First: Why Bother?

It's quite common to ask this question when confronted with a new approach that
will take some effort to learn, so let's deal with it now.

Parameterised testing primarily makes your tests neater because...

1. It helps to remove repetition from your test suite. Instead of having lots of
   almost identical tests, that differ only by their input, you can write one
   test that gets executed multiple times.
2. You can collect together several test cases into one place, rather than have
   them scattered around the test suite.

Convinced? I hope so :)

## An Example

For this section, I want you to imagine that you've switched focus and are now
writing unit tests for the `Defect` class, which is part of the Defect Logger
application. You'll find the code for it in the starter project.

The rules around what makes a valid `Defect` are the same as earlier...

- Name, Summary and Details are all mandatory fields
- Name must be no longer than 30 characters
- Summary must be no longer than 50 characters
- Details must be between 100 and 300 characters

You could write tests for all the important combinations of inputs but, of
course, you're going to use parameterised testing instead.

Here's an example where we've used parameterised testing in our
implementation of `FizzBuzz`, which you might recall from earlier in the course.

First, the class under test - `FizzBuzz`...

```java
class FizzBuzz {
    public String play(Integer number) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 3 == 0) {
            return "Fizz"
        } else if(number % 5 == 0) {
            return "Buzz"
        } else {
            return number.toString()
        }
    }
}
```

And the test...

```java
// FizzBuzzTest.java
class FizzBuzzTest {

    // note that the test now takes one argument - multipleOfThree
    @Test(dataProvider = "multiplesOfThree")
    public void forMultiplesOfThreeRerurnFizz(Integer multipleOfThree) {
        Assert.assertEquals(FizzBuzz.play(multipleOfThree), "Fizz")
    }

    // this is where we create the test inputs
    // note that the value of 'name' is used above with the @Test annotation
    // the test above will be run four times with inputs of 3, 6, 9 and 12
    @DataProvider(name = "multiplesOfThree")
    public Object[][] multiplesOfThreeGenerator() {
        // a 2D array of numbers to use as test inputs
        return new Object[][] {{3}, {6}, {9}, {12}}
    }
}
```

Now have a look in `DefectTest.java` and you'll find this...

```java
public class DefectTest {
    @Test(dataProvider = "")
    public void isValidReturnsFalseForInvalidDefects(String name, String summary, String details) {
        
    }

    @DataProvider(name = "")
    public Object[][] invalidDefectData() {
    }
}
```

Someone made a start at implementing some parameterised tests and your task is
to finish the job.

Use parameterised testing to iterate through all of these test cases:

|Name|Summary|Details|Expected URL|
|-|-|-|-|
|Too long|Valid|Valid|https://defect-logger.onrender.com/defects|
|Valid|Too long|Valid|https://defect-logger.onrender.com/defects|
|Valid|Valid|Too short|https://defect-logger.onrender.com/defects|
|Valid|Valid|Too long|https://defect-logger.onrender.com/defects|

In the next section, you'll combine everything you've learned in this phase.


[Next Challenge](04_refactoring_exercise.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F03_parameterised_testing.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F03_parameterised_testing.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F03_parameterised_testing.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F03_parameterised_testing.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F03_parameterised_testing.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

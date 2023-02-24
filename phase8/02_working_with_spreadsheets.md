# Working With Spreadsheets

In this section you'll learn how to read from spreadsheets. I'll walk you
through an example - you should code along with me - and then I'll set you some
challenges.

You'll be working with a spreadsheet called test_inputs.xlsx and the challenges
will involve using Java to investigate what is in that file - so don't peek
before you're done with this section!

## First, Find the Starter Codebase

We've already create a Gradle project, with all of the necessary dependencies,
for you. It's in a directory called `starter` in this phase. Find that and make
sure you're ready to go by executing the `main` method.

You should see this somewhere in the output...

```shell
This is all working nicely!
```

> Note that, for this project, we're using TestNG rather than JUnit. You'll see
> some small differences but they basically do the same thing. I preferred
> TestNG here because it has some nice features for data driven testing - I'll
> be sure to highlight those later :)

#### What are the 'Necessary Dependencies'?

- TestNG is needed for testing (later)
- Two Apache POI packages are needed for interacting with spreadsheets. This is where the classes starting with `XSSF` come from.

### Troubleshooting

If you have problems working through the examples below, come back here.

<details>
    <summary>Seems like I can't import the necessary classes</summary>
    <p>Find JAVA PROJECTS on the left hand side of VS Code, then click on the three dots to bring up the menu and choose to <code>refresh</code>.</p>
</details>

<details>
    <summary>But I don't see JAVA PROJECTS!</summary>
    <h3>Make Sure You Have Project Manager for Java Installed</h3>
    <p>
    <ul>
        <li>Go to `Extensions` in VS Code</li>
        <li>Search for Project Manager for Java</li>
        <li>Install it, if you've not done so already</li>
        <li>If this doesn't solve the problem, restart VS Code</li>
    </ul>
    </p>
</details>

<details>
    <summary>
        Why is `File` | `XSSWorkbook` | `XSSFSheet` underlined in red?
    </summary>
    <p>
        `File`, `XSSFWorkbook` and `XSSFSheet` are all classes that need to be imported. I'd expect the text editor to take care of that, or prompt you to do it. If not, you might find that those class names are underlined as the text editor doesn't know what they refer to. In that case, you should see a some helpful suggestions if you hover your cursor over the red line.
    </p>
</details>

## Loading a Spreadsheet into Memory

Find `App.java` then add some new fields to the top of the `App` class

```java
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static File inputs;
```

<details>
    <summary>What does <code>static</code> mean?</summary>
    <p><code>static</code> denotes that something, a method or field, belongs to a class, rather than to an instance of the class. We have to use a static field here becuase we're not going to make instances of <code>App</code>.</p>
</details>

Now add this to the body (between the `{` and `}`) of your `main` method

```java
    // get the data
    inputs = new File("phase8/starter/app/src/main/resources/test_inputs.xlsx");
    // the code below can throw errors so we have to use a try-catch
    try {
        // create a workbook from the file
        workbook = new XSSFWorkbook(inputs);
        // grab a sheet from the workbook
        sheet = workbook.getSheet("Sheet1");
        // get some output
        System.out.println(sheet);
    // if an error is thrown, the code below is executed
    } catch (Exception e) {
        System.out.println("Something went wrong...");
        System.out.println(e);
    }
```

Finally, execute your main method again. There should be no errors and you
should see something similar to this in the output

```shell
Name: /xl/worksheets/sheet1.xml - Content Type: application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml
```

It's not pretty but, if you saw something like that, it worked :)

## Reading Rows and Cells

The next step is to grab a row from the sheet.

You'll need one new static field - put it at the top with the others

```java
    static XSSFRow row;
```

And one more line in `main`, to grab the row from the sheet, using its index

```java
    // the first row has an index of 0
    row = sheet.getRow(0);
```

Then you can print the row

```java
    System.out.println(row);
```

And you should see something like this...

```shell
<xml-fragment r="1" xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships" xmlns:mx="http://schemas.microsoft.com/office/mac/excel/2008/main" xmlns:mc="http://schemas.openxmlformats.org/markup-compatibility/2006" xmlns:mv="urn:schemas-microsoft-com:mac:vml" xmlns:x14="http://schemas.microsoft.com/office/spreadsheetml/2009/9/main" xmlns:x15="http://schemas.microsoft.com/office/spreadsheetml/2010/11/main" xmlns:x14ac="http://schemas.microsoft.com/office/spreadsheetml/2009/9/ac" xmlns:xm="http://schemas.microsoft.com/office/excel/2006/main" xmlns:main="http://schemas.openxmlformats.org/spreadsheetml/2006/main">
  <main:c r="A1" s="1" t="s">
    <main:v>0</main:v>
  </main:c>
  <main:c r="B1" s="1" t="s">
    <main:v>1</main:v>
  </main:c>
  <main:c r="C1" s="1" t="s">
    <main:v>2</main:v>
  </main:c>
</xml-fragment>
```

Again, it's not much to look at but you're making progress!

Reading a cell works in a very similar way. You grab it from the row, using its
index.

You'll need one new static field - put it at the top with the others

```java
    static XSSFCell cell;
```

And one more line in `main`, to grab the cell using its index.

```java
    // the first cell has an index of 0
    cell = row.getCell(0);
```

Then you can print it

```java
    System.out.println(cell);
```

And you should see this in the output

```shell
Name
```

## Challenges

Use Apache POI to investigate the test_inputs spreadsheet.

- How many columns are there?
- What are the column names?
- Which columns are test inputs?
- Which column would be used as part of an assertion?
- How many rows contain valid Bug Reporter inputs?


[Next Challenge](03_parameterised_testing.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F02_working_with_spreadsheets.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F02_working_with_spreadsheets.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F02_working_with_spreadsheets.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F02_working_with_spreadsheets.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fextending-testing&prefill_File=phase8%2F02_working_with_spreadsheets.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->

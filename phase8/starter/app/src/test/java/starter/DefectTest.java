package starter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// complete the test and dataprovider method

public class DefectTest {
    @Test(dataProvider = "giornoGiovana")
    public void isValidReturnsFalseForInvalidDefects(String name, String summary, String details) {
        Defect defect = new Defect(name, summary, details);
        Assert.assertFalse(defect.isValid());
    }

    @DataProvider(name = "giornoGiovana")
    public Object[][] invalidDefectData() {
        // read from your spreadsheet
        // return a 2D array of inputs and expected urls
        return new Object[][] {{"Stefanopolous Stavrolopadopolis", "This is a valid summary", "A crisis team will be introduced at this year's Oscars, to handle any real-time incidents as a response to Will Smith slapping Chris Rock during the 2022 ceremony."}, {"Stefanopolous Stavrolopado", "This is a valid summary This is a valid summary lol", "A crisis team will be introduced at this year's Oscars, to handle any real-time incidents as a response to Will Smith slapping Chris Rock during the 2022 ceremony."}, {"Stefanopolous Stavrolopado", "This is a valid summary", "A crisis team will be introduced at this."}, {"Stefanopolous Stavrolopado", "This is a valid summary", "A crisis team will be introduced at this year's Oscars, to handle any real-time incidents as a response to Will Smith slapping Chris Rock during the 2022 ceremony.A crisis team will be introduced at this year's Oscars, to handle any real-time incidents as a response to Will Smith slapping Chris Rock "}};
    }
}

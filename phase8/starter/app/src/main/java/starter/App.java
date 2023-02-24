package starter;

import org.apache.commons.collections4.IterableUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

import static org.apache.commons.collections4.IterableUtils.size;

public class App {

    // add the new fields below here
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static File inputs;
    static XSSFRow row;
    static XSSFCell cell;
    // click on run (below) to execute this method
    public static void main(String[] args) {
        // get the data
        inputs = new File("app/src/main/resources/test_inputs.xlsx");
        // the first row has an index of 0

        // the code below can throw errors, so we have to use a try-catch
        try {
            // create a workbook from the file
            workbook = new XSSFWorkbook(inputs);
            // grab a sheet from the workbook
            sheet = workbook.getSheet("Sheet1");
            // get some output
//            System.out.println(sheet);
            for (int i = 0; i < size(sheet); i++){
                row = sheet.getRow(i);
//                System.out.println(row);
//                System.out.println(size(row));
                for (int x =0; x < size(row); x++) {
                    cell = row.getCell(x);
                    System.out.println(cell); }}
            // if an error is thrown, the code below is executed
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            System.out.println(e);
        }
        // delete the line below when you no longer need it
//        System.out.println("This is all working nicely!");
    }
}

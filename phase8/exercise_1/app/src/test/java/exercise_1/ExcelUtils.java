package exercise_1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    ArrayList<ArrayList<String>> excelData = new ArrayList<ArrayList<String>>();

    public static Object[][] read(String filePath) throws InvalidFormatException, IOException {
        File inputFile = new File(filePath);
        ExcelUtils excel = new ExcelUtils(inputFile);
        return excel.testInput();
    }

    public ExcelUtils(File inputFile) throws InvalidFormatException, IOException {
        this.workbook = new XSSFWorkbook(inputFile);
        this.sheet = workbook.getSheet("Sheet1");
    }

    public Object[][] testInput() {
        Boolean hasNextRow = true;
        Integer rowIndex = 1;

        while(hasNextRow) {
            this.row = this.sheet.getRow(rowIndex);
            this.cell = row.getCell(0);
            if(this.cell == null || this.cell.toString() == "") {
                hasNextRow = false;
            } else {
                ArrayList<String> outputRow = new ArrayList<String>();
                outputRow.add(this.row.getCell(0).toString());
                outputRow.add(this.row.getCell(2).toString());
                outputRow.add(this.row.getCell(4).toString());
                outputRow.add(this.row.getCell(6).toString());
                excelData.add(outputRow);
                rowIndex++;
            }
        }

        int nRows = excelData.size();
        int nCols = excelData.get(0).size();
        Object[][] output = new Object[nRows][nCols];

        for(int i = 0; i < nRows; i++) {
            output[i] = excelData.get(i).toArray();
        }

        return output;
    }
}
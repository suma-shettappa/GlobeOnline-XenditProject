package globeOnline_CommonMethods;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

public class util {

	private XSSFWorkbook workbook;
	private XSSFSheet Worksheet;
	private XSSFCell cell;

	private String excelFilePath = System.getProperty("user.dir") + "\\OMT.xlsx";

	private Properties prop = new Properties();

	/********************************************************************************************************************************/
	public void assertContainText(String text, String actual, String expected) {
		assertTrue(actual.contains(expected));
		System.out.println(text + " : " + expected);

	}

	/********************************************************************************************************************************/
	public void assertEqualsText(String text, String actual, String expected) {
		assertTrue(actual.equals(expected));
		System.out.println(text + " : " + expected);

	}

	/********************************************************************************************************************************/
	public String readConfigPropFile(String key) {
		String value = "";

		String File = System.getProperty("user.dir") + "\\config.properties";

		try {
			FileInputStream fis = new FileInputStream(File);
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (NullPointerException NPE) {
			System.out.println("Could not find key: " + key + " in Config.properties");
			Assert.assertTrue(false);
		} catch (IOException IOE) {
			System.out.println("Could not find Config.properties file");
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		return value;
	}

	/********************************************************************************************************************************/
	public String getTimeStamp() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	/**
	 * @throws IOException
	 ******************************************************************************************************************************/

	private String getcelldata(int rownum, int colnum) throws Exception {
		String celldata = null;
		DataFormatter formatter = new DataFormatter();
		try {
			// cell= Worksheet.getRow(rownum).getCell(colnum);

			// celldata=cell.getStringCellValue();
			celldata = formatter.formatCellValue(Worksheet.getRow(rownum).getCell(colnum));
			// System.out.println();

		} catch (Exception e) {
			System.out.println("Exception while getCellData : Row,Col" + rownum + "," + colnum + e.getMessage());
			e.printStackTrace();

			// System.exit(-1);
		}
		return celldata;
	}

	public ArrayList readExcelData(int colNo, String ScenarioName, String SheetName) throws Exception {
		// String filePath = Constants.filePath;

File file = new File(excelFilePath);
		// Create an object of FileInputStream class and pass file as parameter
		// to its constructor.
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(SheetName);
		Iterator row = sheet.rowIterator();

		ArrayList<String> a = new ArrayList();

		String sc = ReadFromExcel(ScenarioName, SheetName, 1);
		int Pos = ReadFromExcelPosition(ScenarioName, SheetName, 1);
		if (ScenarioName.equalsIgnoreCase(sc)) {
			System.out.println("row position : "+ Pos);
		}
		
		for (int i = 0; i <= Pos - 1; i++) 
		{
			row.next();
		}
		// Checking the next element availability using the reference variable
		// row.

		while (row.hasNext()) {

			Row r = (Row) row.next();

			// Moving cursor to the cell by getting a cell number.
			Cell c = r.getCell(colNo);
			if (c == null) {
				break;
			} else {
				String data = c.getStringCellValue();
				a.add(data);

			}

			// a.add(((Row) row.next()).getCell(colNo).getStringCellValue());
			if ((r).getCell(colNo).getStringCellValue().isEmpty()) {
				break;
			}
		}
		System.out.println("List: " + a);
		// Return the data to the Arraylist method.
		return a;
	}

	/*
	 * public void DemoFile(int i) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	/*
	 * if(((Row) row.next()).getCell(colNo).getStringCellValue().isEmpty()) {
	 * break; }
	 */

	public String ReadFromExcel(String strVariable, String strSheetname, int iColumnNo) throws Exception {
		// System.out.println("In Read from Excel");
		String strText = null;
		String strData;
		String Position;
		// int i=0;
		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int totalrows = Worksheet.getLastRowNum();
			for (int i = 0; i < totalrows + 1; i++) {
				strData = getcelldata(i, 1);
				// System.out.println("StrData is "+strData);
				// System.out.println("StrVar is "+strVariable);
				if (strVariable.equals(strData.toString())) {
					strText = getcelldata(i, iColumnNo);
					// System.out.println("*************************** [ FINALLY
					// EQUAL ]
					// *************************** ");
					break;
				}
			}

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while reading from Excel : " + e.getMessage());
			e.printStackTrace();
		}
		return strText;

	}

	public String ReadFromRowExcel(String RowValue, String strSheetname, int iColumnNo) throws Exception {
		// System.out.println("In Read from Excel");
		String strText = null;
		String strData;
		String Position;
		// int i=0;
		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int totalrows = Worksheet.getLastRowNum();
			for (int i = 0; i < totalrows + 1; i++) {
				strData = getcelldata(i,0);
				String StrData1=getcelldata(i,1);

				if (RowValue.equals(strData.toString())||RowValue.equals(StrData1.toString())) {
					strText = getcelldata(i, iColumnNo);

					break;
				}
			}

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while reading from Excel : " + e.getMessage());
			e.printStackTrace();
		}
		return strText;

	}

	public int ReadFromExcelPosition(String strVariable, String strSheetname, int iColumnNo) throws Exception {
		// System.out.println("In Read from Excel");
		String strText = null;
		String strData;
		int Position = 0;
		// int i=0;
		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int totalrows = Worksheet.getLastRowNum();
			for (int i = 0; i < totalrows + 1; i++) {
				strData = getcelldata(i, 1);
				// System.out.println("StrData is "+strData);
				// System.out.println("StrVar is "+strVariable);
				if (strVariable.equals(strData.toString())) {
					strText = getcelldata(i, iColumnNo);
					Position = i;
					// System.out.println("*************************** [ FINALLY
					// EQUAL ]
					// *************************** ");
					break;
				}
			}

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while reading from Excel : " + e.getMessage());
			e.printStackTrace();
		}
		return Position;

	}

	/*
	 * public void WriteDataIntoExcel() throws IOException { //create an object
	 * of Workbook and pass the FileInputStream object into it to create a
	 * pipeline between the sheet and eclipse. FileInputStream fis = new
	 * FileInputStream(excelFilePath); XSSFWorkbook workbook = new
	 * XSSFWorkbook(fis);
	 * 
	 * 
	 * }
	 */

	public void writeToExcelLastRowFromMap(String strSheetname, LinkedHashMap<String, String> Map) throws Exception {

		String columnName = "";
		String textToInsertInCol = "";
		String text = "";

		int colNo = 0;
		boolean colFound = false;

		Set<String> keys = Map.keySet();

		// printing the elements of LinkedHashMap

		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int lastRow = Worksheet.getLastRowNum();
			int totalCols = Worksheet.getRow(0).getLastCellNum();
			Row newRow = Worksheet.createRow(lastRow + 1);

			for (String key : keys) {
				textToInsertInCol = key;
				text = Map.get(key);

				for (int iCol = 0; iCol < totalCols; iCol++) {
					columnName = getcelldata(0, iCol);
					if (columnName.toString().equals(textToInsertInCol)) {
						colNo = iCol;
						colFound = true;
						break;
					}
				}

				if (colFound) {
					// cell = Worksheet.getRow(lastRow + 1).getCell(colNo);
					Cell cell = newRow.createCell(colNo);
					cell.setCellValue(text);
				}

				FileOutputStream fos = new FileOutputStream(excelFilePath);
				workbook.write(fos);
				fos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
	
	public void writeToExcelExistingRowFromMap1(String strSheetname, LinkedHashMap<String, Integer> Map1,
			String ScenarioName, int ScenarioColumn) {
		// TODO Auto-generated method stub
		String columnName = "";
		String textToInsertInCol = "";
		Integer text;
		int colNo = 0;
		boolean colFound = false;

		Set<String> keys = Map1.keySet();

		// printing the elements of LinkedHashMap

		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int lastRow = Worksheet.getLastRowNum();
			int totalCols = Worksheet.getRow(0).getLastCellNum();
			// Row newRow = Worksheet.createRow(lastRow + 1);
			int row = Worksheet.getLastRowNum();
			// Row Row=Worksheet.
			int a = ReadFromExcelPosition(ScenarioName, strSheetname, ScenarioColumn);
			// System.out.println(a);
			for (String key : keys) {
				textToInsertInCol = key;
				text = Map1.get(key);

				for (int iCol = 0; iCol < totalCols; iCol++) {
					columnName = getcelldata(0, iCol);// rowname
					if (columnName.toString().equals(textToInsertInCol)) {
						colNo = iCol;
						colFound = true;
						break;
					}
				}

				if (colFound) {
					// cell = Worksheet.getRow(lastRow + 1).getCell(colNo);
					cell = Worksheet.getRow(a).getCell(colNo);

					/// Cell cell = newRow.createCell(colNo);
					// Cell cell = row.createCell(a);
					cell.setCellValue(text);
				}

				FileOutputStream fos = new FileOutputStream(excelFilePath);
				workbook.write(fos);
				fos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public String ReadFromExcelORDERID(String strVariable, String strSheetname, int iColumnNo) throws Exception {
		// System.out.println("In Read from Excel");
		String strText = null;
		String strData;
		String Position;
		// int i=0;
		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int totalrows = Worksheet.getLastRowNum();
			for (int i = 0; i < totalrows + 1; i++) {
				strData = getcelldata(i, 1);
				// System.out.println("StrData is "+strData);
				// System.out.println("StrVar is "+strVariable);
				if (strVariable.equals(strData.toString())) {
					strText = getcelldata(i, iColumnNo);
					// System.out.println("*************************** [ FINALLY
					// EQUAL ]
					// *************************** ");
					break;
				}
			}

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while reading from Excel : " + e.getMessage());
			e.printStackTrace();
		}
		return strText;

	}
	// ,String ScenarioName,int iColumnNo

	public void writeToExcelExistingRowFromMap(String strSheetname, LinkedHashMap<String, String> Map,String ScenarioName,Integer ScenarioColumn)
			throws Exception {

		String columnName = "";
		String textToInsertInCol = "";
		String text = "";
		int colNo = 0;
		boolean colFound = false;

		Set<String> keys = Map.keySet();


		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(ExcelFile);
			Worksheet = workbook.getSheet(strSheetname);
			int lastRow = Worksheet.getLastRowNum();
			int totalCols = Worksheet.getRow(0).getLastCellNum();
			// Row newRow = Worksheet.createRow(lastRow + 1);
			int row = Worksheet.getLastRowNum();
			//Row Row=Worksheet.
					int a= ReadFromExcelPosition(ScenarioName, strSheetname,ScenarioColumn);
			// System.out.println(a);
			for (String key : keys) {
				textToInsertInCol = key;
				text = Map.get(key);

				for (int iCol = 0; iCol < totalCols; iCol++) {
					columnName = getcelldata(0, iCol);// rowname
					if (columnName.toString().equals(textToInsertInCol)) {
						colNo = iCol;
						colFound = true;
						break;
					
				
				}
				}

				if (colFound) {
					// cell = Worksheet.getRow(lastRow + 1).getCell(colNo);
					cell = Worksheet.getRow(a).getCell(colNo);

					
					cell.setCellValue(text);
				}
				
				FileOutputStream fos = new FileOutputStream(excelFilePath);
				workbook.write(fos);
				fos.close();
			
		}
		}
			catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
			catch (Exception e1) {
			e1.printStackTrace();
		}

	}
	public String getCurrentDate(String dtFormat) {
		String dt = null;
		Date date = new Date();

		switch (dtFormat) {
		case "dd MMM yyyy":
			try {
				DateFormat dateFormat = new SimpleDateFormat(dtFormat);
				dt = dateFormat.format(date);
			} catch (Exception e) {
				System.out.println("Failed yo get date in format :" + dtFormat + ". Method : getCurrentDate");
			}
		}
		return dt;
	}

}

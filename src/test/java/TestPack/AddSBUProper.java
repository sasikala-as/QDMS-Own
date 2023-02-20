package TestPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;


import BasePack.QDMSDriver;
import PagePack.AddSbuFunctionalPage;

public class AddSBUProper extends QDMSDriver{
	
	static AddSbuFunctionalPage addfunctionpg = new AddSbuFunctionalPage();
	static PagePack.AddSbuUIPage addfun = new PagePack.AddSbuUIPage();
	static String sbu = null;
	
	
	public static void addDataIntoSbu() throws InterruptedException, IOException {

		
		PageFactory.initElements(driver, addfunctionpg);
		PageFactory.initElements(driver, addfun);
		
//		AddSbuUIPage.SBUbutton.click();
		
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\ExcelPack\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sbu");

		
		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();

			AddSbuFunctionalPage.AddSBU.click();
			Thread.sleep(2000);
			AddSbuFunctionalPage.SBUtext.sendKeys(sbu);
			AddSbuFunctionalPage.SBUdestext.sendKeys(description);

			Thread.sleep(3000);

			AddSbuFunctionalPage.SBUsavebutton.click();
			Thread.sleep(2000);

		}
	}
	
	
	public static  void checkLastAddvalue() throws InterruptedException, IOException {

		PageFactory.initElements(driver, addfunctionpg);
		
		//WebElement tableRow = driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]"));
		String actualdata = AddSbuFunctionalPage.tableRow.getText();
		System.out.println("First row of table : " + actualdata);

		
		String expecteddata =sbu;

		boolean firstdata = true;
		testCase = extent.createTest("LAST-ADDED-DATA");
		try {
			AssertJUnit.assertEquals(actualdata, expecteddata);

		} catch (AssertionError e) {
			firstdata = false;
		}
		if (firstdata) {
			testCase.log(Status.INFO, "Actual Data :- " + actualdata);
			testCase.log(Status.INFO, "Expected Data :- " + expecteddata);
//			testCase.log(Status.INFO, "").assignCategory("High Severity");
//			testCase.log(Status.INFO, "").assignCategory("High Priority");
			testCase.log(Status.PASS, "Correct last added data");
		} else {
			testCase.log(Status.INFO, "Actual Data :- " + actualdata);
			testCase.log(Status.INFO, "Expected Data :- " + expecteddata);
//			testCase.log(Status.INFO, "").assignCategory("High Severity");
//			testCase.log(Status.INFO, "").assignCategory("High Priority");
			testCase.log(Status.FAIL, "Wrong last added data");
		}

	}	
}


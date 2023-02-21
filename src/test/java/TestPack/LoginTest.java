/*

***********************************************************************************
* Description
*------------

* QDMS Login functionalitiy
***********************************************************************************

* Author           : @Sasikala Ambalavanar
* Date Written     : 17/02/2023
 


* Test Case 		      Date         Intis        Comments
* ================       ====         =====        ========
*  Login function       20/02/2023   Sasikala     Orginal Version

************************************************************************************

*/

package TestPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePack.QDMSDriver;
import PagePack.LoginPage;

public class LoginTest extends QDMSDriver{
	
	LoginPage loginpg = new LoginPage();

	@Test
	public void Login() throws InterruptedException, IOException {
		
// Login data get from the excel
		PageFactory.initElements(driver, loginpg);

		SoftAssert sa = new SoftAssert();
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\ExcelPack\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Login");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(0);

			String uName = (String) row.getCell(0).getStringCellValue();
			String pWord = (String) row.getCell(1).getStringCellValue();
			String expec = (String) row.getCell(2).getStringCellValue();

			LoginPage.username.sendKeys(uName);
			LoginPage.password.sendKeys(pWord);
			LoginPage.login.click();

			Thread.sleep(2500);
			String actualurl = driver.getCurrentUrl();
//			System.out.println(actualurl);
//
//			System.out.println(expec);

			sa.assertEquals(expec, actualurl);

		}
	}

}


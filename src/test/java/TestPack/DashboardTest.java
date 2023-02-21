/*

***********************************************************************************
* Description
*------------

* QDMS Master & SBU Button click 
***********************************************************************************

* Author           : @Sasikala Ambalavanar
* Date Written     : 20/02/2023
 


* Test Case 		     			 Date         Intis        Comments
* ================      			 ====         =====        ========
*  Master & SBU Button click        20/02/2023   Sasikala     Orginal Version

************************************************************************************

*/


package TestPack;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePack.QDMSDriver;
import PagePack.DashboardPage;

public class DashboardTest extends QDMSDriver{
	DashboardPage Dashboardpage = new DashboardPage();
	@Test
	
	public void Dashboard () throws InterruptedException,IOException{

// 	Click Master Module & click Sub business Unit		

		PageFactory.initElements(driver, Dashboardpage);
	
	Thread.sleep(2000);
	Dashboardpage.Master.click();
	
	Thread.sleep(2000);
	Dashboardpage.sub.click();
	
//	Thread.sleep(2000);
//	Dashboardpage.addsbu.click();
	
	

}
}

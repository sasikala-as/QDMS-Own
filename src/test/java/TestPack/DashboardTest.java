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
			
	PageFactory.initElements(driver, Dashboardpage);
	
	Thread.sleep(2000);
	Dashboardpage.Master.click();
	
	Thread.sleep(2000);
	Dashboardpage.sub.click();
	
//	Thread.sleep(2000);
//	Dashboardpage.addsbu.click();
	
	

}
}

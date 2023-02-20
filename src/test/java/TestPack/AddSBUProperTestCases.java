package TestPack;

import java.io.IOException;

import org.testng.annotations.Test;



import BasePack.QDMSDriver;

public class AddSBUProperTestCases extends QDMSDriver{
	@Test(priority = 0)
	public static void SBU0167() throws InterruptedException, IOException
	{
	
		AddSBUProper.addDataIntoSbu();
		AddSBUProper.checkLastAddvalue();

}
}

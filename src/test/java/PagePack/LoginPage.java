/*
 * @Author - Sasikala Ambalavanar
 * Description - QDMS Login Page 
 * Date - 20-02-2023
 * Purpose - Login page xpaths
 * 
 */



package PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	// QDMS username xpath
	
		@FindBy(xpath="//*[@id ='usernameOrEmail']")
		public static WebElement username;
		
	// QDMS Password xpath
		
		@FindBy(id="password")
		public static WebElement password;

	// QDMS Loginbutton xpath
		
		@FindBy(xpath= "//button[@type]")
		public static WebElement login;
		
}

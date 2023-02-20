package TestPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import BasePack.QDMSDriver;
import PagePack.AddSbuFunctionalPage;
import PagePack.AddSbuUIPage;

public class AddSbuInitialTest extends QDMSDriver {
	
	
	static AddSbuFunctionalPage addfunctionpg = new AddSbuFunctionalPage();
	static AddSbuUIPage addfun = new AddSbuUIPage();
	

	
	// STEP-1 "ADD SBU BUTTON" PROPERTIES
//001-ADD-SBU-BUTTON-DISPLAYED,002-ADD-SBU-BUTTON-ENABLED,003-ADD-SBU-BUTTON-POSITION,004-ADD-SBU-BUTTON-FONT-SIZE
//005-ADD-SBU-BUTTON-SIZE,006-ADD-SBU-BUTTON-COLOUR,007-ADD-SBU-BUTTON-BORDER-COLOUR,008-ADD-SBU-BUTTON-FONT-COLOUR
//009-ADD-SBU-BUTTON-FONT-TYPE,010-ADD-SBU-BUTTON-TEXT,011-ADD-SBU-BUTTON-CURSOR-TYPE,012-ADD-SBU-BUTTON-SHAPE,
//013-ADD-SBU-BUTTON-BOX-SHADOW,014-ADD-SBU-BUTTON-PADDING,
	public static void addSbuButtonproperties() throws InterruptedException {
		PageFactory.initElements(driver, addfunctionpg);
		PageFactory.initElements(driver, addfun);

		try {
			if (AddSbuUIPage.SBUbutton.isDisplayed()) {

//						button Displayed

				boolean ActualbiuttonDisplay = AddSbuUIPage.SBUbutton.isDisplayed();
				boolean ExpectedbuttonDisplay = true;
				testCase = extent.createTest("STEP-1-001 \"ADD SBU BUTTON\"-DISPLAYED");
				try {
					Assert.assertEquals(ActualbiuttonDisplay, ExpectedbuttonDisplay);
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.PASS, " Image Displayed is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.FAIL, " Image Displayed is Wrong");
				}

				try {
					if (AddSbuUIPage.SBUbutton.isEnabled()) {

//								button enabled

						boolean ActualImageDisplay = AddSbuUIPage.SBUbutton.isDisplayed();
						boolean ExpectedImageDisplay = true;
						testCase = extent.createTest("STEP-1-002\"ADD SBU BUTTON\"-ENABLED");
						try {
							Assert.assertEquals(ActualImageDisplay, ExpectedImageDisplay);
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.PASS, " Image Displayed is Correct");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.FAIL, " Image Displayed is Wrong");
						}

						// Check position

						Point ActualLocation = AddSbuUIPage.SBUbutton.getLocation();

						int actual_x = ActualLocation.getX();
						int actual_y = ActualLocation.getY();

						System.out.println("X axis: " + actual_x);
						System.out.println("Y axis: " + actual_y);

						// testCase = extent.createTest("******");

						Point ExpectedLocation = new Point(588, 93);

						boolean position = true;
						testCase = extent.createTest("STEP-1-003\"ADD SBU BUTTON\"-POSITION");
						try {
							AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);
						} catch (AssertionError e) {
							position = false;
						}
						if (position) {
							testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
							testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
							testCase.log(Status.INFO, "Correct Position");
							testCase.log(Status.PASS, "Position correct");
						} else {
							testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
							testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
							testCase.log(Status.INFO, "wrong Position");
							testCase.log(Status.FAIL, "Position Wrong");
						}
						Thread.sleep(2000);

						// check font size

						String ActualfontsSize = AddSbuUIPage.SBUbutton.getCssValue("font-size");
						System.out.println("Font Size: " + ActualfontsSize);

						String ExpectedfontsSize = "14px";

						boolean fontsize = true;
						testCase = extent.createTest("STEP-1-004 \"ADD SBU BUTTON\"-FONT-SIZE");
						try {
							AssertJUnit.assertEquals(ActualfontsSize, ExpectedfontsSize);
						} catch (AssertionError e) {
							fontsize = false;
						}
						if (fontsize) {
							testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
							testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
							testCase.log(Status.INFO, "Correct font-size");
							testCase.log(Status.PASS, "Font-size Correct");
						} else {
							testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
							testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
							testCase.log(Status.INFO, "Wrong font-size");
							testCase.log(Status.FAIL, "Font-size Wrong");
						}
						Thread.sleep(2000);

						// Check the size

						Dimension ActualSize = AddSbuUIPage.SBUbutton.getSize();
						System.out.println("Size :" + ActualSize);
						Dimension ExpectedSize = new Dimension(180, 32);

						boolean size = true;
						testCase = extent.createTest("STEP-1-005 \"ADD SBU BUTTON\"-SIZE");
						try {
							AssertJUnit.assertEquals(ActualSize, ExpectedSize);
						} catch (AssertionError e) {
							size = false;
						}
						if (size) {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "Correct Size");
							testCase.log(Status.PASS, "Correct Size");
						} else {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "wrong Size");
							testCase.log(Status.FAIL, "wrong Size");
						}
						Thread.sleep(2000);

						// Check test button color

						String ActualColour = AddSbuUIPage.SBUbutton.getCssValue("background-color");
						System.out.println("rgb :" + ActualColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedColour = "rgba(0, 19, 40, 1)";

						boolean colour = true;

						testCase = extent.createTest("STEP-1-006 \"ADD SBU BUTTON\"-COLOUR");
						try {
							AssertJUnit.assertEquals(ActualColour, ExpectedColour);
						} catch (AssertionError e) {
							colour = false;
						}
						if (colour) {
							testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
							testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
							testCase.log(Status.INFO, "Correct Colour");
							testCase.log(Status.PASS, "Correct Colour");
						} else {
							testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
							testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
							testCase.log(Status.INFO, "wrong Colour");
							testCase.log(Status.FAIL, "wrong Colour");
						}
						Thread.sleep(2000);

						// Check border colour

						String ActualBorderColour = AddSbuUIPage.SBUbutton.getCssValue("border-color");
						System.out.println("rgb :" + ActualBorderColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedBorderColour = "rgb(255, 255, 255)";

						boolean BorderColour = true;

						testCase = extent.createTest("STEP-1-007 \"ADD SBU BUTTON\"-BORDER-COLOUR");
						try {
							AssertJUnit.assertEquals(ActualBorderColour, ExpectedBorderColour);
						} catch (AssertionError e) {
							BorderColour = false;
						}
						if (BorderColour) {
							testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
							testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
							testCase.log(Status.INFO, "Correct Border Colour");
							testCase.log(Status.PASS, "Correct Border Colour");
						} else {
							testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
							testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
							testCase.log(Status.INFO, "wrong border Colour");
							testCase.log(Status.FAIL, "wrong border Colour");
						}
						Thread.sleep(2000);

						// check the font colour

						String ActualfontsColour = AddSbuUIPage.SBUbutton.getCssValue("color");
						System.out.println("Font colour: " + ActualfontsColour);

						String ExpectedfontsColour = "rgba(255, 255, 255, 1)";

						boolean fontcolour = true;
						testCase = extent.createTest("STEP-1-008 \"ADD SBU BUTTON\"-FONT-COLOUR");
						try {
							AssertJUnit.assertEquals(ActualfontsColour, ExpectedfontsColour);
						} catch (AssertionError e) {
							fontcolour = false;
						}
						if (fontcolour) {
							testCase.log(Status.INFO, "ActualfontsColour :- " + ActualfontsColour);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsColour);
							testCase.log(Status.INFO, "Correct font-colour");
							testCase.log(Status.PASS, "Font-colour Correct");
						} else {
							testCase.log(Status.INFO, "ActualfontsColour  :- " + ActualfontsColour);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsColour);
							testCase.log(Status.INFO, "Wrong font-colour");
							testCase.log(Status.FAIL, "Font-colour Wrong");
						}
						Thread.sleep(2000);

						// check the font type

						String ActualfontsType = AddSbuUIPage.SBUbutton.getCssValue("font-style");
						System.out.println("Font type: " + ActualfontsType);

						String ExpectedfontsType = "normal";

						boolean fonttype = true;
						testCase = extent.createTest("STEP-1-009 \"ADD SBU BUTTON\"-FONT-TYPE");
						try {
							AssertJUnit.assertEquals(ActualfontsType, ExpectedfontsType);
						} catch (AssertionError e) {
							fonttype = false;
						}
						if (fonttype) {
							testCase.log(Status.INFO, "ActualfontsColour :- " + ActualfontsType);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsType);
							testCase.log(Status.INFO, "Correct font-colour");
							testCase.log(Status.PASS, "Font-colour Correct");
						} else {
							testCase.log(Status.INFO, "ActualfontsColour  :- " + ActualfontsType);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsType);
							testCase.log(Status.INFO, "Wrong font-colour");
							testCase.log(Status.FAIL, "Font-colour Wrong");
						}
						Thread.sleep(2000);

						// check text

						String ActualText = AddSbuUIPage.SBUbutton.getText();
						System.out.println("Text : " + ActualText);

						String ExpectedText = "Add SBU";

						boolean test = true;
						testCase = extent.createTest("STEP-1-010 \"ADD SBU BUTTON\"-TEXT");
						try {
							AssertJUnit.assertEquals(ActualText, ExpectedText);
						} catch (AssertionError e) {
							test = false;
						}
						if (test) {
							testCase.log(Status.INFO, "ActualText :- " + ActualText);
							testCase.log(Status.INFO, "Expectedtext :- " + ExpectedText);
							// testCase.log(Status.INFO, "Correct test");
							testCase.log(Status.PASS, "Correct text");
						} else {
							testCase.log(Status.INFO, "ActualText  :- " + ActualText);
							testCase.log(Status.INFO, "Expectedtext :- " + ExpectedText);
							// testCase.log(Status.INFO, "Wrong font-size");
							testCase.log(Status.FAIL, "wrong text");
						}
						Thread.sleep(2000);

						// check cursor

						String ActualActions = AddSbuUIPage.SBUbutton.getCssValue("cursor");
						System.out.println("cursor :" + ActualActions);
						String ExpectedActions = "pointer";

						boolean cursor = true;
						testCase = extent.createTest("STEP-1-011 \"ADD SBU BUTTON\"-CURSOR-TYPE");
						try {
							AssertJUnit.assertEquals(ActualActions, ExpectedActions);

						} catch (AssertionError e) {
							cursor = false;
						}
						if (cursor) {
							testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
							testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
							testCase.log(Status.PASS, " cursor pointer");
						} else {
							testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
							testCase.log(Status.FAIL, "cursor not pointer");
						}
						Thread.sleep(2000);

						// check button shape

						String ActualShape = AddSbuUIPage.SBUbutton.getCssValue("border-radius");
						System.out.println("shape :" + ActualShape);
						String ExpectedShape = "2px";

						boolean shape = true;
						testCase = extent.createTest("STEP-1-012 \"ADD SBU BUTTON\"-SHAPE");
						try {
							AssertJUnit.assertEquals(ActualShape, ExpectedShape);

						} catch (AssertionError e) {
							shape = false;
						}
						if (shape) {
							testCase.log(Status.INFO, "ActualShape :- " + ActualShape);
							testCase.log(Status.INFO, "ExpectedShape :- " + ExpectedShape);
							testCase.log(Status.PASS, "correct shape");
						} else {
							testCase.log(Status.INFO, "ActualShape :- " + ActualShape);
							testCase.log(Status.INFO, "ExpectedShape :- " + ExpectedShape);
							testCase.log(Status.FAIL, "wrong shape");
						}
						Thread.sleep(2000);

						// check box shadow

						String ActualShadow = AddSbuUIPage.SBUbutton.getCssValue("box-shadow");
						System.out.println("shadow :" + ActualShadow);
						String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";

						boolean shadow = true;
						testCase = extent.createTest("STEP-1-013 \"ADD SBU BUTTON\"-BOX-SHADOW");
						try {
							AssertJUnit.assertEquals(ActualShadow, ExpectedShadow);

						} catch (AssertionError e) {
							shadow = false;
						}
						if (shadow) {
							testCase.log(Status.INFO, "ActualShadow :- " + ActualShadow);
							testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
							testCase.log(Status.PASS, "correct shadow");
						} else {
							testCase.log(Status.INFO, "ActualShadow :- " + ActualShadow);
							testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
							testCase.log(Status.FAIL, "wrong shadow");
						}
						Thread.sleep(2000);
   
						// check padding

						String ActualPadding = AddSbuUIPage.SBUbutton.getCssValue("padding");
						System.out.println("padding :" + ActualPadding);
						String ExpectedPadding = "4px 15px";

						boolean padding = true;
						testCase = extent.createTest("STEP-1-014 \"ADD SBU BUTTON\"-PADDING");
						try {
							AssertJUnit.assertEquals(ActualPadding, ExpectedPadding);

						} catch (AssertionError e) {
							padding = false;
						}
						if (padding) {
							testCase.log(Status.INFO, "ActualPadding :- " + ActualPadding);
							testCase.log(Status.INFO, "ExpectedPadding :- " + ExpectedPadding);
							testCase.log(Status.PASS, "correct padding");
						} else {
							testCase.log(Status.INFO, "ActualPadding :- " + ActualPadding);
							testCase.log(Status.INFO, "ExpectedPadding :- " + ExpectedPadding);
							testCase.log(Status.FAIL, "wrong padding");
						}
						Thread.sleep(2000);

					} else {
						testCase = extent.createTest("002-ADD-SBU-BUTTON-NOT-ENABLED");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("BUTTON Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("001-ADD-SBU-BUTTON-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("BUTTON Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
		System.out.println();
	}

	

	

	// STEP-3 CHECK THE "ADD SBU" DIALOGBOX
//015-ADD-SBU-MODAL-VISIBLE,016-ADD-SBU-MODAL-POSITION,017-ADD-SBU-MODAL-SIZE,018-ADD-SBU-MODAL-BACKGROUND-COLOR
//019-ADD-SBU-MODAL-BORDER-COLOR,020-ADD-SBU-MODAL-OVERFLOW-TYPE,021-ADD-SBU-MODAL-MARGIN-TYPE,022-ADD-SBU-MODAL-CURSOR-TYPE
//023-ADD-SBU-MODAL-Z-INDEX-TYPE,024-ADD-SBU-MODAL-HEADER,025-ADD-SBU-MODAL-CONTENT,026-MODAL-INVISIBLE-ONCLICK-INSIDE

	public static void addSbuModalproperties() throws InterruptedException {


		PageFactory.initElements(driver, addfunctionpg);
		PageFactory.initElements(driver, addfun);

		Thread.sleep(2000);

		// ***** element visible test

		boolean AcctualVisible = AddSbuUIPage.addSbuModal.isDisplayed();
		boolean ExpectedVisible = true;

		boolean elementvisible = true;
		testCase = extent.createTest("STEP-3-0015 \"ADD SBU\" DIALOGBOX-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualVisible, ExpectedVisible);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// ***** element position test

		Point ActualLocation = AddSbuUIPage.addSbuModal.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(383, 100);

		boolean Position = true;
		testCase = extent.createTest("STEP-3-016 \"ADD SBU\" DIALOGBOX-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

		// ***** element size

		Dimension ActualSize = AddSbuUIPage.addSbuModal.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(600, 230);

		boolean size = true;
		testCase = extent.createTest("STEP-3-017 \"ADD SBU\" DIALOGBOX-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correcrt size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(2000);

		// ***** element background-color

		String ActualButtonColor = AddSbuUIPage.addSbuModal.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);
		String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("STEP-3-018 \"ADD SBU\" DIALOGBOX-BACKGROUND-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(2000);

		// ***** element border-color

		String ActualBorderColor = AddSbuUIPage.addSbuModal.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("STEP-3-019 \"ADD SBU\" DIALOGBOX-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(2000);

		// ***** element overflow

		String ActualOverflow = AddSbuUIPage.addSbuModal.getCssValue("overflow");
		System.out.println("overflow :" + ActualOverflow);

		String ExpectedOverflow = "visible";

		boolean overflow = true;
		testCase = extent.createTest("STEP-3-020 \"ADD SBU\" DIALOGBOX-OVERFLOW-TYPE");
		try {
			AssertJUnit.assertEquals(ActualOverflow, ExpectedOverflow);

		} catch (AssertionError e) {
			overflow = false;
		}
		if (overflow) {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.PASS, "Correct overflow");
		} else {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.FAIL, "Wrong overflow");
		}
		Thread.sleep(2000);

		// ***** element margin

		String ActualMargin = AddSbuUIPage.addSbuModal.getCssValue("margin");
		System.out.println("margin :" + ActualMargin);

		String ExpectedMargin = "0px";

		boolean margin = true;
		testCase = extent.createTest("STEP-3-021 \"ADD SBU\" DIALOGBOX-MARGIN-TYPE");
		try {
			AssertJUnit.assertEquals(ActualMargin, ExpectedMargin);

		} catch (AssertionError e) {
			margin = false;
		}
		if (margin) {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.PASS, "Correct Margin");
		} else {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.FAIL, "Wrong Margin");
		}
		Thread.sleep(2000);

		// ***** element cursor

		String ActualActions = AddSbuUIPage.addSbuModal.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "auto";

		boolean cursor = true;
		testCase = extent.createTest("022-STEP-3 \"ADD SBU\" DIALOGBOX-CURSOR-TYPE");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "correct cursor type");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "wrong cursor type");
		}
		Thread.sleep(2000);

		// ***** element z- index

		String ActualZindex = AddSbuUIPage.addSbuModal.getCssValue("z-index");
		System.out.println("z-index :" + ActualZindex);
		String ExpectedZindex = "auto";

		boolean z_index = true;
		testCase = extent.createTest("023-STEP-3 \"ADD SBU\" DIALOGBOX-Z-INDEX-TYPE");
		try {
			AssertJUnit.assertEquals(ActualZindex, ExpectedZindex);

		} catch (AssertionError e) {
			z_index = false;
		}
		if (z_index) {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct z-index  type");
		} else {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong z-index type");
		}
		Thread.sleep(2000);

		// ***** click-on element

		// identify modal header

		String modalActual = AddSbuUIPage.addSbuModalHeader.getText();
		System.out.println("Modal Dialog header: " + modalActual);

		String modalExpected = "Add SBU";

		boolean modalHeader = true;
		testCase = extent.createTest("024-STEP-3 \"ADD SBU\" DIALOGBOX-HEADER");
		try {
			AssertJUnit.assertEquals(modalActual, modalExpected);

		} catch (AssertionError e) {
			modalHeader = false;
		}
		if (modalHeader) {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + modalExpected);
			testCase.log(Status.PASS, "correct modal header");
		} else {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + modalExpected);
			testCase.log(Status.FAIL, "wrong modal header");
		}
		Thread.sleep(2000);

		// identify modal content

		String ActualmodalContent = AddSbuUIPage.addSbuModal.getText();
		System.out.println(ActualmodalContent);
		String ExpectedModalContent = "Add SBU" + "\n" + "Sub Business Unit:"+ "\n" + "Description:"+ "\n" + "CancelSave";

		boolean modalContent = true;
		testCase = extent.createTest("025-STEP-3 \"ADD SBU\" DIALOGBOX-CONTENT");
		try {
			AssertJUnit.assertEquals(ActualmodalContent, ExpectedModalContent);

		} catch (AssertionError e) {
			modalContent = false;
		}
		if (modalContent) {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.PASS, "correct modal content");
		} else {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.FAIL, "wrong modal content");
		}
		Thread.sleep(2000);

		

		// click on inside of modal

		AddSbuUIPage.addSbuModal.click();
		Thread.sleep(2000);

		boolean AcctualAfterClickinside = AddSbuUIPage.addSbuModal.isDisplayed();
		boolean ExpectedAfterClickinside = true;

		boolean elementvisibleafterclickinside = true;
		testCase = extent.createTest("026-STEP-3  \"ADD SBU\" DIALOGBOX -INVISIBLE-ONCLICK-INSIDE");
		try {
			AssertJUnit.assertEquals(AcctualAfterClickinside, ExpectedAfterClickinside);
		} catch (AssertionError e) {
			elementvisibleafterclickinside = false;
		}
		if (elementvisibleafterclickinside) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);

			testCase.log(Status.PASS, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);

			testCase.log(Status.FAIL, "Modal invisible");
		}
		Thread.sleep(2000);

		

	

	}
	

	// STEP-4 DATA FROM EXCEL
	
	static String sbu=null;
	
	public static void getdatefromExcel() throws IOException, InterruptedException {

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

//			Thread.sleep(2000);
//			AddSbuUIPage.SBUbutton.click();
			Thread.sleep(2000);
			AddSbuFunctionalPage.SBUtext.sendKeys(sbu);
			AddSbuFunctionalPage.SBUdestext.sendKeys(description);

			Thread.sleep(3000);

//			AddSbuFunPage.SBUsavebutton.click();
//			Thread.sleep(2000);
		}
	}
	// STEP-5 CHECK "SAVE BUTTON" PROPERTIES
//027-SAVE-BUTTON-DISPLAYED,028-SAVE-BUTTON-ENABLED,029-SAVE-BUTTON-POSITION,030-SAVE-BUTTON-FONT-SIZE
//031-SAVE-BUTTON-SIZE,032-SAVE-BUTTON-COLOUR,033-SAVE-BUTTON-BORDER-COLOUR,034-SAVE-BUTTON-FONT-COLOUR
//035-SAVE-BUTTON-FONT-TYPE,036-SAVE-SBU-BUTTON-TEXT,037-SAVE-BUTTON-CURSOR-TYPE,038-SAVE-BUTTON-SHAPE
//039-SAVE-BUTTON-BOX-SHADOW,040-SAVE-BUTTON-PADDING,
	public static void saveButtonProperties() throws InterruptedException {
		
		PageFactory.initElements(driver, addfunctionpg);
		PageFactory.initElements(driver, addfun);
		try {
			if (AddSbuFunctionalPage.SBUsavebutton.isDisplayed()) {

//						button Displayed

				boolean ActualbiuttonDisplay = AddSbuFunctionalPage.SBUsavebutton.isDisplayed();
				boolean ExpectedbuttonDisplay = true;
				testCase = extent.createTest("027-STEP-5 CHECK \"SAVE BUTTON\" -DISPLAYED");
				try {
					Assert.assertEquals(ActualbiuttonDisplay, ExpectedbuttonDisplay);
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.PASS, " Image Displayed is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.FAIL, " Image Displayed is Wrong");
				}

				try {
					if (AddSbuFunctionalPage.SBUsavebutton.isEnabled()) {

//								button enabled

						boolean ActualImageDisplay = AddSbuFunctionalPage.SBUsavebutton.isDisplayed();
						boolean ExpectedImageDisplay = true;
						testCase = extent.createTest("028-STEP-5 CHECK \"SAVE BUTTON\" -ENABLED");
						try {
							Assert.assertEquals(ActualImageDisplay, ExpectedImageDisplay);
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.PASS, " Image Displayed is Correct");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.FAIL, " Image Displayed is Wrong");
						}

						// Check position

						Point ActualLocation = AddSbuFunctionalPage.SBUsavebutton.getLocation();

						int actual_x = ActualLocation.getX();
						int actual_y = ActualLocation.getY();

						System.out.println("X axis: " + actual_x);
						System.out.println("Y axis: " + actual_y);

						// testCase = extent.createTest("******");

						Point ExpectedLocation = new Point(907, 288);

						boolean position = true;
						testCase = extent.createTest("029-STEP-5 CHECK \"SAVE BUTTON\" -POSITION");
						try {
							AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);
						} catch (AssertionError e) {
							position = false;
						}
						if (position) {
							testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
							testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
							testCase.log(Status.INFO, "Correct Position");
							testCase.log(Status.PASS, "Position correct");
						} else {
							testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
							testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
							testCase.log(Status.INFO, "wrong Position");
							testCase.log(Status.FAIL, "Position Wrong");
						}
						Thread.sleep(2000);

						// check font size

						String ActualfontsSize = AddSbuFunctionalPage.SBUsavebutton.getCssValue("font-size");
						System.out.println("Font Size: " + ActualfontsSize);

						String ExpectedfontsSize = "14px";

						boolean fontsize = true;
						testCase = extent.createTest("030-STEP-5 CHECK \"SAVE BUTTON\" -FONT-SIZE");
						try {
							AssertJUnit.assertEquals(ActualfontsSize, ExpectedfontsSize);
						} catch (AssertionError e) {
							fontsize = false;
						}
						if (fontsize) {
							testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
							testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
							testCase.log(Status.INFO, "Correct font-size");
							testCase.log(Status.PASS, "Font-size Correct");
						} else {
							testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
							testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
							testCase.log(Status.INFO, "Wrong font-size");
							testCase.log(Status.FAIL, "Font-size Wrong");
						}
						Thread.sleep(2000);

						// Check the size

						Dimension ActualSize = AddSbuFunctionalPage.SBUsavebutton.getSize();
						System.out.println("Size :" + ActualSize);
						Dimension ExpectedSize = new Dimension(60, 32);

						boolean size = true;
						testCase = extent.createTest("031-STEP-5 CHECK \"SAVE BUTTON\" -SIZE");
						try {
							AssertJUnit.assertEquals(ActualSize, ExpectedSize);
						} catch (AssertionError e) {
							size = false;
						}
						if (size) {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "Correct Size");
							testCase.log(Status.PASS, "Correct Size");
						} else {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "wrong Size");
							testCase.log(Status.FAIL, "wrong Size");
						}
						Thread.sleep(2000);

						// Check test button color

						String ActualColour = AddSbuFunctionalPage.SBUsavebutton.getCssValue("background-color");
						System.out.println("rgb :" + ActualColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedColour = "rgba(0, 19, 40, 1)";

						boolean colour = true;

						testCase = extent.createTest("032-STEP-5 CHECK \"SAVE BUTTON\" -COLOUR");
						try {
							AssertJUnit.assertEquals(ActualColour, ExpectedColour);
						} catch (AssertionError e) {
							colour = false;
						}
						if (colour) {
							testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
							testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
							testCase.log(Status.INFO, "Correct Colour");
							testCase.log(Status.PASS, "Correct Colour");
						} else {
							testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
							testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
							testCase.log(Status.INFO, "wrong Colour");
							testCase.log(Status.FAIL, "wrong Colour");
						}
						Thread.sleep(2000);

						// Check border colour

						String ActualBorderColour = AddSbuFunctionalPage.SBUsavebutton.getCssValue("border-color");
						System.out.println("rgb :" + ActualBorderColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedBorderColour = "rgb(255, 255, 255)";

						boolean BorderColour = true;

						testCase = extent.createTest("033-STEP-5 CHECK \"SAVE BUTTON\" -BORDER-COLOUR");
						try {
							AssertJUnit.assertEquals(ActualBorderColour, ExpectedBorderColour);
						} catch (AssertionError e) {
							BorderColour = false;
						}
						if (BorderColour) {
							testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
							testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
							testCase.log(Status.INFO, "Correct Border Colour");
							testCase.log(Status.PASS, "Correct Border Colour");
						} else {
							testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
							testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
							testCase.log(Status.INFO, "wrong border Colour");
							testCase.log(Status.FAIL, "wrong border Colour");
						}
						Thread.sleep(2000);

						// check the font colour

						String ActualfontsColour = AddSbuFunctionalPage.SBUsavebutton.getCssValue("color");
						System.out.println("Font colour: " + ActualfontsColour);

						String ExpectedfontsColour = "rgba(255, 255, 255, 1)";

						boolean fontcolour = true;
						testCase = extent.createTest("034-STEP-5 CHECK \"SAVE BUTTON\" -FONT-COLOUR");
						try {
							AssertJUnit.assertEquals(ActualfontsColour, ExpectedfontsColour);
						} catch (AssertionError e) {
							fontcolour = false;
						}
						if (fontcolour) {
							testCase.log(Status.INFO, "ActualfontsColour :- " + ActualfontsColour);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsColour);
							testCase.log(Status.INFO, "Correct font-colour");
							testCase.log(Status.PASS, "Font-colour Correct");
						} else {
							testCase.log(Status.INFO, "ActualfontsColour  :- " + ActualfontsColour);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsColour);
							testCase.log(Status.INFO, "Wrong font-colour");
							testCase.log(Status.FAIL, "Font-colour Wrong");
						}
						Thread.sleep(2000);

						// check the font type

						String ActualfontsType = AddSbuFunctionalPage.SBUsavebutton.getCssValue("font-style");
						System.out.println("Font type: " + ActualfontsType);

						String ExpectedfontsType = "normal";

						boolean fonttype = true;
						testCase = extent.createTest("035-STEP-5 CHECK \"SAVE BUTTON\" -FONT-TYPE");
						try {
							AssertJUnit.assertEquals(ActualfontsType, ExpectedfontsType);
						} catch (AssertionError e) {
							fonttype = false;
						}
						if (fonttype) {
							testCase.log(Status.INFO, "ActualfontsColour :- " + ActualfontsType);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsType);
							testCase.log(Status.INFO, "Correct font-colour");
							testCase.log(Status.PASS, "Font-colour Correct");
						} else {
							testCase.log(Status.INFO, "ActualfontsColour  :- " + ActualfontsType);
							testCase.log(Status.INFO, "ExpectedfontsColour :- " + ExpectedfontsType);
							testCase.log(Status.INFO, "Wrong font-colour");
							testCase.log(Status.FAIL, "Font-colour Wrong");
						}
						Thread.sleep(2000);

						// check text

						String ActualText = AddSbuFunctionalPage.SBUsavebutton.getText();
						System.out.println("Text : " + ActualText);

						String ExpectedText = "Save";

						boolean test = true;
						testCase = extent.createTest("036-STEP-5 CHECK \"SAVE BUTTON\" -TEXT");
						try {
							AssertJUnit.assertEquals(ActualText, ExpectedText);
						} catch (AssertionError e) {
							test = false;
						}
						if (test) {
							testCase.log(Status.INFO, "ActualText :- " + ActualText);
							testCase.log(Status.INFO, "Expectedtext :- " + ExpectedText);
							// testCase.log(Status.INFO, "Correct test");
							testCase.log(Status.PASS, "Correct text");
						} else {
							testCase.log(Status.INFO, "ActualText  :- " + ActualText);
							testCase.log(Status.INFO, "Expectedtext :- " + ExpectedText);
							// testCase.log(Status.INFO, "Wrong font-size");
							testCase.log(Status.FAIL, "wrong text");
						}
						Thread.sleep(2000);

						// check cursor

						String ActualActions = AddSbuFunctionalPage.SBUsavebutton.getCssValue("cursor");
						System.out.println("cursor :" + ActualActions);
						String ExpectedActions = "pointer";

						boolean cursor = true;
						testCase = extent.createTest("037-STEP-5 CHECK \"SAVE BUTTON\" -CURSOR-TYPE");
						try {
							AssertJUnit.assertEquals(ActualActions, ExpectedActions);

						} catch (AssertionError e) {
							cursor = false;
						}
						if (cursor) {
							testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
							testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
							testCase.log(Status.PASS, " cursor pointer");
						} else {
							testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
							testCase.log(Status.FAIL, "cursor not pointer");
						}
						Thread.sleep(2000);

						// check button shape

						String ActualShape = AddSbuFunctionalPage.SBUsavebutton.getCssValue("border-radius");
						System.out.println("shape :" + ActualShape);
						String ExpectedShape = "2px";

						boolean shape = true;
						testCase = extent.createTest("038-STEP-5 CHECK \"SAVE BUTTON\" -SHAPE");
						try {
							AssertJUnit.assertEquals(ActualShape, ExpectedShape);

						} catch (AssertionError e) {
							shape = false;
						}
						if (shape) {
							testCase.log(Status.INFO, "ActualShape :- " + ActualShape);
							testCase.log(Status.INFO, "ExpectedShape :- " + ExpectedShape);
							testCase.log(Status.PASS, "correct shape");
						} else {
							testCase.log(Status.INFO, "ActualShape :- " + ActualShape);
							testCase.log(Status.INFO, "ExpectedShape :- " + ExpectedShape);
							testCase.log(Status.FAIL, "wrong shape");
						}
						Thread.sleep(2000);

						// check box shadow

						String ActualShadow = AddSbuFunctionalPage.SBUsavebutton.getCssValue("box-shadow");
						System.out.println("shadow :" + ActualShadow);
						String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";

						boolean shadow = true;
						testCase = extent.createTest("039-STEP-5 CHECK \"SAVE BUTTON\" -BOX-SHADOW");
						try {
							AssertJUnit.assertEquals(ActualShadow, ExpectedShadow);

						} catch (AssertionError e) {
							shadow = false;
						}
						if (shadow) {
							testCase.log(Status.INFO, "ActualShadow :- " + ActualShadow);
							testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
							testCase.log(Status.PASS, "correct shadow");
						} else {
							testCase.log(Status.INFO, "ActualShadow :- " + ActualShadow);
							testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
							testCase.log(Status.FAIL, "wrong shadow");
						}
						Thread.sleep(2000);

						// check padding

						String ActualPadding = AddSbuFunctionalPage.SBUsavebutton.getCssValue("padding");
						System.out.println("padding :" + ActualPadding);
						String ExpectedPadding = "4px 15px";

						boolean padding = true;
						testCase = extent.createTest("040-STEP-5 CHECK \"SAVE BUTTON\" -PADDING");
						try {
							AssertJUnit.assertEquals(ActualPadding, ExpectedPadding);

						} catch (AssertionError e) {
							padding = false;
						}
						if (padding) {
							testCase.log(Status.INFO, "ActualPadding :- " + ActualPadding);
							testCase.log(Status.INFO, "ExpectedPadding :- " + ExpectedPadding);
							testCase.log(Status.PASS, "correct padding");
						} else {
							testCase.log(Status.INFO, "ActualPadding :- " + ActualPadding);
							testCase.log(Status.INFO, "ExpectedPadding :- " + ExpectedPadding);
							testCase.log(Status.FAIL, "wrong padding");
						}
						Thread.sleep(2000);

					} else {
						testCase = extent.createTest("SAVE-BUTTON-NOT-ENABLED");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("BUTTON Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("SAVE-BUTTON-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("BUTTON Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
		System.out.println();
	}
	
	//STEP-7 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE
//041-LAST-ADDED-DATA
	public static  void checkLastAddvalue() throws InterruptedException, IOException {

		PageFactory.initElements(driver, addfunctionpg);
		
		Thread.sleep(2000);
		//WebElement tableRow = driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]"));
		String actualdata = AddSbuFunctionalPage.tableRow.getText();
		System.out.println("First row of table : " + actualdata);

		
		String expecteddata =sbu;

		boolean firstdata = true;
		testCase = extent.createTest("041-STEP-7 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE");
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

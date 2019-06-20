package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public static WebDriver driver;
	public BasePage(WebDriver driver) {
		//this.driver = driver ;
		BasePage.driver = driver ;
	}
	public static void VerifyTitlePage(String eTitle) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching"+eTitle ,true);
		}
		catch (Exception e) {
		Reporter.log("Title is not matching",true);
		}
	}
	
	public static void VerifyElement(String element) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(element));
		Reporter.log("Element is present"+element ,true);
		}
		catch (Exception e) {
			Reporter.log("Element is not present",true);
		}
	}
}

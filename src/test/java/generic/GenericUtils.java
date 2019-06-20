package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GenericUtils {
	public static void gSelectByIndex(WebElement element,int n) {
		Select select = new Select(element);
		select.selectByIndex(n);
	}
	public static void gSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public static void gSelectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void MouseHovering(WebDriver driver, WebElement toElement) {
		Actions action = new Actions(driver);
		action.moveToElement(toElement).perform();
	}
	public static void DragandDrop(WebDriver driver, WebElement src,WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src,dest).perform();
	}
	public static void SortEmpList(WebElement element) {
		Select select = new Select(element);
		List<WebElement> list = select.getOptions();
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ar1 = new ArrayList<String>();
		//Traverse through single element 
		for (int i = 1 ; i<list.size();i++) {
			String st = list.get(i).getText();
			ar.add(st);
			ar1.add(st);			
		}
			Collections.sort(ar);
			
		//Traverse again
		for (int i=0;i<ar.size();i++) {
			if (!(ar1.get(i).equals(ar.get(i)))) {
				Reporter.log("List is not sorted : Fail",true);	
			}
			
		}
		Reporter.log("List is sorted",true);
	}

}

package scripts;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.GenericUtils;
import pom.HomePage;

public class TestScripts extends BaseTest {
	@Test(enabled=true)
	public void TestAddEmployee() {
		HomePage P = new HomePage(driver);
		P.SetUserName("Admin");
		P.SetPassword("admin123");
		P.ClickLoginBtn();
		BasePage.VerifyTitlePage("OrangeHRM");
		P.ClickPIMMenu();
		P.ClickAddEmp();
		P.SetFName("Robert1");
		P.SetLName("Fernandes");
		P.ClickBtSave();
		P.VerifyFirstName("Robert1");
	}
	@Test(enabled=true)
	public void SortEmployeeList() {
		HomePage P = new HomePage(driver);
		P.SetUserName("Admin");
		P.SetPassword("admin123");
		P.ClickLoginBtn();
		BasePage.VerifyTitlePage("OrangeHRM");
		P.ClickPIMMenu();
		P.ClickEmpList();
		GenericUtils.SortEmpList(driver.findElement(By.id("empsearch_job_title")));
	}
	@Test(enabled=true)
		public void DeleteEmp() throws Throwable  {
			HomePage P = new HomePage(driver);
			driver.manage().window().maximize();
			P.SetUserName("Admin");
			P.SetPassword("admin123");
			P.ClickLoginBtn();
			BasePage.VerifyTitlePage("OrangeHRM");
			P.ClickPIMMenu();
			P.ClickEmpList();
			P.SetEmpName("Manish Nanju");
			P.ClickSearchBtn();
			P.ClickChkBox();
			P.ClickDelBtn();
			P.ClickOKBtn();
			Thread.sleep(3000);
			P.SetEmpName("Manish Nanju");
			Thread.sleep(3000);
			P.ClickSearchBtn();
			P.VerifyRecordsDeleted("No Records Found");
			String ActMsg= driver.findElement(By.xpath("//td[text()='No Records Found']")).getText();
			if (!(ActMsg).equals("No Records Found")) {
				Reporter.log("Records are not deleted successfully : Fail",true);	
			}
			else {
				Reporter.log("Records are deleted successfully",true);
				  }
		
			//Alert alt = driver.switchTo().alert();
			//alt.accept();
			
		}
}

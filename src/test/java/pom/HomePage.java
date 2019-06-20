package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import generic.BasePage;

public class HomePage extends BasePage  {
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	//Declaration
	@FindBy(id ="txtUsername")
	private WebElement unTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement logBTN;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="firstName")
	private WebElement fName;
	@FindBy(id="lastName")
	private WebElement lName;
	@FindBy(id="btnSave")
	private WebElement btnSave;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement EmpFirstName;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement menu_EmpList;
	@FindBy(id="empsearch_employee_name_empName")
	private WebElement EmpName;
	@FindBy(id="searchBtn")
	private WebElement SearchBtn;
	@FindBy(xpath="//td[.='0028']/../td[1]/input")
	private WebElement ChkBox;
	@FindBy(id="btnDelete")
	private WebElement DelBtn;
	@FindBy(id="dialogDeleteBtn")
	private WebElement OKBtn;
	@FindBy(xpath="//td[text()='No Records Found']")
	private WebElement Msg;
	
	//Utilization
	public void SetUserName(String un) {
		unTxtBox.sendKeys(un);
	}
	public void SetPassword(String pwd) {
		pwdTxtBox.sendKeys(pwd);
	}
	public void ClickLoginBtn() {
		logBTN.click();
	}
	public void ClickPIMMenu() {
		pim_Menu.click();
	}
	public void ClickAddEmp() {
		addEmp_Menu.click();
	}
	public void SetFName(String fn) {
		fName.sendKeys(fn);
	}
	public void SetLName(String ln) {
		lName.sendKeys(ln);
	}
	public void ClickBtSave() {
		btnSave.click();
	}
	public void VerifyFirstName(String efn) {
		String afn = EmpFirstName.getAttribute("value");
		Assert.assertEquals(afn,efn);
	}
	public void ClickEmpList() {
		menu_EmpList.click();
	}
	public void SetEmpName(String en ) {
		EmpName.sendKeys(en);
	}
	public void ClickSearchBtn() {
		SearchBtn.click();
	}
	public void ClickChkBox( ) {
		ChkBox.click();
	}
	public void ClickDelBtn( ) {
		DelBtn.click();
	}
	public void ClickOKBtn() {
		OKBtn.click();
	}
	public void VerifyRecordsDeleted(String ExpMsg) {
		String ActMsg = Msg.getText();
		Assert.assertEquals(ActMsg,ExpMsg);
	}
	
}

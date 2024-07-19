package HomeMeta.PageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HomeMeta.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Accept cookies']")
	WebElement acceptCookies;
	@FindBy(xpath = "//div[@name='user_type']//span[@class='ant-select-selection-search']")
	WebElement searchRole;
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='AGENT']")
	WebElement agentRole;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName1;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastName1;
	@FindBy(xpath = "//input[@placeholder='DRE Number']")
	WebElement dreNumber1;
	@FindBy(xpath = "//div[@name='market']//span[@class='ant-select-selection-search']")
	WebElement searchMarket;
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='CRMLS']")
	WebElement market;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@placeholder='Website URL']")
	WebElement url;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email1;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pw1;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement confirmPw;
	By checkbox3 = By.xpath("//input[@placeholder='Email']");
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement checkbox1;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement checkbox2;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement creatAccount;

	@FindBy(xpath = "//input[@id='login']")
	WebElement emailMLNT;
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement btnMLNT;
	@FindBy(xpath = "//td[normalize-space()='noreply@homemeta.io']")
	WebElement emailMLNT1;
	@FindBy(xpath = "//p[normalize-space()='Verify account']")
	WebElement btnVerify;
	By lblVerify = By.xpath("//p[normalize-space()='Verify account']");

	By emailMLNT2 = By.xpath("//td[normalize-space()='noreply@homemeta.io']");

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailLogin;
	By emailLogin1 = By.xpath("//input[@placeholder='Email']");

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwLogin;
	By pwLogin1 = By.xpath("//input[@placeholder='Password']");

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']")
	WebElement btnOkay;
	By btnOkay1 = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']");
	@FindBy(xpath = "//span[normalize-space()='Go Back']")
	WebElement btnGoBack;

	@FindBy(xpath = "//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']")
	WebElement goCampaign;

	@FindBy(xpath = "//div[@name='neighborhoods_mailing_list_ids']//div[@class='ant-select-selection-overflow']")
	WebElement clickSelect;
	By selectField = By
			.xpath("//div[@name='neighborhoods_mailing_list_ids']//div[@class='ant-select-selection-overflow']");

	@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']//div[@class='ant-select-item-option-content']")
	WebElement chooseML;

	@FindBy(xpath = "//div[@name='audience_ids']//div[@class='ant-select-selection-overflow']")
	WebElement clickTA;
	@FindBy(xpath = "//div[contains(text(),'All Homes')]")
	WebElement chooseTA;

	@FindBy(xpath = "//p[@title='name']")
	WebElement chooseTemplate;

	@FindBy(xpath = "//button[normalize-space()='Submit Order']")
	WebElement btnSubmit;
	By btnSubmit1 = By.xpath("//button[normalize-space()='Submit Order']");

	By addDrip1 = By.xpath("//span[@class='text']");

	@FindBy(xpath = "//span[normalize-space()='View Orders']")
	WebElement btnViewOrder;
	By btnViewOrder1 = By.xpath("//span[normalize-space()='View Orders']");

	By btnCreate = By.xpath("//button[normalize-space()='Create Template']");

	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement btnCampaign;
	By btnCampaign1 = By.xpath("(//button[@type='button'])[9]");

	@FindBy(xpath = "//a[@aria-current='page']")
	WebElement settingMenu;
	@FindBy(xpath = "//input[@placeholder='Current Password']")
	WebElement currentPw;
	@FindBy(xpath = "//input[@placeholder='Change Password']")
	WebElement changePw;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement confirmPw1;
	@FindBy(xpath = "//span[normalize-space()='Save Changes']")
	WebElement savePw;
	By savePw1 = By.xpath("//span[normalize-space()='Save Changes']");

	@FindBy(xpath = "//button[normalize-space()='Okay']")
	WebElement btnOk;
	By btnOk1 = By.xpath("//button[normalize-space()='Okay']");
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logOut;
	private List<WebElement> roleName;

	By campaignMenu = By.xpath("//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']");
	By title = By.xpath("//span[@class='title-content']");
	@FindBy(xpath = "//span[@class='title-content']")
	WebElement title1;

	@FindBy(xpath = "//button[normalize-space()='Add Mailing List']")
	WebElement btnaddML;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']")
	WebElement uploadCSV;
	By uploadCSV1 = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']");

	@FindBy(xpath = "//span[normalize-space()='Upload File']")
	WebElement uploadFile;
	By uploadFile1 = By.xpath("//span[normalize-space()='Upload File']");

	@FindBy(xpath = "//input[@type='file']")
	WebElement selectFile;
	By selectFile1 = By.xpath("//span[normalize-space()='Select File']");

	@FindBy(xpath = "//span[normalize-space()='Map & Save']")
	WebElement saveFile;
	@FindBy(xpath = "//input[@placeholder='Name of Mailing List']")
	WebElement nameML;
	@FindBy(xpath = "//span[normalize-space()='ADD MAILING LIST']")
	WebElement addML;

	@FindBy(xpath = "//div[@class='css-d18fnc']")
	WebElement errMessage;
	By errMessage1 = By.xpath("//div[@class='css-d18fnc']");

	public void regisAgentRole(String email, String password, String firstName, String lastName, String dreNumber,
			String numberPhone, String linkURL) throws InterruptedException {
		searchRole.click();
		agentRole.click();
		firstName1.sendKeys(firstName);
		lastName1.sendKeys(lastName);
		dreNumber1.sendKeys(dreNumber);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		url.sendKeys(linkURL);
		waitForElementToApear(checkbox3);

		email1.sendKeys(email);
		pw1.sendKeys(password);
		confirmPw.sendKeys(password);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);

		checkbox1.click();
		checkbox2.click();
		creatAccount.click();
	}

	public void addMailingList() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForElementToApear(title);
		btnaddML.click();
		waitForElementToApear(uploadCSV1);
		uploadCSV.click();
		waitForElementToApear(uploadFile1);
		uploadFile.click();
		waitForElementToApear(selectFile1);
		selectFile.sendKeys("/Users/hoailong/Downloads/import.csv");
		WebElement Element = driver.findElement(By.xpath("//span[normalize-space()='Map & Save']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		saveFile.click();
		nameML.sendKeys("Mailing List Auto");
		acceptCookies.click();
		addML.click();

	}

	public void changePassword(String password) throws InterruptedException {
		String rePw = "Long12345@";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForElementToApear(title);

		driver.get("https://staging-realestate.homemeta.io/settings");
		WebElement Element = driver.findElement(By.xpath("//input[@placeholder='Current Password']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		currentPw.sendKeys(password);
		changePw.sendKeys(rePw);
		confirmPw1.sendKeys(rePw);
		acceptCookies.click();
		waitForElementToApear(savePw1);
		savePw.click();
		waitForElementToApear(btnOk1);
		btnOk.click();
		logOut.click();

	}

	public void goToCampain() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		goCampaign.click();

		waitForElementToApear(btnCreate);

		WebElement Element = driver
				.findElement(By.xpath("//div[@class='field target-field css-21vogu']//label[@class='s-label']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		waitForElementToApear(selectField);
		clickSelect.click();
		chooseML.click();

		Thread.sleep(1500);

		clickSelect.click();
		Thread.sleep(1000);

		clickTA.click();

		chooseTA.click();
		Thread.sleep(3000);
		chooseTemplate.click();
		Thread.sleep(1000);

		WebElement Element1 = driver.findElement(By.xpath("//button[normalize-space()='Submit Order']"));
		js.executeScript("arguments[0].scrollIntoView();", Element1);

		waitForElementToApear(btnSubmit1);
		btnSubmit.click();

		waitForElementToApear(btnCampaign1);
		btnCampaign.click();

		waitForElementToApear(btnViewOrder1);
		btnViewOrder.click();
		WebElement Element2 = driver.findElement(By.xpath("//h2[normalize-space()='Past Orders']"));
		js.executeScript("arguments[0].scrollIntoView();", Element2);

	}

	public void goTo() {
		driver.get("https://staging-realestate.homemeta.io");

	}

	public void goToRegister() {
		driver.get("https://staging-realestate.homemeta.io/register/");

	}

	public void verifyEmail(String email) throws InterruptedException {
		driver.get("https://yopmail.com/");
		emailMLNT.sendKeys(email);
		btnMLNT.click();
//		waitForElementToApear(emailMLNT2);
//		emailMLNT1.click();
		Thread.sleep(1500);

		driver.switchTo().frame(2);
		btnVerify.click();
	}

	public void login(String email, String password) {
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
	}

	public void loginFailed(String email, String password) throws InterruptedException {
		String expected = "Unable to log in with provided credentials.";
		Actions a = new Actions(driver);

		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
		waitForElementToApear(errMessage1);
		String actual = errMessage.getText();
		assertEquals(actual, expected);
		Thread.sleep(1500);

		waitForElementToApear(emailLogin1);
		a.moveToElement(emailLogin).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		a.moveToElement(pwLogin).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();

	}

	public void waitOkaybutton() throws InterruptedException {
		waitForElementToApear(btnOkay1);
		btnOkay.click();
		Thread.sleep(1000);
		btnGoBack.click();
		Thread.sleep(400);
	}

	public Boolean VerifyRole(String roleName1) {

		Boolean match = roleName.stream().anyMatch(role -> role.getText().equalsIgnoreCase(roleName1));
		return match;

	}

}

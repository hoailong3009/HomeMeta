package HomeMeta.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	@FindBy(xpath = "(//input[@id='search'])[1]")
	WebElement emailMLNT;
	@FindBy(xpath = "//button[normalize-space()='GO']")
	WebElement btnMLNT;
	@FindBy(xpath = "//td[normalize-space()='noreply@homemeta.io']")
	WebElement emailMLNT1;
	@FindBy(xpath = "//a[normalize-space()='Verify account']")
	WebElement btnVerify;
	By emailMLNT2 = By.xpath("//td[normalize-space()='noreply@homemeta.io']");

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailLogin;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwLogin;
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

	@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']//div[@class='ant-select-item-option-content']")
	WebElement chooseML;

	@FindBy(xpath = "//div[@name='audience_ids']//div[@class='ant-select-selection-overflow']")
	WebElement clickTA;
	@FindBy(xpath = "//div[contains(text(),'All Homes')]")
	WebElement chooseTA;

	// @FindBy(xpath = "(//input[@id='rc_select_5'])[1]")
	// WebElement clickLandingPage;
	// @FindBy(xpath = "//div[contains(text(),'@@2')]")
	// WebElement chooseLandingPage;

	@FindBy(xpath = "//p[@title='name']")
	WebElement chooseTemplate;

	@FindBy(xpath = "//button[normalize-space()='Submit Order']")
	WebElement btnSubmit;

	By btnSubmit1 = By.xpath("//button[normalize-space()='Submit Order']");

	@FindBy(xpath = "//span[normalize-space()='View Orders']")
	WebElement btnViewOrder;
	By btnViewOrder1 = By.xpath("//span[normalize-space()='View Orders']");

	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement btnCampaign;
	By btnCampaign1 = By.xpath("(//button[@type='button'])[9]");

	private List<WebElement> roleName;

	By campaignMenu = By.xpath("//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']");

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

	public void goToCampain() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		goCampaign.click();
		Thread.sleep(2000);
		WebElement Element = driver.findElement(By.xpath("//input[@id='rc_select_5']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(800);
		clickSelect.click();
		chooseML.click();
		Thread.sleep(1500);

		clickSelect.click();
		Thread.sleep(1000);

		clickTA.click();
		Thread.sleep(2000);

		chooseTA.click();
		Thread.sleep(3000);

		// clickLandingPage.click();
		// Thread.sleep(2000);
		// chooseLandingPage.click();

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
	}

	public void goTo() {
		driver.get("https://staging-realestate.homemeta.io");

	}

	public void verifyEmail(String email) throws InterruptedException {
		driver.get("https://www.mailinator.com/");
		emailMLNT.sendKeys(email);
		btnMLNT.click();
		waitForElementToApear(emailMLNT2);
		emailMLNT1.click();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		btnVerify.click();
	}

	public void login(String email, String password) {
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
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

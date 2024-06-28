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

	@FindBy(xpath = "//a[@href='/agent-report']//p")
	private List<WebElement> roleName;

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

	public void goTo() {
		driver.get("https://staging-realestate.homemeta.io/register");

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

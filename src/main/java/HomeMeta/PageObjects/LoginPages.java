package HomeMeta.PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HomeMeta.AbstractComponents.AbstractComponent;

public class LoginPages extends AbstractComponent {

	WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailLogin;
	By emailLogin1 = By.xpath("//input[@placeholder='Email']");

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwLogin;
	By pwLogin1 = By.xpath("//input[@placeholder='Password']");

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;
	By title = By.xpath("//span[@class='title-content']");

	@FindBy(xpath = "//h1[normalize-space()='Manager Dashboard']")
	WebElement titleManager;
	By titleManager1 = By.xpath("//h1[normalize-space()='Manager Dashboard']");
	@FindBy(xpath = "//span[@class='title-content']")
	WebElement title1;
	@FindBy(xpath = "//div[@class='css-d18fnc']")
	WebElement errMessage;
	By errMessage1 = By.xpath("//div[@class='css-d18fnc']");

	public LoginPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://staging-realestate.homemeta.io");

	}

	public void login(String email, String password) {
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
	}

	public void loginFailed(String email, String password) throws InterruptedException {
		Actions a = new Actions(driver);
		String expected = "Unable to log in with provided credentials.";
		emailLogin.clear();
		pwLogin.clear();
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

	public void loginAgentSuccess(String email, String password) {
		String expected = "Mailing Lists";
		emailLogin.clear();
		pwLogin.clear();
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
		waitForElementToApear(title);
		String actual = title1.getText();
		assertEquals(actual, expected);
		System.out.println("Agent Login Test Passed");
	}

	public void loginManagerSuccess(String email, String password) {
		String expected = "Manager Dashboard";
		emailLogin.clear();
		pwLogin.clear();
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
		waitForElementToApear(titleManager1);
		String actual = titleManager.getText();
		assertEquals(actual, expected);
		System.out.println("Manager Login Test Passed");
	}

	public void loginBrokerSuccess(String email, String password) {
		String expected = "My Agents";
		emailLogin.clear();
		pwLogin.clear();
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
		waitForElementToApear(title);
		String actual = title1.getText();
		assertEquals(actual, expected);
		System.out.println("Broker Login Test Passed");
	}

}

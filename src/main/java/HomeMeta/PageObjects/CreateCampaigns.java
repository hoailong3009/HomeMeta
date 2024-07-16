package HomeMeta.PageObjects;

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

public class CreateCampaigns extends AbstractComponent {

	WebDriver driver;

	public CreateCampaigns(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailLogin;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwLogin;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;
	@FindBy(xpath = "//a[normalize-space()='Drip Campaigns']")
	WebElement menuDripCampaign;
	By menuDripCampaign1 = By.xpath("//a[normalize-space()='Drip Campaigns']");

	@FindBy(xpath = "//span[normalize-space()='Add New Drip']")
	WebElement addNewDrip;

	@FindBy(xpath = "//div[@name='response_type']//div[@class='ant-select-selector']")
	WebElement responeType;
	By responeType1 = By.xpath("//div[@name='response_type']//div[@class='ant-select-selector']");

	@FindBy(xpath = "//div[contains(text(),'Email')]")
	WebElement typeEmail;

	@FindBy(xpath = "//span[normalize-space()='Save Template']")
	WebElement saveTemplate;

	@FindBy(xpath = "//span[@class='text']")
	WebElement addDrip;
	By addDrip1 = By.xpath("//span[@class='text']");

	@FindBy(xpath = "//p[@title='Drip Campaign']")
	WebElement templateName;
	By templateName1 = By.xpath("//p[@title='Drip Campaign']");

	@FindBy(xpath = "//span[normalize-space()='View Orders']")
	WebElement btnViewOrder;
	By btnViewOrder1 = By.xpath("//span[normalize-space()='View Orders']");

	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement btnCampaign;
	By btnCampaign1 = By.xpath("(//button[@type='button'])[9]");

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default btn-save drip-field']")
	WebElement saveAction;
	@FindBy(xpath = "//span[normalize-space()='SAVE DRIP CAMPAIGN']")
	WebElement saveDripCampaign;
	@FindBy(xpath = "//button[@aria-label='Accept cookies']")
	WebElement acceptCookies;

	@FindBy(xpath = "(//div[@id='rc-tabs-9-tab-DRIP_CAMPAIGN'])[1]")
	WebElement goToDripCampaigns;
	By goToDripCampaigns1 = By.xpath("(//div[@id='rc-tabs-9-tab-DRIP_CAMPAIGN'])[1]");

	@FindBy(xpath = "//span[normalize-space()='Add New Drip']")
	WebElement btnaddNewDrip;
	@FindBy(xpath = "(//span[@class='text'])[1]")
	WebElement btnaddDrip;
	@FindBy(xpath = "//div[@name='response_type']//div[@class='ant-select-selector']")
	WebElement responeType2;

	@FindBy(xpath = "//span[@aria-label='edit']//*[name()='svg']")
	WebElement editname;
	@FindBy(xpath = "//input[@placeholder='Enter New Name']")
	WebElement nameCampaign;
	By nameCampaign1 = By.xpath("//input[@placeholder='Enter New Name']");

	@FindBy(xpath = "//span[normalize-space()='Save Changes']")
	WebElement saveDripname;

	By campaignMenu = By.xpath("//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']");

	@FindBy(xpath = "//h2[normalize-space()]")
	private List<WebElement> smartTriggersTitles;

	public void createDripsSmartStriggers(String smartStriggerName) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[normalize-space()='Drip Campaigns']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		menuDripCampaign.click();
		addNewDrip.click();
		Thread.sleep(3000);

		editname.click();
		waitForElementToApear(nameCampaign1);
		Actions a = new Actions(driver);
		a.moveToElement(nameCampaign).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(1000);

		nameCampaign.sendKeys(smartStriggerName);
		saveDripname.click();
		waitForElementToApear(addDrip1);

		addDrip.click();
		waitForElementToApear(responeType1);
		responeType.click();
		typeEmail.click();
		waitForElementToApear(templateName1);
		templateName.click();
		Thread.sleep(1500);

		WebElement Element1 = driver.findElement(By.xpath("//span[normalize-space()='Save Template']"));
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		saveTemplate.click();
		saveAction.click();
		WebElement Element2 = driver.findElement(By.xpath("//span[normalize-space()='SAVE DRIP CAMPAIGN']"));
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		acceptCookies.click();
		saveDripCampaign.click();
		Thread.sleep(1000);
	}

	public void createDripCampaigns(String dripCampaignName) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForElementToApear(menuDripCampaign1);

		goToDripCampaign();

		btnaddNewDrip.click();
		Thread.sleep(3000);
		editname.click();
		waitForElementToApear(nameCampaign1);

		Actions a = new Actions(driver);
		a.moveToElement(nameCampaign).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(1000);
		nameCampaign.sendKeys(dripCampaignName);
		saveDripname.click();
		waitForElementToApear(addDrip1);

		btnaddDrip.click();
		responeType2.click();
		typeEmail.click();
		waitForElementToApear(templateName1);
		templateName.click();
		Thread.sleep(1500);

		WebElement Element1 = driver.findElement(By.xpath("//span[normalize-space()='Save Template']"));
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		saveTemplate.click();
		saveAction.click();
		WebElement Element2 = driver.findElement(By.xpath("//span[normalize-space()='SAVE DRIP CAMPAIGN']"));
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		acceptCookies.click();
		saveDripCampaign.click();

	}

	public void goTo() {
		driver.get("https://staging-realestate.homemeta.io");

	}

	public void goToDripCampaign() {
		driver.get("https://staging-realestate.homemeta.io/drip-campaigns/?tab=DRIP_CAMPAIGN");

	}

	public void login(String email, String password) {
		emailLogin.sendKeys(email);
		pwLogin.sendKeys(password);
		btnLogin.click();
	}

	public Boolean VerifyDripsCampaignDisplay(String dripCampaignName) {
		Boolean match = smartTriggersTitles.stream()
				.anyMatch(dripName -> dripName.getText().equalsIgnoreCase(dripCampaignName));
		return match;
	}

	public Boolean VerifySmartTriggersDisplay(String smartStriggerName) {
		Boolean match = smartTriggersTitles.stream()
				.anyMatch(triggersName -> triggersName.getText().equalsIgnoreCase(smartStriggerName));
		return match;
	}

}

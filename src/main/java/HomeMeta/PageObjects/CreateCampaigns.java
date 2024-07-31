package HomeMeta.PageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

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
	@FindBy(xpath = "//div[contains(text(),'Mail Campaign')]")
	WebElement typeMailCampaign;
	@FindBy(xpath = "//div[contains(text(),'Text')]")
	WebElement typeText;
	@FindBy(xpath = "//div[contains(text(),'Agent Notification')]")
	WebElement agentNoti;
	By lbl = By.xpath("//p[normalize-space()='Message Editor']");
	@FindBy(xpath = "//span[normalize-space()='agent_name']")
	WebElement agentName;
	@FindBy(xpath = "//span[normalize-space()='agent_email']")
	WebElement agentEmail;
	@FindBy(xpath = "//span[normalize-space()='full_name']")
	WebElement fullName;
	@FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
	WebElement btnSave;

	@FindBy(xpath = "//span[normalize-space()='Save Template']")
	WebElement saveTemplate;

	@FindBy(xpath = "//span[@class='text']")
	WebElement addDrip;
	By addDrip1 = By.xpath("//span[@class='text']");

	@FindBy(xpath = "//p[@title='Drip Campaign']")
	WebElement templateName;
	By templateName1 = By.xpath("//p[@title='Drip Campaign']");
	By lblTemplate = By.xpath("//p[@class='personal-information']");

	@FindBy(xpath = "//span[@title='Any Type']")
	WebElement clickType;
	@FindBy(xpath = "//div[contains(text(),'Postcards only')]")
	WebElement chooseType;
	By typePostcard = By.xpath("//div[@class='postcard-img']");

	@FindBy(xpath = "//span[normalize-space()='View Orders']")
	WebElement btnViewOrder;
	By btnViewOrder1 = By.xpath("//span[normalize-space()='View Orders']");

	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement btnCampaign;
	By btnCampaign1 = By.xpath("(//button[@type='button'])[9]");

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default btn-save drip-field']")
	WebElement saveAction;
	By saveAction1 = By.xpath("//button[@class='ant-btn ant-btn-default btn-save drip-field']");

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

	@FindBy(xpath = "//div[@class='action-btn-group']//span[@aria-label='edit']")
	WebElement editname;
	By editname1 = By.xpath("//h2[normalize-space()='Add Drip For Smart Trigger']");
	By title = By.xpath("//span[@class='title-content']");

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[6]")
	WebElement duplicated;
	@FindBy(xpath = "(//*[name()='svg'])[12]")
	WebElement deleted;
	@FindBy(xpath = "(//*[name()='path'])[15]")
	WebElement clone;

	@FindBy(xpath = "//span[normalize-space()='Confirm']")
	WebElement confirm;
	By confirm1 = By.xpath("//span[normalize-space()='Confirm']");

	@FindBy(xpath = "//span[normalize-space()='Go To Drip Campaigns']")
	WebElement goDripCampaign;
	By goDripCampaign1 = By.xpath("//span[normalize-space()='Go To Drip Campaigns']");

	@FindBy(xpath = "//h2[normalize-space()='Rename Drip Type Mail Campaign Auto (Copy)']")
	WebElement campaignDuplicated;
	By campaignDuplicated1 = By.xpath("//h2[normalize-space()='Rename Drip Type Mail Campaign Auto (Copy)']");
	By nameDripCampaign = By.xpath("//h2[normalize-space()]");

	// h2[normalize-space()]
	@FindBy(xpath = "//input[@placeholder='Enter New Name']")
	WebElement nameCampaign;
	By nameCampaign1 = By.xpath("//input[@placeholder='Enter New Name']");

	@FindBy(xpath = "//span[normalize-space()='Save Changes']")
	WebElement saveDripname;

	By campaignMenu = By.xpath("//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']");

	@FindBy(xpath = "//h2[normalize-space()]")
	private List<WebElement> smartTriggersTitles;

	public void createDripsSmartStriggersTypeEmail(String smartStriggerName) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForElementToApear(title);
		goToDripSmartTrigger();
		addNewDrip.click();
		waitForElementToApear(editname1);
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
		WebElement Element1 = saveTemplate;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		saveTemplate.click();
		saveAction.click();
		WebElement Element2 = saveDripCampaign;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		acceptCookies.click();
		saveDripCampaign.click();
		Thread.sleep(1000);
	}

	public void createDripsSmartStriggersTypeText(String smartStriggerName) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		addNewDrip.click();
		waitForElementToApear(editname1);
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
		typeText.click();
		waitForElementToApear(lbl);
		agentName.click();
		Thread.sleep(500);
		agentEmail.click();
		Thread.sleep(500);
		fullName.click();
		btnSave.click();
		Thread.sleep(2000);
		waitForElementToApear(saveAction1);
		saveAction.click();
		WebElement Element2 = saveDripCampaign;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		saveDripCampaign.click();
		Thread.sleep(1000);
	}

	public void createDripsAgentNoti(String smartStriggerName) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		addNewDrip.click();
		waitForElementToApear(editname1);
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
		agentNoti.click();
		waitForElementToApear(lbl);
		agentEmail.click();
		Thread.sleep(500);
		fullName.click();
		btnSave.click();
		Thread.sleep(2000);
		waitForElementToApear(saveAction1);
		saveAction.click();
		WebElement Element2 = saveDripCampaign;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		saveDripCampaign.click();
		Thread.sleep(1000);
	}

	public void createDripsSmartStriggersTypeMailCampaign(String smartStriggerName) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		addNewDrip.click();
		waitForElementToApear(editname1);
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
		typeMailCampaign.click();
		waitForElementToApear(lblTemplate);
		clickType.click();
		chooseType.click();
		Thread.sleep(6000);
		WebElement Element1 = saveTemplate;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		saveTemplate.click();
		saveAction.click();
		WebElement Element2 = saveDripCampaign;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
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
		WebElement Element1 = saveTemplate;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		saveTemplate.click();
		saveAction.click();
		WebElement Element2 = saveDripCampaign;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		saveDripCampaign.click();
	}

	public void renameDripsmartTrigger(String renameDripCampaign) throws InterruptedException {
		editname.click();
		waitForElementToApear(nameCampaign1);
		Actions a = new Actions(driver);
		a.moveToElement(nameCampaign).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(1000);
		nameCampaign.sendKeys(renameDripCampaign);
		saveDripname.click();
	}

	public void duplicatedDripsmartTrigger() throws InterruptedException {
		String nameDuplicatedExpected = "Rename Drip Type Mail Campaign Auto (Copy)";
		duplicated.click();
		waitForElementToApear(confirm1);
		confirm.click();
		waitForElementToApear(campaignDuplicated1);
		String nameDuplicated = campaignDuplicated.getText();
		assertEquals(nameDuplicated, nameDuplicatedExpected);
		System.out.println("Verify duplicated Drip SmartTrigger success");
	}

	public void deledtedDripsmartTrigger() throws InterruptedException {
		deleted.click();
		waitForElementToApear(confirm1);
		confirm.click();
		waitForElementToApear(nameDripCampaign);
		assertFalse(false, campaignDuplicated.getText());
		System.out.println("Deleted Drip SmartTrigger success");
	}

	public void cloneDripsmartTrigger() throws InterruptedException {
		clone.click();
		waitForElementToApear(confirm1);
		confirm.click();
		waitForElementToApear(goDripCampaign1);
		goDripCampaign.click();
		waitForElementToApear(nameDripCampaign);
		//
		System.out.println("Clone Drip SmartTrigger success");
	}

	public void goTo() {
		driver.get("https://staging-realestate.homemeta.io");

	}

	public void goToDripCampaign() {
		driver.get("https://staging-realestate.homemeta.io/drip-campaigns/?tab=DRIP_CAMPAIGN");

	}

	public void goToDripSmartTrigger() {
		driver.get("https://staging-realestate.homemeta.io/drip-campaigns");

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

	public Boolean VerifyRenameSmartTrigger(String smartStriggerName) {
		Boolean match = smartTriggersTitles.stream()
				.anyMatch(triggersName -> triggersName.getText().equalsIgnoreCase(smartStriggerName));
		return match;
	}

}

package HomeMeta.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HomeMeta.AbstractComponents.AbstractComponent;

public class SmartActionsPage extends AbstractComponent {

	WebDriver driver;

	public SmartActionsPage(WebDriver driver) {
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

	By campaignMenu = By.xpath("//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']");

	@FindBy(xpath = "//h2[normalize-space()]")
	private List<WebElement> smartTriggersTitles;

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

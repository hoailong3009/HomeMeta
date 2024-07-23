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

	@FindBy(xpath = "//input[@placeholder='Admin in charge First Name']")
	WebElement adFirstname;
	@FindBy(xpath = "//input[@placeholder='Admin in charge Last Name']")
	WebElement adLastname;
	@FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement companyName;
	@FindBy(xpath = "//div[@name='markets']//div[@class='ant-select-selector']")
	WebElement searchMarket1;

	@FindBy(xpath = "//input[@placeholder='Broker Agent Email']")
	WebElement brokerEmail;

	@FindBy(xpath = "//button[@aria-label='Accept cookies']")
	WebElement acceptCookies;
	By acceptCookies1 = By.xpath("//button[@aria-label='Accept cookies']");

	@FindBy(xpath = "//div[@name='user_type']//span[@class='ant-select-selection-search']")
	WebElement searchRole;
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='AGENT']")
	WebElement agentRole;
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='MANAGER']")
	WebElement managerRole;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName1;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastName1;
	@FindBy(xpath = "//input[@placeholder='DRE Number']")
	WebElement dreNumber1;
	@FindBy(xpath = "//div[@class='field dre-field css-edr8nd']//label[@class='s-label']")
	WebElement lbldreNumber;

	By errDreNumber = By.xpath("//div[normalize-space()='DRE number is already associated with an existing account.']");
	@FindBy(xpath = "//div[normalize-space()='DRE number is already associated with an existing account.']")
	WebElement errDreNumber1;
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
	@FindBy(xpath = "//div[@class='field email-field css-edr8nd']//label[@class='s-label']")
	WebElement lblEmail;

	By email2 = By.xpath("//input[@placeholder='Email']");

	@FindBy(xpath = "//div[normalize-space()='Email is already associated with an existing account.']")
	WebElement erroEmail;
	By erroEmail1 = By.xpath("//div[normalize-space()='Email is already associated with an existing account.']");

	@FindBy(xpath = "//input[@placeholder='Broker Agent Email']")
	WebElement emailBroker;
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
	@FindBy(xpath = "//div[@class='css-d18fnc']")
	WebElement errorNotfound;
	By errorNotfound1 = By.xpath("//div[@class='css-d18fnc']");

	@FindBy(xpath = "//div[@name='sub_id']//span[@class='ant-select-selection-search']")
	WebElement selectSub;
	By selectSub1 = By.xpath("//div[@name='sub_id']//span[@class='ant-select-selection-search']");
	@FindBy(xpath = "//div[contains(text(),'Loan Broker - Monthly - $10')]")
	WebElement chooseSub;
	@FindBy(xpath = "//input[@placeholder='Number of Agents']")
	WebElement numberAgent;
	@FindBy(xpath = "//input[@placeholder='CSV URL']")
	WebElement csvFile;
	@FindBy(xpath = "//span[normalize-space()='Continue']")
	WebElement ctnBtn;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement ctnBtn1;
	@FindBy(xpath = "//button[normalize-space()='Get my first inbox!']")
	WebElement btnGetIb;

	@FindBy(xpath = "//input[@id='username']")
	WebElement inputEmail;
	By inputEmail1 = By.xpath("//input[@id='username']");
	@FindBy(xpath = "//button[normalize-space()='Add Inbox']")
	WebElement btnAddIb;

	@FindBy(xpath = "//input[@id='login']")
	WebElement getEmail;
	By getEmail1 = By.xpath("//span[contains(text(),'noreply@homemeta')]");
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement goEmail;

	@FindBy(xpath = "//p[contains(text(),'Please activate your account by clicking the link ')]")
	WebElement verifyEmail;
	@FindBy(xpath = "//a[contains(text(),'Verify account')]")
	WebElement verifyEmail1;
	By emailMLNT2 = By.xpath("//td[normalize-space()='noreply@homemeta.io']");

	By waitEmail = By.xpath("//span[contains(text(),'noreply')]");

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

	@FindBy(xpath = "//p[contains(text(),'Agent')]")
	private List<WebElement> roleName;

	By roleName2 = By.xpath("//p[contains(text(),'Agent')]");

	@FindBy(xpath = "//h1[normalize-space()='Manager Dashboard']")
	private List<WebElement> roleManager;

	By roleName3 = By.xpath("//p[contains(text(),'Broker')]");
	@FindBy(xpath = "//p[contains(text(),'Broker')]")
	private List<WebElement> roleBroker;

	@FindBy(xpath = "//td[normalize-space()]")
	private List<WebElement> nameMailingList;
	By listMailingList = By.xpath("//h3[normalize-space()='My Mailing Lists']");

	By roleManager1 = By.xpath("//h1[normalize-space()='Manager Dashboard']");

	By campaignMenu = By.xpath("//a[@href='/agent-campaigns/?tab=CAMPAIGNS_FORM']");
	By title = By.xpath("//span[@class='title-content']");
	@FindBy(xpath = "//span[@class='title-content']")
	WebElement title1;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary btn-skip css-wr3wd2']")
	WebElement btnSkip;
	By btnSkip1 = By.xpath("//button[@class='ant-btn ant-btn-primary btn-skip css-wr3wd2']");

	@FindBy(xpath = "//button[normalize-space()='Add Mailing List']")
	WebElement btnaddML;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']")
	WebElement uploadCSV;
	By uploadCSV1 = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']");
	@FindBy(xpath = "//span[normalize-space()='Draw area on map']")
	WebElement draw;

	@FindBy(xpath = "//span[normalize-space()='Upload File']")
	WebElement uploadFile;
	By uploadFile1 = By.xpath("//span[normalize-space()='Upload File']");
	By lbladdMl = By.xpath("//h1[normalize-space()='Add Mailing List']");
	@FindBy(xpath = "//div[@class='gm-style']//div[3]//div[2]")
	WebElement map;
	@FindBy(xpath = "//input[@placeholder='Name of Mailing List']")
	WebElement nameMl;
	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement btnNext;
	By btnNext1 = By.xpath("//span[normalize-space()='Next']");

	@FindBy(xpath = "//input[@id='pac-input']")
	WebElement search;
	@FindBy(xpath = "//span[@aria-label='search']//*[name()='svg']")
	WebElement btnsearch;
	By btnsearch1 = By.xpath("//span[@aria-label='search']//*[name()='svg']");

	@FindBy(xpath = "//input[@type='file']")
	WebElement selectFile;
	By selectFile1 = By.xpath("//span[normalize-space()='Select File']");

	@FindBy(xpath = "//span[normalize-space()='Confirm']")
	WebElement btnConfirmML;
	By textTurnover = By.xpath("//li[2]//span[1]");

	By errorML1 = By.xpath("//span[normalize-space()='Mailing List is not found']");
	@FindBy(xpath = "//span[normalize-space()='Mailing List is not found']")
	WebElement errorML;

	@FindBy(xpath = "//span[normalize-space()='Map & Save']")
	WebElement saveFile;

	@FindBy(xpath = "//input[@placeholder='Name of Mailing List']")
	WebElement nameML;
	@FindBy(xpath = "//span[normalize-space()='ADD MAILING LIST']")
	WebElement addML;
	@FindBy(xpath = "//input[@placeholder='Enter Full Name']")
	WebElement paymentInfo;
	@FindBy(xpath = "//input[@placeholder='XXXX-XXXX-XXXX-XXXX']")
	WebElement numberCard;

	@FindBy(xpath = "//input[@placeholder='MM/YY']")
	WebElement expired;

	@FindBy(xpath = "//input[@placeholder='CVV']")
	WebElement cvv;
	@FindBy(xpath = "//input[@placeholder='Enter Zip Code']")
	WebElement zipcode;

	@FindBy(xpath = "//span[normalize-space()='Confirm Purchase & Create Account']")
	WebElement btnConfirm;

	By paymentInfo1 = By.xpath("//input[@placeholder='Enter Full Name']");

	By okBtn = By.xpath("//button[@type='button']");

	@FindBy(xpath = "(//label[@class='s-label'])[5]")
	WebElement lbl;
	@FindBy(xpath = "//div[@class='field email-field css-1mpvq7i']//label[@class='s-label']")
	WebElement lbl2;
	@FindBy(xpath = "(//label[@class='s-label'])[9]")
	WebElement lbl4;

	@FindBy(xpath = "//div[normalize-space()='Email is already associated with an existing account.']")
	WebElement lbl3;
	By lbl33 = By.xpath("//div[normalize-space()='Email is already associated with an existing account.']");

	@FindBy(xpath = "//div[@class='field email-fiecld css-edr8nd']//label[@class='s-label']")
	WebElement lbl1;
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
		WebElement Element = searchMarket;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		url.sendKeys(linkURL);
		waitForElementToApear(checkbox3);

		email1.sendKeys(email);
		pw1.sendKeys(password);
		confirmPw.sendKeys(password);
		WebElement Element1 = checkbox1;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(1000);

		checkbox1.click();
		checkbox2.click();
		creatAccount.click();
	}

	public void regisAgentNotfound(String email, String password, String firstName, String lastName, String dreNumber,
			String numberPhone, String linkURL) throws InterruptedException {
		String expectedErrorNotFound = "Agent Not Found";
		searchRole.click();
		agentRole.click();
		firstName1.sendKeys(firstName);
		lastName1.sendKeys(lastName);
		dreNumber1.sendKeys(dreNumber);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = searchMarket;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		url.sendKeys(linkURL);
		email1.sendKeys(email);
		pw1.sendKeys(password);
		confirmPw.sendKeys(password);
		WebElement Element1 = checkbox1;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(1000);
		checkbox1.click();
		checkbox2.click();
		creatAccount.click();
		waitForElementToApear(errorNotfound1);
		String actualErrorNotFound = errorNotfound.getText();
		assertEquals(actualErrorNotFound, expectedErrorNotFound);
		System.out.println("Test User not found Sucess");

	}

	public void regisAgentRoleFailed(String email, String password, String firstName, String lastName, String dreNumber,
			String numberPhone, String linkURL) throws InterruptedException {
		String dreErrorExpected = "DRE number is already associated with an existing account.";
		String emailErrorExpected = "Email is already associated with an existing account.";
		JavascriptExecutor js = (JavascriptExecutor) driver;

		searchRole.click();
		agentRole.click();
		firstName1.sendKeys(firstName);
		lastName1.sendKeys(lastName);
		WebElement Element = dreNumber1;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);

		dreNumber1.sendKeys(dreNumber);
		Thread.sleep(1000);

		WebElement clickable = lbl;
		new Actions(driver).click(clickable).perform();
		waitForElementToApear(errDreNumber);
		String dreErrorActual = errDreNumber1.getText();
		assertEquals(dreErrorActual, dreErrorExpected);

		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		url.sendKeys(linkURL);
		email1.sendKeys(email);
		Thread.sleep(1000);

		WebElement clickable1 = lbl;
		new Actions(driver).click(clickable1).perform();
		waitForElementToApear(erroEmail1);
		String emailErrorActual = erroEmail.getText();
		assertEquals(emailErrorActual, emailErrorExpected);
		System.out.println("Test DREnumber exist and Email exist success");
	}

	public void regisManagerRole(String email, String password, String firstName, String lastName, String dreNumber,
			String numberPhone) throws InterruptedException {
		searchRole.click();
		managerRole.click();
		firstName1.sendKeys(firstName);
		lastName1.sendKeys(lastName);
		dreNumber1.sendKeys(dreNumber);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = searchMarket;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		waitForElementToApear(checkbox3);

		email1.sendKeys(email);
		pw1.sendKeys(password);
		confirmPw.sendKeys(password);
		WebElement Element1 = checkbox1;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(1000);

		checkbox1.click();
		checkbox2.click();
		creatAccount.click();
	}

	public void regisManagerFailed(String email, String password, String firstName, String lastName, String dreNumber,
			String numberPhone) throws InterruptedException {
		String dreErrorExpected = "DRE number is already associated with an existing account.";
		String emailErrorExpected = "Email is already associated with an existing account.";
		JavascriptExecutor js = (JavascriptExecutor) driver;

		searchRole.click();
		managerRole.click();
		firstName1.sendKeys(firstName);
		lastName1.sendKeys(lastName);
		WebElement Element = dreNumber1;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		dreNumber1.sendKeys(dreNumber);

		Thread.sleep(1000);

		WebElement clickable = lbl;
		new Actions(driver).click(clickable).perform();
		waitForElementToApear(errDreNumber);
		String dreErrorActual = errDreNumber1.getText();
		assertEquals(dreErrorActual, dreErrorExpected);

		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		email1.sendKeys(email);
		Thread.sleep(1000);

		WebElement clickable1 = lbl;
		new Actions(driver).click(clickable1).perform();
		waitForElementToApear(erroEmail1);
		String emailErrorActual = erroEmail.getText();
		assertEquals(emailErrorActual, emailErrorExpected);
		System.out.println("Test DREnumber exist and Email exist success");
	}

	public void regisManagerNotFound(String email, String password, String firstName, String lastName, String dreNumber,
			String numberPhone) throws InterruptedException {
		String expectedErrorNotFound = "Agent Not Found";

		searchRole.click();
		managerRole.click();
		firstName1.sendKeys(firstName);
		lastName1.sendKeys(lastName);
		dreNumber1.sendKeys(dreNumber);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = searchMarket;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		searchMarket.click();
		market.click();
		phone.sendKeys(numberPhone);
		waitForElementToApear(checkbox3);

		email1.sendKeys(email);
		pw1.sendKeys(password);
		confirmPw.sendKeys(password);
		WebElement Element1 = checkbox1;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(1000);

		checkbox1.click();
		checkbox2.click();
		creatAccount.click();
		waitForElementToApear(errorNotfound1);
		String actualErrorNotFound = errorNotfound.getText();
		assertEquals(actualErrorNotFound, expectedErrorNotFound);
		System.out.println("Test User not found Sucess");
	}

	public void regisBrokerRole(String company, String firstname, String lastName, String numberPhone, String linkURL,
			String email, String password) throws InterruptedException {

		companyName.sendKeys(company);
		adFirstname.sendKeys(firstname);
		adLastname.sendKeys(lastName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = searchMarket1;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		searchMarket1.click();
		market.click();
		phone.sendKeys(numberPhone);
		url.sendKeys(linkURL);

		WebElement Element1 = emailBroker;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(500);

		emailBroker.sendKeys(email);
		pw1.sendKeys(password);
		confirmPw.sendKeys(password);
		checkbox1.click();
		checkbox2.click();
		Thread.sleep(2000);
		WebElement Element2 = ctnBtn1;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		Thread.sleep(1000);

		ctnBtn1.click();
		Thread.sleep(2000);

		selectSub.click();
		chooseSub.click();
		numberAgent.sendKeys("10");
		csvFile.sendKeys("https://staging-homemeta-api-media.s3.amazonaws.com/media/FileCSV_Admin+(2).csv");
		Thread.sleep(1000);

		ctnBtn.click();
		Thread.sleep(1000);
		waitForElementToApear(paymentInfo1);
		paymentInfo.sendKeys("long quach");
		driver.switchTo().frame(2);
		numberCard.sendKeys("4242424242424242");
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.switchTo().frame(3);
		expired.sendKeys("1234");
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.switchTo().frame(4);
		cvv.sendKeys("5678");
		driver.switchTo().defaultContent();
		zipcode.sendKeys("12412");
		WebElement Element3 = btnConfirm;
		js.executeScript("arguments[0].scrollIntoView();", Element3);
		btnConfirm.click();
		waitForElementToApear(okBtn);
	}

	public void regisBrokerFailed(String company, String firstname, String lastName, String numberPhone, String linkURL,
			String email, String password) throws InterruptedException {
		String expectedError = "Email is already associated with an existing account.";
		companyName.sendKeys(company);
		adFirstname.sendKeys(firstname);
		adLastname.sendKeys(lastName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = searchMarket1;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
		searchMarket1.click();
		market.click();
		phone.sendKeys(numberPhone);
		url.sendKeys(linkURL);

		WebElement Element1 = lbl2;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(1000);
		emailBroker.sendKeys(email);
		Thread.sleep(1000);

		WebElement clickable = lbl4;
		new Actions(driver).click(clickable).perform();
		waitForElementToApear(lbl33);

		String actualError = lbl3.getText();
		assertEquals(actualError, expectedError);
		System.out.println("Test User exist Success");

	}

	public void addMailingListImportFile() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForElementToApear(title);
		btnaddML.click();
		waitForElementToApear(uploadCSV1);
		uploadCSV.click();
		waitForElementToApear(uploadFile1);
		uploadFile.click();
		waitForElementToApear(selectFile1);
		selectFile.sendKeys("/Users/hoailong/Downloads/import.csv");
		WebElement Element = saveFile;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		saveFile.click();
		nameML.sendKeys("Mailing List Auto");
		acceptCookies.click();
		addML.click();
	}

	public void addMailingListDraw(String nameMailingList1) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForElementToApear(title);
		btnaddML.click();
		waitForElementToApear(uploadCSV1);
		draw.click();
		waitForElementToApear(acceptCookies1);
		acceptCookies.click();
		waitForElementToApear(btnsearch1);
		search.sendKeys("Magnolia Street Irvine");
		btnsearch.click();
		Thread.sleep(2000);
		Actions vertex1 = new Actions(driver);
		vertex1.moveToElement(map).moveByOffset(-20, 200).click().build().perform();
		Actions vertex2 = new Actions(driver);
		vertex2.moveToElement(map).moveByOffset(300, 200).click().build().perform();
		Actions vertex3 = new Actions(driver);
		vertex3.moveToElement(map).moveByOffset(300, -170).click().build().perform();
		Actions vertex4 = new Actions(driver);
		vertex4.moveToElement(map).moveByOffset(-20, -170).click().build().perform();
		Actions vertex5 = new Actions(driver);
		vertex5.moveToElement(map).moveByOffset(-90, 80).click().build().perform();
		Actions vertex6 = new Actions(driver);
		vertex6.moveToElement(map).moveByOffset(-20, 200).doubleClick().build().perform();
		nameMl.sendKeys(nameMailingList1);
		waitForElementToApear(btnNext1);
		btnNext.click();
		waitForTextChanged(textTurnover);
		WebElement Element = btnConfirmML;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);

		btnConfirmML.click();
	}

	public void addMailingListDrawFailed() throws InterruptedException {
		String expectedText = "Mailing List is not found";
		waitForElementToApear(title);
		btnaddML.click();
		waitForElementToApear(uploadCSV1);
		draw.click();
		waitForElementToApear(acceptCookies1);
		acceptCookies.click();
		waitForElementToApear(btnsearch1);
		search.sendKeys("Sand Bar, Canyon Lake, TX, USA");
		btnsearch.click();
		Thread.sleep(2000);
		Actions vertex1 = new Actions(driver);
		vertex1.moveToElement(map).moveByOffset(-10, 100).click().build().perform();
		Actions vertex2 = new Actions(driver);
		vertex2.moveToElement(map).moveByOffset(150, 100).click().build().perform();
		Actions vertex3 = new Actions(driver);
		vertex3.moveToElement(map).moveByOffset(150, -85).click().build().perform();
		Actions vertex4 = new Actions(driver);
		vertex4.moveToElement(map).moveByOffset(-10, -85).click().build().perform();
		Actions vertex5 = new Actions(driver);
		vertex5.moveToElement(map).moveByOffset(-45, 40).click().build().perform();
		Actions vertex6 = new Actions(driver);
		vertex6.moveToElement(map).moveByOffset(-10, 100).doubleClick().build().perform();
		nameMl.sendKeys("Mailing List Failed");
		waitForElementToApear(btnNext1);
		btnNext.click();
		waitForElementToApear(errorML1);
		String actualText = errorML.getText();
		assertEquals(actualText, expectedText);
		System.out.println("Test Draw Mailing List Not found Success");

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

	public void goToRegisterBroker() {
		driver.get("https://staging-realestate.homemeta.io/register/?role=BROKER");

	}

	public void verifyEmail(String email) throws InterruptedException {
		driver.get("https://yopmail.com/");
		getEmail.sendKeys(email);
		goEmail.click();
		Thread.sleep(1500);
		driver.switchTo().frame(2);
		waitForElementToApear(waitEmail);
		verifyEmail1.click();

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

	public void waitSkipbutton() throws InterruptedException {
		waitForElementToApear(btnSkip1);
		btnSkip.click();
		Thread.sleep(1500);
		btnSkip.click();
	}

	public void waitOkaybutton() throws InterruptedException {
		waitForElementToApear(btnOkay1);
		btnOkay.click();
		Thread.sleep(1000);
		btnGoBack.click();
		Thread.sleep(400);
	}

	public Boolean VerifyRole(String roleName1) {
		waitForElementToApear(roleName2);
		Boolean match = roleName.stream().anyMatch(role -> role.getText().equalsIgnoreCase(roleName1));
		return match;

	}

	public Boolean VerifyManagerRole(String roleName1) {
		waitForElementToApear(roleManager1);
		Boolean match = roleManager.stream().anyMatch(role -> role.getText().equalsIgnoreCase(roleName1));
		return match;
	}

	public Boolean VerifyBrokerRole(String roleName1) {
		waitForElementToApear(roleName3);
		Boolean match = roleBroker.stream().anyMatch(role -> role.getText().equalsIgnoreCase(roleName1));
		return match;

	}

	public Boolean VerifyNameMailingList(String nameMailingList1) {
		waitForElementToApear(listMailingList);
		Boolean match = nameMailingList.stream()
				.anyMatch(nameML -> nameML.getText().equalsIgnoreCase(nameMailingList1));
		return match;
	}

}

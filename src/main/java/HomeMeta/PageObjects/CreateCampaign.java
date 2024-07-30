package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class CreateCampaign extends BaseTest {

	@Test(dataProvider = "getData")
	public void CreateCampaignTest(HashMap<String, String> input) throws InterruptedException {
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.createCampaignPaymentCPCredits();
		landingPage.createCampaignPaymentCPCredits1();
		landingPage.createCampaignPaymentCreditCard();
		landingPage.createCampaignPaymentCreditCard1();

	}

	@Test(dataProvider = "getData1")
	public void CreateCampaignManagerTest(HashMap<String, String> input) throws InterruptedException {
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.createCampaignManagerRole();

	}

	@Test(dataProvider = "getData")
	public void VerifyCampaignManagerRole(HashMap<String, String> input) throws InterruptedException {
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.verifyCampaignManagerRole();

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(0) } };
	}

	@DataProvider
	public Object[][] getData1() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(1) } };
	}
}

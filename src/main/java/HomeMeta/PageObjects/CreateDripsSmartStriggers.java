package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class CreateDripsSmartStriggers extends BaseTest {
	@Test(dataProvider = "getData")
	public void CreateDripSmartStriggers(HashMap<String, String> input) throws InterruptedException {
		String smartStriggerName = "Drip Auto";
		landingPage.login(input.get("email"), input.get("password"));

		CreateCampaigns createDripCampaigns = new CreateCampaigns(driver);
		createDripCampaigns.createDripsSmartStriggers(smartStriggerName);

		Boolean match = createDripCampaigns.VerifySmartTriggersDisplay(smartStriggerName);
		Assert.assertTrue(match);
		System.out.println("Add Drips for Smart Triggers Success");
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(0) } };
	}
}

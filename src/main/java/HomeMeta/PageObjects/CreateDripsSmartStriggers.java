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
	public void CreateDripSmartStriggersTypeEmail(HashMap<String, String> input) throws InterruptedException {
		String smartStriggerName = "Drip Type Email Auto";
		String smartStriggerTypeText = "Drip Type Text Auto";
		String smartStriggerAgentNoti = "Drip Type Agent Noti Auto";
		String smartStriggerTypeMailCampaign = "Drip Type Mail Campaign Auto";
		String renameDripCampaign = "Rename Drip Type Mail Campaign Auto";
		landingPage.login(input.get("email"), input.get("password"));
		CreateCampaigns createDripCampaigns = new CreateCampaigns(driver);
		createDripCampaigns.createDripsSmartStriggersTypeEmail(smartStriggerName);
		Thread.sleep(2000);
		Boolean match = createDripCampaigns.VerifySmartTriggersDisplay(smartStriggerName);
		Assert.assertTrue(match);
		System.out.println("Add Drips for Smart Triggers Type Email Success");
		Thread.sleep(3000);

		createDripCampaigns.createDripsSmartStriggersTypeText(smartStriggerTypeText);
		Thread.sleep(2000);
		Boolean match1 = createDripCampaigns.VerifySmartTriggersDisplay(smartStriggerName);
		Assert.assertTrue(match1);
		System.out.println("Add Drips for Smart Triggers Type Text Success");
		Thread.sleep(3000);

		createDripCampaigns.createDripsAgentNoti(smartStriggerAgentNoti);
		Thread.sleep(2000);
		Boolean match2 = createDripCampaigns.VerifySmartTriggersDisplay(smartStriggerName);
		Assert.assertTrue(match2);
		System.out.println("Add Drips for Smart Triggers Agent Noti Success");
		Thread.sleep(3000);

		createDripCampaigns.createDripsSmartStriggersTypeMailCampaign(smartStriggerTypeMailCampaign);
		Thread.sleep(2000);
		Boolean match3 = createDripCampaigns.VerifySmartTriggersDisplay(smartStriggerName);
		Assert.assertTrue(match3);
		System.out.println("Add Drips for Smart Triggers Type Mail Campaign Success");
		Thread.sleep(3000);

		createDripCampaigns.renameDripsmartTrigger(renameDripCampaign);
		Boolean match4 = createDripCampaigns.VerifySmartTriggersDisplay(smartStriggerName);
		Assert.assertTrue(match4);
		System.out.println("Rename Smart Triggers Type Mail Campaign Success");
		Thread.sleep(3000);

		createDripCampaigns.duplicatedDripsmartTrigger();
		Thread.sleep(3000);

		createDripCampaigns.deledtedDripsmartTrigger();
		Thread.sleep(3000);

		createDripCampaigns.cloneDripsmartTrigger();

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(0) } };
	}
}

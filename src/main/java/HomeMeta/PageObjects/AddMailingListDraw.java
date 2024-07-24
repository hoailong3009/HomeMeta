package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class AddMailingListDraw extends BaseTest {

	@Test(dataProvider = "getData", retryAnalyzer = TestComponent.Retry.class)
	public void AddMailingListTest(HashMap<String, String> input) throws InterruptedException {
		String nameMailingList1 = "Auto Draw Mailing List 1";
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.addMailingListDraw(nameMailingList1);
		landingPage.VerifyNameMailingList(nameMailingList1);
		System.out.println("Draw Mailing List success");

	}

	@Test(dataProvider = "getData")
	public void AddMailingListFailed(HashMap<String, String> input) throws InterruptedException {
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.addMailingListDrawFailed();

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(0) } };
	}
}

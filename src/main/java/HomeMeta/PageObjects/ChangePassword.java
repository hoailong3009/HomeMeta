package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class ChangePassword extends BaseTest {

	@Test(dataProvider = "getData")
	public void ChangePassword1(HashMap<String, String> input) throws InterruptedException {
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.changePassword(input.get("password"));

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(0) } };
	}
}

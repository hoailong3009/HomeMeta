package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class AgentLogin extends BaseTest {

	@Test(dataProvider = "getData")
	public void TestLoginAgentDeleted(HashMap<String, String> input) throws InterruptedException {
		landingPage.loginFailed(input.get("email"), input.get("password"));

	}

	@Test(dataProvider = "getData1")
	public void TestLoginAgentIncorrect(HashMap<String, String> input) throws InterruptedException {
		LoginPages loginPages = new LoginPages(driver);
		loginPages.loginFailed(input.get("email"), input.get("password"));

	}

	@Test(dataProvider = "getData2")
	public void TestLoginAgentSuccess(HashMap<String, String> input) throws InterruptedException {
		LoginPages loginPages = new LoginPages(driver);
		loginPages.loginAgentSuccess(input.get("email"), input.get("password"));

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(0) } };
	}

	@DataProvider
	public Object[][] getData1() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(1) } };
	}

	@DataProvider
	public Object[][] getData2() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(2) } };
	}
}

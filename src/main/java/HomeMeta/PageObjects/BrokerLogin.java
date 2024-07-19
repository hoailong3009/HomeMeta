package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class BrokerLogin extends BaseTest {

	@Test(dataProvider = "getData")
	public void TestLoginBrokerDeleted(HashMap<String, String> input) throws InterruptedException {
		landingPage.loginFailed(input.get("email"), input.get("password"));

	}

	@Test(dataProvider = "getData1")
	public void TestLoginBrokerIncorrect(HashMap<String, String> input) throws InterruptedException {
		LoginPages loginPages = new LoginPages(driver);
		loginPages.loginFailed(input.get("email"), input.get("password"));

	}

	@Test(dataProvider = "getData2")
	public void TestLoginBrokerSuccess(HashMap<String, String> input) throws InterruptedException {
		LoginPages loginPages = new LoginPages(driver);
		loginPages.loginBrokerSuccess(input.get("email"), input.get("password"));

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(6) } };
	}

	@DataProvider
	public Object[][] getData1() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(7) } };
	}

	@DataProvider
	public Object[][] getData2() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(8) } };
	}
}

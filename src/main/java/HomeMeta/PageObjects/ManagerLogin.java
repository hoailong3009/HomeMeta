package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class ManagerLogin extends BaseTest {

	@Test(dataProvider = "getData")
	public void TestLoginManagerDeleted(HashMap<String, String> input) throws InterruptedException {
		landingPage.loginFailed(input.get("email"), input.get("password"));

	}

	@Test(dataProvider = "getData1")
	public void TestLoginManagerIncorrect(HashMap<String, String> input) throws InterruptedException {
		LoginPages loginPages = new LoginPages(driver);
		loginPages.loginFailed(input.get("email"), input.get("password"));

	}

	@Test(dataProvider = "getData2")
	public void TestLoginManagerSuccess(HashMap<String, String> input) throws InterruptedException {
		LoginPages loginPages = new LoginPages(driver);
		loginPages.loginManagerSuccess(input.get("email"), input.get("password"));

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(3) } };
	}

	@DataProvider
	public Object[][] getData1() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(4) } };
	}

	@DataProvider
	public Object[][] getData2() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataTestLogin.json");
		return new Object[][] { { data.get(5) } };
	}
}

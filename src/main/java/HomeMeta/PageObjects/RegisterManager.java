package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class RegisterManager extends BaseTest {
	@Test(dataProvider = "getData")
	public void RegisterManagerFailed(HashMap<String, String> input) throws IOException, InterruptedException {
		landingPage.goToRegister();
		landingPage.regisManagerFailed(input.get("email"), input.get("password"), input.get("firstName"),
				input.get("lastName"), input.get("dreNumber"), input.get("numberPhone"));

	}

	@Test(dataProvider = "getData1")
	public void RegisterManagerNotFound(HashMap<String, String> input) throws IOException, InterruptedException {
		landingPage.goToRegister();
		landingPage.regisManagerNotFound(input.get("email"), input.get("password"), input.get("firstName"),
				input.get("lastName"), input.get("dreNumber"), input.get("numberPhone"));

	}

	@Test(dataProvider = "getData2")
	public void RegisterManagerTest(HashMap<String, String> input) throws IOException, InterruptedException {
		String roleName1 = "Manager Dashboard";
		landingPage.goToRegister();
		landingPage.regisManagerRole(input.get("email"), input.get("password"), input.get("firstName"),
				input.get("lastName"), input.get("dreNumber"), input.get("numberPhone"));
		Thread.sleep(500);

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);

		landingPage.verifyEmail(input.get("email"));

		driver.switchTo().window(parentWindowId);
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='Okay']")).click();

		landingPage.login(input.get("email"), input.get("password"));
		Thread.sleep(1000);

		landingPage.waitSkipbutton();

		Boolean match = landingPage.VerifyManagerRole(roleName1);
		Assert.assertTrue(match);
		System.out.println("Register Manager role Passed");

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataRegisterManager.json");
		return new Object[][] { { data.get(0) } };
	}

	@DataProvider
	public Object[][] getData1() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataRegisterManager.json");
		return new Object[][] { { data.get(1) } };
	}

	@DataProvider
	public Object[][] getData2() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataRegisterManager.json");
		return new Object[][] { { data.get(2) } };
	}

}

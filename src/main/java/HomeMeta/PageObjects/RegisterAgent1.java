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
import HomeMeta.TestComponents.Retry;

public class RegisterAgent1 extends BaseTest {

	@Test(dataProvider = "getData", retryAnalyzer = Retry.class)
	public void RegisterAgent(HashMap<String, String> input) throws IOException, InterruptedException {
		String roleName1 = "Agent";
		landingPage.goToRegister();
		landingPage.regisAgentRole(input.get("email"), input.get("password"), input.get("firstName"),
				input.get("lastName"), input.get("dreNumber"), input.get("numberPhone"), input.get("linkURL"));
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
		landingPage.waitOkaybutton();

		Boolean match = landingPage.VerifyRole(roleName1);
		Assert.assertTrue(match);
		System.out.println("Passed");

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataRegister.json");
		return new Object[][] { { data.get(0) } };
	}

}

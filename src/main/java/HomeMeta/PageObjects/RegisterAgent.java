package HomeMeta.PageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterAgent {
	@Parameters({ "email", "pw", "firstName", "lastName", "dreNumber" })
	@Test
	public void Test(String email, String pw, String firstName, String lastName, String dreNumber) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://staging-realestate.homemeta.io/register");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//div[@name='user_type']//span[@class='ant-select-selection-search']")).click();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='AGENT']"))
				.click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@placeholder='DRE Number']")).sendKeys(dreNumber);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@name='market']//span[@class='ant-select-selection-search']")).click();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='CRMLS']"))
				.click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0938888888");
		driver.findElement(By.xpath("//input[@placeholder='Website URL']"))
				.sendKeys("https://staging-realestate.homemeta.io/register/");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(pw);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
		Thread.sleep(500);

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://www.mailinator.com/");
		driver.findElement(By.xpath("(//input[@id='search'])[1]")).sendKeys(email);
		driver.findElement(By.xpath("//button[normalize-space()='GO']")).click();
		w.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//td[normalize-space()='noreply@homemeta.io']")));
		driver.findElement(By.xpath("//td[normalize-space()='noreply@homemeta.io']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[normalize-space()='Verify account']")).click();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='Okay']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pw);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(1000);

		w.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']")));
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[normalize-space()='Go Back']")).click();
		Thread.sleep(400);

		Assert.assertEquals(driver.findElement(By.xpath("//a[@href='/agent-report']//p")).getText(), "Agent");
		System.out.println("Passed - Agent Role");

	}
}

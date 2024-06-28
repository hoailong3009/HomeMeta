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
import org.testng.annotations.Test;

public class RegisterBroker {

	@Test
	public void Test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://staging-realestate.homemeta.io/register");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//div[@name='user_type']//span[@class='ant-select-selection-search']")).click();
		driver.findElement(
				By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='BROKER in charge']"))
				.click();
		driver.findElement(By.xpath("//input[@placeholder='Company Name']")).sendKeys("HDW");
		driver.findElement(By.xpath("//input[@placeholder='Admin in charge First Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Admin in charge Last Name']")).sendKeys("abc");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ant-select-selection-overflow']")).click();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='CRMLS']"))
				.click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0938888888");
		driver.findElement(By.xpath("//input[@placeholder='Website URL']"))
				.sendKeys("https://staging-realestate.homemeta.io/register/");
		driver.findElement(By.xpath("//input[@placeholder='Broker Agent Email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("abc");
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@name='sub_id']//span[@class='ant-select-selection-search']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Silver Subscription - $18.00')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Number of Agents']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@placeholder='CSV URL']"))
				.sendKeys("https://staging-homemeta-api-media.s3.amazonaws.com/media/FileCSV_Admin+(2).csv");
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary btn-login css-af57k4'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("Long Quach");
		Thread.sleep(500);
		driver.switchTo().frame(4);
		Thread.sleep(500);
		driver.findElement(By.xpath("input[placeholder='XXXX-XXXX-XXXX-XXXX']")).sendKeys("4242424242424242");
		driver.findElement(By.xpath("input[placeholder='MM/YY']")).sendKeys("12/34");
		driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("5678");
		driver.findElement(By.xpath("//input[@placeholder='Enter Zip Code']")).sendKeys("21312");
		driver.findElement(By.xpath("//span[normalize-space()='Confirm Purchase & Create Account']")).click();

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://www.mailinator.com/");
		driver.findElement(By.xpath("(//input[@id='search'])[1]")).sendKeys("abc");
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

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(1000);

		w.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']")));
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block e1b9qozy0 css-1q4xa5h']"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[normalize-space()='Go Back']")).click();
		Thread.sleep(400);

		Assert.assertEquals(driver.findElement(By.xpath("//a[@href='/agent-report']//p")).getText(), "BROKER");
		System.out.println("Passed - BROKER Role");

	}
}

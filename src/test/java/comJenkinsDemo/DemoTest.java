package comJenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTest {
WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver84.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/sugarzback/Desktop/Sagar/Course/Offline%20website/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test01() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
	}
	
	@Test
	public void test02() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}
	
	@Test
	public void test03() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}

	@Test
	public void test04() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}

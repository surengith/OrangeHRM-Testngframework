package com.Runner.org;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import com.Baseclass.org.BaseClass;
import com.Pom.org.BookADemo;
import com.Pom.org.ContactSales;
import com.Singleton.org.Singleton;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner extends BaseClass {

	public static WebDriver driver;
	
	public static Singleton sl = new Singleton(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		// Driver SetUp
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver = launchBrowser("Chrome");

		// Get Url

//		BookADemo bad = new BookADemo(driver);

//		driver.get("https://www.orangehrm.com/");
		launchUrl("https://www.orangehrm.com/");

//		Thread.sleep(5000);
		sleep(5000);

//		WebElement cookies = driver.findElement(By.xpath("//a[@title='Accept Cookies']"));
//		cookies.click();
		clickOnElement(sl.getBad().getCookies());

//		Thread.sleep(5000);
		sleep(5000);

//		WebElement bookademo = driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]"));
//		bookademo.click();
		clickOnElement(sl.getBad().getBookademo());

//		WebElement fullname = driver.findElement(By.xpath("//input[@name='FullName']"));
//		fullname.sendKeys("Rajesh");
		passInput(sl.getBad().getFullname(), "Rajesh");

//		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
//		email.sendKeys("rajesh@gmail.com");
		passInput(sl.getBad().getEmail(), "rajesh@gmail.com");

//		WebElement country = driver.findElement(By.name("Country"));
//		Select s = new Select(country);
//		s.selectByVisibleText("Brazil");
		select(sl.getBad().getCountry(), "Brazil");

//		WebElement contact = driver.findElement(By.xpath("//input[@name='Contact']"));
//		contact.sendKeys("987456321");
		passInput(sl.getBad().getContact(), "987456321");

//		Thread.sleep(15000);
		sleep(15000);

//		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
//		submit.click();
		clickOnElement(sl.getBad().getSubmit());

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("Screenshot" + "\\" + "BookaDemo.png");
//		FileUtils.copyFile(source, destination);
		screenShot("BookaDemo");

		// -----------------------------------------

//		ContactSales cs = new ContactSales(driver);

//		WebElement contactsales = driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]"));
//		contactsales.click();
		clickOnElement(sl.getCs().getContactsales());

//		WebElement fullnamecs = driver.findElement(By.xpath("//input[@name='FullName']"));
//		fullnamecs.sendKeys("RajeshKumar");
		passInput(sl.getCs().getFullnamecs(), "RajeshKumar");

//		WebElement contactcs = driver.findElement(By.name("Contact"));
//		contactcs.sendKeys("987456321");
		passInput(sl.getCs().getContactcs(), "987456321");

//		WebElement emailcs = driver.findElement(By.xpath("//input[@name='Email']"));
//		emailcs.sendKeys("rajesh@gmail.com");
		passInput(sl.getCs().getEmailcs(), "rajesh@gmail.com");

//		WebElement countrycs = driver.findElement(By.name("Country"));
//		Select scs = new Select(countrycs);
//		scs.selectByVisibleText("Brazil");
		select(sl.getCs().getCountrycs(), "Brazil");

//		WebElement NoOfEmployeescs = driver.findElement(By.name("NoOfEmployees"));
//		Select ncs = new Select(NoOfEmployeescs);
//		ncs.selectByVisibleText("101 - 150");
		select(sl.getCs().getNoOfEmployeescs(), "101 - 150");

//		WebElement jobtitlecs = driver.findElement(By.xpath("//input[@name='JobTitle']"));
//		jobtitlecs.sendKeys("Tester");
		passInput(sl.getCs().getJobtitlecs(), "Tester");

//		WebElement textareacs = driver.findElement(By.xpath("//textarea[@name='Comment']"));
//		textareacs.sendKeys("Automation Testing Engineer");
		passInput(sl.getCs().getTextareacs(), "Automation Testing Engineer");

//		Thread.sleep(15000);
		sleep(15000);

//		WebElement submitcs = driver.findElement(By.xpath("//input[@type='submit']"));
//		submitcs.click();
		clickOnElement(sl.getCs().getSubmitcs());

//		TakesScreenshot tscs = (TakesScreenshot) driver;
//		File sourcecs = tscs.getScreenshotAs(OutputType.FILE);
//		File destinationcs = new File("Screenshot" + "\\" + "ContactSales.png");
//		FileUtils.copyFile(sourcecs, destinationcs);
		screenShot("ContactSales");

//		driver.close();
		close();
	}
}

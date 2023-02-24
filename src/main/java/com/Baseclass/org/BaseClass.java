package com.Baseclass.org;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public static void launchUrl(String value) {
		driver.get(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void passInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	public static void screenShot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshot" + "\\" + location + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void select(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement opt : options) {
			if (opt.getText().equals(value)) {
				opt.click();
				break;
			}
		}
	}

	public static void close() {
		driver.close();
	}

}

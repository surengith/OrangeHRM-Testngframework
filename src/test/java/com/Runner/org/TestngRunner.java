package com.Runner.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Baseclass.org.BaseClass;
import com.Pom.org.BookADemo;
import com.Pom.org.ContactSales;
import com.Singleton.org.Singleton;

public class TestngRunner extends BaseClass {

//	public static BookADemo bad;
//	public static ContactSales cs;

	public static Singleton sl;
	public static Properties p;

//	public TestngRunner() {
//		super();
//	}

	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		launchBrowser(browser);
//		bad = new BookADemo(driver);
//		cs = new ContactSales(driver);
		sl = new Singleton(driver);
	}

	@Test(priority = 0)
	public static void property() throws IOException {
		File f = new File(
				"C:\\Users\\Surendhar\\eclipse-workspace\\MavenOrangeHRM\\src\\main\\java\\com\\Property\\org\\Hrm.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	@Test(priority = 1)
	public void Url() throws InterruptedException {
		launchUrl(p.getProperty("url"));
		sleep(5000);
		clickOnElement(sl.getBad().getCookies());
	}

	@Test(priority = 2)
	public void bookademo() {
		clickOnElement(sl.getBad().getBookademo());
	}

	@Test(priority = 3)
	public void bookademopage() throws InterruptedException, IOException {
		passInput(sl.getBad().getFullname(), p.getProperty("BDFullname"));
		passInput(sl.getBad().getEmail(), p.getProperty("BDEmail"));
		select(sl.getBad().getCountry(), p.getProperty("BDCountry"));
		passInput(sl.getBad().getContact(), p.getProperty("BDConatct"));
		sleep(15000);
		clickOnElement(sl.getBad().getSubmit());
		screenShot("BookaDemo");
	}

	@Test(priority = 4)
	public void conatctSales() {
		clickOnElement(sl.getCs().getContactsales());
	}

	@Test(priority = 5)
	public void conatctsalespage() throws InterruptedException, IOException {
		passInput(sl.getCs().getFullnamecs(), p.getProperty("CSFullname"));
		passInput(sl.getCs().getContactcs(), p.getProperty("CSConatct"));
		passInput(sl.getCs().getEmailcs(), p.getProperty("CSEmail"));
		select(sl.getCs().getCountrycs(), p.getProperty("CSCountry"));
		select(sl.getCs().getNoOfEmployeescs(), p.getProperty("CSEmployees"));
		passInput(sl.getCs().getJobtitlecs(), p.getProperty("CSTitle"));
		passInput(sl.getCs().getTextareacs(), p.getProperty("CSTextArea"));
		sleep(15000);
		clickOnElement(sl.getCs().getSubmitcs());
		screenShot("ContactSales");
	}

	@AfterClass
	public void tearDown() {
		close();
	}
}

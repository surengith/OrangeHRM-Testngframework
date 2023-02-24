package com.Singleton.org;

import org.openqa.selenium.WebDriver;
import com.Pom.org.BookADemo;
import com.Pom.org.ContactSales;

public class Singleton {

	WebDriver driver;

	public Singleton(WebDriver singletondriver) {
		this.driver = singletondriver;
	}

	public BookADemo getBad() {
		bad = new BookADemo(driver);
		return bad;
	}

	public ContactSales getCs() {
		cs = new ContactSales(driver);
		return cs;
	}

	private BookADemo bad;

	private ContactSales cs;

}

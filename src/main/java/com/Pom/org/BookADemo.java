package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookADemo {

	public static WebDriver driver;

	public BookADemo(WebDriver bookademodriver) {
		this.driver = bookademodriver;
		PageFactory.initElements(bookademodriver, this);
	}

	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getBookademo() {
		return bookademo;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath = "//a[@title='Accept Cookies']")
	private WebElement cookies;

	@FindBy(xpath = "(//button[text()='Book a Free Demo'])[2]")
	private WebElement bookademo;

	@FindBy(xpath = "//input[@name='FullName']")
	private WebElement fullname;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement email;

	@FindBy(name = "Country")
	private WebElement country;

	@FindBy(xpath = "//input[@name='Contact']")
	private WebElement contact;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

}

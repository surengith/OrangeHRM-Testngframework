package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSales {

	public static WebDriver driver;
	
	public ContactSales(WebDriver ContactSalesdriver) {
		this. driver = ContactSalesdriver;
		PageFactory.initElements(ContactSalesdriver, this);
	}

	public WebElement getContactsales() {
		return contactsales;
	}

	public WebElement getFullnamecs() {
		return fullnamecs;
	}

	public WebElement getContactcs() {
		return contactcs;
	}

	public WebElement getEmailcs() {
		return emailcs;
	}

	public WebElement getCountrycs() {
		return countrycs;
	}

	public WebElement getNoOfEmployeescs() {
		return NoOfEmployeescs;
	}

	public WebElement getJobtitlecs() {
		return jobtitlecs;
	}

	public WebElement getTextareacs() {
		return textareacs;
	}

	public WebElement getSubmitcs() {
		return submitcs;
	}

	@FindBy(xpath = "(//button[text()='Contact Sales'])[2]")
	private WebElement contactsales;

	@FindBy(xpath = "//input[@name='FullName']")
	private WebElement fullnamecs;

	@FindBy(name = "Contact")
	private WebElement contactcs;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement emailcs;

	@FindBy(name = "Country")
	private WebElement countrycs;

	@FindBy(name = "NoOfEmployees")
	private WebElement NoOfEmployeescs;

	@FindBy(xpath = "//input[@name='JobTitle']")
	private WebElement jobtitlecs;

	@FindBy(xpath = "//textarea[@name='Comment']")
	private WebElement textareacs;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitcs;

}

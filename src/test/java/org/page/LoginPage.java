package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//td[text()='Existing User Login - Build 1']")
	private WebElement UserLogin;

	public WebElement getUserLogin() {
		return UserLogin;
	}

	@CacheLookup
	@FindBys({ @FindBy(how = How.XPATH, using = "//input[@id='username']"),
			@FindBy(how = How.XPATH, using = "//input[@name='username']") })
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindAll({ @FindBy(xpath = "//input[@id='password']"), @FindBy(xpath = "//input[@name='passwcxhdkhfdiord']") })
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	

}
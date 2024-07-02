package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass {

	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout")
	private WebElement loggedout;
	
	public WebElement getLoggedout() {
		return loggedout;
	}
}

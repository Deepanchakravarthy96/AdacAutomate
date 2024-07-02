package org.page;

import javax.security.auth.callback.ConfirmationCallback;

import org.global.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedList extends BaseClass {

	public BookedList() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement Checkbox;
	
	public WebElement getCheckbox() {
		return Checkbox;
	}
	
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement Selected;
	
	public WebElement getSelected() {
		return Selected;
	}
	
	@FindBy(xpath = "//button[@onclick='confirmbox()']")
	private WebElement alert;
	
	public WebElement getalert() {
		return alert	;
	}
	
	@FindBy(id="logout")
	private WebElement Logout;
	
	public WebElement getLogout() {
		return Logout;
	}
	
	
}
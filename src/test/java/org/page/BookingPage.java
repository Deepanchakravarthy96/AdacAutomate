package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement Firstname;
	
	public WebElement getFirstname() {
		return Firstname;
	}
	
	@FindBy(id="last_name")
	private WebElement Lastname;
	
	public WebElement getLastname() {
		return Lastname;
	}
	
	@FindBy(id="address")
	private WebElement Address;
	
	public WebElement getAddress() {
		return Address;
	}
	
	@FindBy(id="cc_num")
	private WebElement Cardnumber;
	
	public WebElement getCardnumber() {
		return Cardnumber;
	}
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	public WebElement getCardType() {
		return CardType;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	public WebElement getExpMonth() {
		return ExpMonth;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	
	public WebElement getExpYear() {
		return ExpYear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement CvvNumber;
	
	public WebElement getCvvNumber() {
		return CvvNumber;
	}
	
	@FindBy(id="book_now")
	private WebElement Booknow;
	
	public WebElement getBooknow() {
		return Booknow;
	}
	
	@FindBy(id="order_no")
	private WebElement OrderID;
	
	public WebElement getOrderID() {
		return OrderID;
	}
	
	
	
	@FindBy(id="my_itinerary")
	private WebElement MyItinerary;
	
	public WebElement getMyItinerary() {
		return MyItinerary;
	}
}

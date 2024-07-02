package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 extends BaseClass {
	
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	public WebElement getLocation() {
		return Location;
	}
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	public WebElement getHotels() {
		return Hotels;
	}
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	public WebElement getRoomType() {
		return RoomType;
	}
	
	@FindBy(id="room_nos")
	private WebElement RoomNos;
	
	public WebElement getRoomNos() {
		return RoomNos;
	}
	
	@FindBy(id="datepick_in")
	private WebElement DatepickIN;
	
	public WebElement getDatepickIN() {
		return DatepickIN;
	}
	
	@FindBy(id="datepick_out")
	private WebElement DatepickOut;
	
	public WebElement getDatepickOut() {
		return DatepickOut;
	}
	
	@FindBy(id="adult_room")
	private WebElement AdultRoom;
	
	public WebElement getAdultRoom() {
		return AdultRoom;
	}
	
	@FindBy(id="child_room")
	private WebElement ChildRoom;
	
	public WebElement getChildRoom() {
		return ChildRoom;
	}
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebElement getSearch() {
		return submit;
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	public WebElement getRadio() {
		return radio;
	}
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	public WebElement getContinue() {
		return Continue;
	}
	}


package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.page.BookedList;
import org.page.BookingPage;
import org.page.LoginPage;
import org.page.LoginPage1;
import org.page.LogoutPage;
import org.page.SearchHotelPage;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static LoginPage loginPage = new LoginPage();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	public static LoginPage1 loginPage1 = new LoginPage1();
	public static BookingPage bookingpage = new BookingPage();
	public static BookedList bookedlist = new BookedList();
	public static LogoutPage logoutpage = new LogoutPage();

	@Given("User should be Launch the URL")
	public static void BrowserLaunch() throws IOException {

		base.getDriver(base.readExcell(1, 3));
		base.getUrl(base.readExcell(1, 4));

	}

	@When("User Successfully in Login Page")
	public void user_successfully_in_login_page() throws IOException {

		loginPage = new LoginPage();

		if (loginPage.getUserLogin().isDisplayed()) {
			System.out.println("User is in LoginPage");
		} else {
			System.out.println("Userr Not in LoginPage");
		}
	}

	@When("User should Enters the Valid Login Credentials")
	public void user_should_enters_the_valid_login_credentials() throws IOException {

		WebElement userName = loginPage.getUserName();
		// userName.sendKeys(base.readExcell(1, 0));
		base.textSend(userName, base.readExcell(8, 0));

		WebElement password = loginPage.getPassword();
		base.textSend(password, base.readExcell(8, 1));

		WebElement login = loginPage.getLogin();
		login.click();
	}

	@Then("User successfully Enter the Search Hotelpage")
	public void user_successfully_enter_the_search_hotelpage() {

		searchHotel = new SearchHotelPage();
		if (searchHotel.getSearchHotelText().isDisplayed()) {

			System.out.println("User Successfully Loged in and Is in Search Hotel Page");

		} else {
			System.out.println("User Not Successfully Loged in and Not in Search Hotel Page");

		}

	}

	@When("User should Entering the Search Hotel Details")
	public void SearchingHotels() throws IOException, InterruptedException {

		loginPage1 = new LoginPage1();
		bookingpage = new BookingPage();

		WebElement location = loginPage1.getLocation();
		base.textSend(location, "London");

		WebElement hotels = loginPage1.getHotels();
		base.textSend(hotels, base.readExcell(1, 7));

		WebElement roomType = loginPage1.getRoomType();
		base.textSend(roomType, base.readExcell(1, 8));

		WebElement roomNos = loginPage1.getRoomNos();
		base.textSend(roomNos, base.readExcell(1, 9));

		WebElement datepickIN = loginPage1.getDatepickIN();
		datepickIN.clear();
		base.textSend(datepickIN, base.readExcell(1, 10));

		WebElement datepickOut = loginPage1.getDatepickOut();
		datepickOut.clear();
		base.textSend(datepickOut, base.readExcell(1, 11));

		WebElement adultRoom = loginPage1.getAdultRoom();
		base.textSend(adultRoom, base.readExcell(1, 12));

		WebElement childRoom = loginPage1.getChildRoom();
		base.textSend(childRoom, base.readExcell(1, 13));

		WebElement search = loginPage1.getSearch();
		search.click();

		WebElement radio = loginPage1.getRadio();
		radio.click();

		WebElement continue1 = loginPage1.getContinue();
		continue1.click();

		WebElement firstname = bookingpage.getFirstname();
		base.textSend(firstname, base.readExcell(2, 0));

		WebElement lastname = bookingpage.getLastname();
		base.textSend(lastname, base.readExcell(2, 1));

		WebElement address = bookingpage.getAddress();
		base.textSend(address, base.readExcell(2, 2));

		WebElement cardnumber = bookingpage.getCardnumber();
		base.textSend(cardnumber, base.readExcell(2, 3));

		WebElement cardType = bookingpage.getCardType();
		base.textSend(cardType, base.readExcell(2, 4));

		WebElement expMonth = bookingpage.getExpMonth();
		base.textSend(expMonth, base.readExcell(2, 5));

		WebElement expYear = bookingpage.getExpYear();
		base.textSend(expYear, base.readExcell(2, 6));

		WebElement cvvNumber = bookingpage.getCvvNumber();
		base.textSend(cvvNumber, base.readExcell(2, 7));

		WebElement booknow = bookingpage.getBooknow();
		booknow.click();
		Thread.sleep(10000);

		WebElement orderID = bookingpage.getOrderID();
		String no = orderID.getAttribute("value");
		System.out.println("order no" + no);

		WebElement myItinerary = bookingpage.getMyItinerary();
		myItinerary.click();

	}

	@When("User Click the Booknow button")
	public void BookList() throws InterruptedException {

		bookedlist = new BookedList();

		WebElement checkbox = bookedlist.getCheckbox();
		checkbox.click();

		WebElement selected = bookedlist.getSelected();
		selected.click();

		bookedlist.Alertbox();
	}

	@When("User should Inside the BookedList Operation")
	public void user_should_inside_the_booked_list_operation() {

		bookedlist = new BookedList();

		if (searchHotel.getSearchHotelText().isDisplayed()) {

			System.out.println("User Successfully Loged in and Is in Search Hotel Page");

		} else {
			System.out.println("User Not Successfully Loged in and Not in Search Hotel Page");

		}

	}

	@When("User should Click the Logout button")
	public void user_should_click_the_logout_button() {

		logoutpage = new LogoutPage();

		WebElement loggedout = logoutpage.getLoggedout();
		loggedout.click();
	}

	@Then("Finally user Quit a Webpage")
	public void finally_user_quit_a_webpage() {
		
		driver.quit();
		
	}

}

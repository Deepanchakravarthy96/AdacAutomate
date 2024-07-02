Feature: To verify Adactin Hotel Login Webpage

	Scenario: To Verify Adactin Hotel Webpage with Valid Credentials
		Given User should be Launch the URL
		When User Successfully in Login Page
		And User should Enters the Valid Login Credentials
		Then User successfully Enter the Search Hotelpage
		When User should Entering the Search Hotel Details
		And User Click the Booknow button
		When User should Inside the BookedList Operation
		And User should Click the Logout button
		Then Finally user Quit a Webpage
package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Adactinpage.feature", 
glue = "org.step", 
monochrome = true, 
dryRun = false, 
plugin = {
		"html:target\\htmlReport", 
		"junit:target\\xmlReport.xml", 
		"json:target\\jsonReport.json" 
		})
public class TestRunner {

	@AfterClass
	public static void afterclass() {
		ReportingClass.generateReport("target\\jsonReport.json");
		
	}
	
	private void Company() {

		System.out.println("Company name is TCS");
		System.out.println("Company address chennai");
	}

}

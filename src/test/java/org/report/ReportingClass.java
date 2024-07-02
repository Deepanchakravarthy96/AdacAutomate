package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	public static void generateReport(String json) {

		File file = new File("C:\\Users\\CPDS FAMILY\\eclipse-workspace\\AdactinAutomating\\target");

		Configuration con = new Configuration(file, "Adactin Hotel Webpage Login Validation");
		con.addClassifications("UserStory", "961996");
		con.addClassifications("Tool", "JDK11.0.");

		List<String> li = new LinkedList<String>();
		li.add(json);

		ReportBuilder report = new ReportBuilder(li, con);
		report.generateReports();

	}
}

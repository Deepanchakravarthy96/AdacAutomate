package org.step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.global.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	public static BaseClass base = new BaseClass();

	@Before
	public void before() throws IOException {

		base.getDriver(base.readExcell(1, 3));
		base.getUrl(base.readExcell(1, 4));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	
	@After
	public void after() {
		
		driver.quit();
		
	}
}

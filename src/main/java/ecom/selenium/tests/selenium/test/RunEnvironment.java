package ecom.selenium.tests.selenium.test;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {

		public static WebDriver WebDriver;

		public static WebDriver getWebDriver() {
			return WebDriver;
		}

		public static void setWebDriver(WebDriver webDriver) {
			WebDriver = webDriver;
		}
}

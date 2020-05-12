package com.testcases.driverscripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Closecon {


	//public static void main(String[] args) throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	@Test
	public void Closeiedriver() throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /F /IM IEDriverServer.exe");
		rt.exec("taskkill /F /IM iexplore.exe");
		rt.exec("taskkill /F /IM chromedriver.exe");

		WebDriver webdriver;
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ieOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		ieOptions.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		ieOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"/Browser_files/IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
		webdriver=new InternetExplorerDriver(ieOptions);
		webdriver.manage().window().maximize();
		webdriver.get("https://ec.kamandirect.com/storeus/myaccount/registration.jsp");
		JavascriptExecutor jse = (JavascriptExecutor) webdriver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		WebDriverWait myWaitVar = new WebDriverWait(webdriver,20);
		WebElement radioBtn2 = webdriver.findElement(By.id("ctmNotRequested"));
		((JavascriptExecutor) webdriver).executeScript("arguments[0].checked = true;", radioBtn2);
		System.out.println("CLICKed 1");
		Thread.sleep(5000);
		System.out.println("CLICK 2 Started..");
		WebElement radioBtn1 = webdriver.findElement(By.id("indiRadio"));
		((JavascriptExecutor) webdriver).executeScript("arguments[0].checked = true;", radioBtn1);
		System.out.println("CLICKed 2");
		Thread.sleep(5000);
		System.out.println("CLICK 3 Started...");
		((JavascriptExecutor) webdriver).executeScript("document.getElementById('regCheckbox').click()");
		Thread.sleep(5000);
		System.out.println("CLICKed 3");
		Thread.sleep(5000);
		System.out.println("CLICK 4 Started...");
		((JavascriptExecutor) webdriver).executeScript("document.getElementById('atg_store_createMyAccount').click()");
		System.out.println("CLICKed 4");
		Thread.sleep(5000);
		System.out.println("Done");
	}
}

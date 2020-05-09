package com.testcases.driverscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class Closecon {

	//	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	@Test
	public void Closeiedriver() throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /F /IM IEDriverServer.exe");
		rt.exec("taskkill /F /IM iexplore.exe");
		rt.exec("taskkill /F /IM chromedriver.exe");
		//System.out.println("Your first argument is: "+args[0]);  
		//System.out.println("java Progs");

		WebDriver webdriver;
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ieOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		ieOptions.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		//ieOptions.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, false);
		ieOptions.setCapability("requireWindowFocus", true);
		ieOptions.setCapability("ignoreZoomSetting", true);
		//ieOptions.setCapability("nativeEvents",false);
		//ieOptions.

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"/Browser_files/IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
		webdriver=new InternetExplorerDriver(ieOptions);
		webdriver.manage().window().maximize();
		webdriver.get("https://ectest.kamandirect.com/storeus/");
		System.out.println("Done");
	}

}

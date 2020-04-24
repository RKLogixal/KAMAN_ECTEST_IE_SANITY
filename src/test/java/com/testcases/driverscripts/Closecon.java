package com.testcases.driverscripts;

import java.io.IOException;

public class Closecon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /F /IM IEDriverServer.exe");
		rt.exec("taskkill /F /IM iexplore.exe");
		rt.exec("taskkill /F /IM chromedriver.exe");
	}

}

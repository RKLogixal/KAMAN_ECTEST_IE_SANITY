package com.Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.operations.Common.FireClass;
import com.operations.Common.ReadUserconfig;
import com.testcases.driverscripts.Execute_MainScript;

public class CreateExecutionStatusHTMLfile {

	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		public void GenerateFinalExecutionStatus() throws IOException {
		Date date;
		SimpleDateFormat Time;
		Date Sdate=Execute_MainScript.Startdate;
		Date edate=Execute_MainScript.Enddate;
		int passcount = Execute_MainScript.Passcounter;
		int skipcount = Execute_MainScript.skipcounter;
		int failcount = FireClass.failcounter;
		int TotalTC = Execute_MainScript.TotalTCcounter;
		String ExecutionStatus = null;
		FileWriter writer = new FileWriter("./test-output/MailStatus.html", false);
		String msg="Test execution status as below :"+"<br />"+"<br />"
				+ "<b>Test execution Start Time : </b>"+Sdate+"<br />"
				+ "<b>Test execution End Time : </b>"+edate+"<br />"+"<br />"
				+ "<table width='60%' border='1' align='Left'>"
				+ "<tr align='center'>"
				+ "<th bgcolor='#D3D3D3'><b>Total number of testcases<b></th>"
				+ "<th bgcolor='#00FF00'><b>Passed Testcases<b></th>"
				+ "<th bgcolor='#FF0000'><b>Failed testcases<b></th>"
				+ "<th bgcolor='#FFA500'><b>Skipped testcases<b></th>"
				+ "</tr>"
				+ "<tbody>"
				+ "<tr align='center'>"
				+ "<td>"+TotalTC+"</td>"
				+ "<td>"+passcount+"</td>"
				+ "<td>"+failcount+"</td>"
				+ "<td>"+skipcount+"</td></tr></tbody></table>"
				+ "<br />"+"<br />"+"<br />"+"<br />"+"<br />"+"<br />"
				+ "<p>Kindly find attached HTML report for more information about Test execution summary.</p>"+"<br />"+"<br />";

		writer.write(msg);
		writer.close();
		System.out.println("Success...");
	}

}
	

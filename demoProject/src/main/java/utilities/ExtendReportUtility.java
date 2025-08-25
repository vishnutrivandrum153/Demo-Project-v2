package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility 
{
	
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() //return type is ExtentReports
		{ 
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html"); //report location
		reporter.config().setReportName("demo Project"); //report name
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organization", "Obsqura"); //name : value format
		extentReports.setSystemInfo("Name", "Rahul"); //name : value format
		return extentReports;
		}
	

} //End of ExtendReportUtility class

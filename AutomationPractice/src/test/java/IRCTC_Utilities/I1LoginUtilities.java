package IRCTC_Utilities;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class I1LoginUtilities {
	public static WebDriver driver;
	public static String CaptureScreenshot11(String fileName) {
		TakesScreenshot takesScreenshot1 = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot1.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot - To capture screenshot and store it in Local machine");
		return destFile.getAbsolutePath();
	}

	// 2. 'for Base64Code' - To return Base64 image
	public static String captureScreenshot22() {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot - Base64 image Returned");
		return base64Code;
	}
}

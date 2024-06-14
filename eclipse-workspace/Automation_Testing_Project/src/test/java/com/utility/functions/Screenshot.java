package com.utility.functions;

import java.io.File;
import com.google.common.io.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void takeScreenshot(WebDriver driver, String name) {

		try {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("./Screenshots/" + "Alert-" + name + "-" + System.currentTimeMillis() + ".png"));
			System.out.println("Screenshot Successfully added to Images");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

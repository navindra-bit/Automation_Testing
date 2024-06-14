package Automation_Testing_Project.Automation_Testing_Project;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utility.functions.Screenshot;

public class AppTest {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/");
	}

//	======================== Demo to use Screenshot utility class =============================
	@Test
	public void testHomePage() {

		assertTrue(driver.getTitle().contains("Advantage Shopping"));
		Screenshot.takeScreenshot(driver, "test home page title");
	}

//	======================== Demo to use Screenshot utility class =============================

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@AfterClass
	public void teardown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}

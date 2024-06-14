package Automation_Testing_Project.Automation_Testing_Project;

import static org.junit.Assert.assertTrue;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @BeforeMethod
    public void advantageonlineshopping() {
    	Driver driver = (Driver) new ChromeDriver();
    	
    }
}

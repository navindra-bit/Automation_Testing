package e_Commerce.Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPayment {
     
	WebDriver driver = null;
	By editshippingdetails = By.xpath("//a[normalize-space()='Edit shipping details']");
	By methodSafepay = By.cssSelector("img[alt='Safepay']");
	By methodmanualpayBy = By.cssSelector("img[alt='Master credit']");
	By paysafepay = By.xpath("//button[@id='pay_now_btn_SAFEPAY']");
	By paymanualpay = By.xpath("//button[@id='pay_now_btn_ManualPayment']");
	By next = By.id("next_btn");
	
	public WebElement Editshippingdetails() {
		return driver.findElement(editshippingdetails);
    }
	public WebElement MethodSafepay() {
		return driver.findElement(methodSafepay);
    }
	public WebElement MethodmanualpayBy() {
		return driver.findElement(methodmanualpayBy);
    }
	public WebElement Paysafepay() {
		return driver.findElement(paysafepay);
	}
	public WebElement Paymanualpay() {
		return driver.findElement(paymanualpay);
    }
	public WebElement Next() {
		return driver.findElement(next);
	}
	
}
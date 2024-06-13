package e_Commerce.Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPayment {
     
	WebDriver driver = null;
	By editshippingdetails = By.xpath("//a[normalize-space()='Edit shipping details']");
	By paysafepay = By.xpath("//button[@id='pay_now_btn_SAFEPAY']");
	By payManualpay = By.xpath("//button[@id='pay_now_btn_ManualPayment']");
    
	
	public WebElement Editshippingdetails() {
		return driver.findElement(editshippingdetails);
    }
	public WebElement Paysafepay() {
		return driver.findElement(paysafepay);
	}
	public WebElement PayManualpay() {
		return driver.findElement(payManualpay);
    }
}
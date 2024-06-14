package e_Commerce.Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	
	WebDriver driver = null;
	By addToCart = By.cssSelector("button[name='save_to_cart']");
	By addToCartLink = By.xpath("//a[@id='shoppingCartLink']");
	By checkout = By.cssSelector("#checkOutButton");
	By next = By.id("next_btn");
		
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement AddtoCart() {
		return driver.findElement(addToCart);
	}
	
	public WebElement AddToCartLink() {
		return driver.findElement(addToCartLink);
	}
	
	public WebElement Checkout() {
		return driver.findElement(checkout);
	}
	
	public WebElement Next() {
		return driver.findElement(next);
	}
}

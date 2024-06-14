package e_Commerce.Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrders {

	WebDriver driver = null;
	By continueshopping = By.xpath("//a[normalize-space()='CONTINUE SHOPPING']");
	By remove = By.xpath("//a[normalize-space()='REMOVE']");
	By removeYes = By.id("confBtn_1");
	By removeno = By.id("confBtn_2");
	By removealertclose = By.xpath("//div[@class='closeBtn conf-close-btn']");
	By searchorder = By.xpath("//div[@id='orderSearch']//a[@title='SEARCH']//*[name()='svg']");
	By searchorderclose = By.xpath("//div[@data-ng-click='closeSearchForce($event)']//img");
	By facebooklink = By.xpath("img[name='follow_facebook']");
	By twitterlink = By.xpath("img[name='follow_twitter']");
	By linkedinlink = By.xpath("//img[@name='follow_linkedin']");
	
	public MyOrders(WebDriver driver) {
		this.driver = driver;
	}
	
	//continueshopping will show when there is no order placed in MyOrder
	public WebElement Continueshopping() {
		return driver.findElement(continueshopping);
	}
	
	// removebtn is used to remove the order. if one order  placed it will not ask for confirmation
	public WebElement Removebtn() {
		return driver.findElement(remove);
	}
	
	//RemoveConfirmbtn alert will show when more than one order is placed .it ask us confirmation to remove the order 
	public WebElement RemoveConfirmbtn() {
		return driver.findElement(removeYes);
	}
	
	//RemoveDeclinebtn alert will show when more than one order is placed .it ask us denial to remove the order
	public WebElement RemoveDeclinebtn() {
		return driver.findElement(removeno);
	}
	
	//Removealertclose used to close alert 
	public WebElement Removealertclose() {
		return driver.findElement(removealertclose);
	}
	
	//Searchorder used to open the order search panel 
	public WebElement Searchorder() {
		return driver.findElement(searchorder);
	}
	//Searchorderclose used to close the search panel
	public WebElement Searchorderclose() {
		return driver.findElement(searchorderclose );
	}
	
	//Facebook link used in site for follow
	public WebElement Facebooklink() {
		return driver.findElement(facebooklink);
	}
	
	//Twitter link used in site for follow
	public WebElement  Twitterlink() {
		return driver.findElement(twitterlink);
	}
	
	//Linkedin link used in site for follow
	public WebElement Linkedinlink() {
		return driver.findElement(linkedinlink);
	}

}

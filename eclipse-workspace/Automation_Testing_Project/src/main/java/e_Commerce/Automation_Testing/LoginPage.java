package e_Commerce.Automation_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, null);
	}
	
	//@FindBy is used to find element in page factory in more optimize way
	@FindBy(xpath = "//input[@name='username']") WebElement userName;
	@FindBy(css = "input[name='password']") WebElement password;
	@FindBy(id = "sign_in_btn") WebElement signIn;
	@FindBy(linkText = "CREATE NEW_ACCOUNT") WebElement newAccount;
	@FindBy(className = "facebook ng_scope") WebElement facebookLogin;
	
	public WebElement userName() {
		return userName;
	}
	public WebElement password() {
		return password;
	}
	public WebElement signIn() {
		return signIn;
	}
	public WebElement newAccount() {
		return newAccount;
	}
	public WebElement facebookLogin() {
		return facebookLogin;
	}
	
}

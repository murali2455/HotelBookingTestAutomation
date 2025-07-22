package HotelBookingTestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pageobj {
WebDriver driver;
public login_pageobj(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver, this);
}


@FindBy(xpath = "//input[@id='username']") WebElement username;
@FindBy(xpath = "//input[@id='password']") WebElement password;
@FindBy(xpath = "//input[@id='login']") WebElement login_button;
	
public void login() {
	username.sendKeys("mrsm707070");
	password.sendKeys("4Y@DB9NR9JayAe");
	login_button.click();

}













}

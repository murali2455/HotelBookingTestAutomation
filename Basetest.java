package HotelBookingTestAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basetest {
	WebDriver driver;
	@BeforeTest
	public void lanch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	@Test(priority = 1)
	public void test() {
		login_pageobj log = new login_pageobj(driver);
		log.login();
	}
	@Test(priority = 2)
	public void search() throws InterruptedException {
		seach_hostal_pom host = new seach_hostal_pom(driver);
		host.seach();
		Thread.sleep(1000);
		host.screenshot();
	}
	@Test(priority = 3)
	public void book() {
		seach_hostal_pom book = new seach_hostal_pom(driver);
		book.BookAHotel();
	}
}

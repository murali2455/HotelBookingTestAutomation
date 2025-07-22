package HotelBookingTestAutomation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class seach_hostal_pom {

	WebDriver driver;
	public seach_hostal_pom(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	


	@FindBy(xpath = "//select[@id='location']") WebElement location;
	@FindBy(xpath = "//select[@id='hotels']") WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']") WebElement roms;
	@FindBy(xpath = "//select[@id='room_nos']") WebElement NumberofRooms;
	@FindBy(xpath = "//input[@id='datepick_in']") WebElement datapicker_in;
	@FindBy(xpath = "//input[@id='datepick_out']") WebElement datapicker_out;
	@FindBy(xpath = "//select[@id='adult_room']") WebElement  adult;
	@FindBy(xpath = "//select[@id='child_room']") WebElement child;
	@FindBy(xpath = "//input[@id='Submit']") WebElement sumit;
	@FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[2]/td[1]")WebElement select_ss;
	//
	@FindBy(xpath = "//input[contains(@id,'radiobutton')]") WebElement selectethe;
	@FindBy(xpath = "//input[@id='continue']") WebElement continu;
	
	
	///
	@FindBy(xpath = "//input[@id='first_name']") WebElement FirstName;
	@FindBy(xpath = "//input[@id='last_name']") WebElement LastName;
	@FindBy(xpath = "//textarea[@id='address']") WebElement BillingAddress;
	@FindBy(xpath = "//input[@id='cc_num']") WebElement CreditCardNo;
	@FindBy(xpath = "//select[@id='cc_type']") WebElement CreditCardType;
	@FindBy(xpath = "//select[@id='cc_exp_month']") WebElement ExpiryDate;
	@FindBy(xpath = "//select[@id='cc_exp_year']") WebElement Expyear;
	@FindBy(xpath = "//input[@id='cc_cvv']") WebElement CVVNumber;
	@FindBy(xpath = "//input[@id='book_now']") WebElement Booknow;
	@FindBy(xpath = "//input[@id='search_hotel']") WebElement searchhotel; 
	

	public void seach() {
		Select loc = new Select(location);
		loc.selectByValue("Los Angeles");
		Select Hotels = new Select(hotels);
		Select RoomType = new Select(roms);
		Select NoofRooms = new Select(NumberofRooms);
		Select AdultsRooms = new Select(adult);
		Select children_per_Rooms = new Select(child);
		datapicker_in.sendKeys("23/07/2025");
		datapicker_out.sendKeys("24/07/2025");
		Hotels.selectByValue("Hotel Sunshine");
		RoomType.selectByValue("Deluxe");
		NoofRooms.selectByValue("4");
		AdultsRooms.selectByValue("2");
		children_per_Rooms.selectByValue("2");
		sumit.click();	
	}
	public void screenshot() {
		File source = select_ss.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Sai Murali\\eclipse-workspace\\selenium\\src\\test\\java\\HotelBookingTestAutomation\\select.png");
		source.renameTo(target);
	}

public void BookAHotel() {
	selectethe.click();
	continu.click();
	FirstName.sendKeys("sai");
	LastName.sendKeys("murali");
	BillingAddress.sendKeys("13th Street 47 W 13th St, New York, NY 10011, USA");
	CreditCardNo.sendKeys("5425233430109903");
	Select cardtype = new Select(CreditCardType);
	cardtype.selectByValue("MAST");
	Select exp_date = new Select(ExpiryDate);
	exp_date.selectByValue("7");
	Select exp_year = new Select(Expyear);
	exp_year.selectByValue("2025");
	CVVNumber.sendKeys("738");
	Booknow.click();
	searchhotel.click();
	WebElement book_ss = driver.findElement(By.xpath("//body[1]/table[2]/tbody[1]/tr[2]/td[1]"));
	File book_source=book_ss.getScreenshotAs(OutputType.FILE);
	File boook_target= new File("C:\\Users\\Sai Murali\\eclipse-workspace\\selenium\\src\\test\\java\\HotelBookingTestAutomation\\book_ss.png");
	book_source.renameTo(boook_target);
	
}












}

package org.miniproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Mini_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C.R.sornalatha\\Selenium4clockBatch\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		driver.manage().window().maximize();
		WebElement register = driver.findElement(By.xpath("//a[@class='btn btn-outline btn-default']"));
		register.click();
		WebElement firstname = driver.findElement(By.id("inputFirstName"));
		firstname.sendKeys("deepika");
        WebElement lastname = driver.findElement(By.id("inputLastName"));
		lastname.sendKeys("paramasivam");
        WebElement email = driver.findElement(By.id("inputEmail"));
		email.sendKeys("deepikaparamasivam123@gmail.com");
		WebElement arrow = driver.findElement(By.xpath("//div[@class='iti-arrow']"));
		arrow.click();
		WebElement india = driver.findElement(By.xpath("//li[@data-dial-code='91']"));
		india.click();
	    WebElement phonenum = driver.findElement(By.id("inputPhone"));
		phonenum.sendKeys("1234567890");
		WebElement companyname = driver.findElement(By.id("inputCompanyName"));
		companyname.sendKeys("swetha");
		WebElement streetadd = driver.findElement(By.id("inputAddress1"));
		streetadd.sendKeys("vak nagar");
	    WebElement streetadd2 = driver.findElement(By.id("inputAddress2"));
		streetadd2.sendKeys("kav nagar");
		WebElement city = driver.findElement(By.id("inputCity"));
		city.sendKeys("vellore");
		WebElement state = driver.findElement(By.id("stateinput"));
		state.sendKeys("tamilnadu");
		WebElement postcode = driver.findElement(By.id("inputPostcode"));
		postcode.sendKeys("632321");
		WebElement country = driver.findElement(By.id("inputCountry"));
		Select s=new Select(country);
		s.selectByValue("IN");
		WebElement phonenum2 = driver.findElement(By.id("customfield2"));
		phonenum2.sendKeys("0123456789");
		WebElement password = driver.findElement(By.id("inputNewPassword1"));
		password.sendKeys("Deepik@1234");
		WebElement confirm = driver.findElement(By.id("inputNewPassword2"));
		confirm.sendKeys("Deepik@1234");
	}
}


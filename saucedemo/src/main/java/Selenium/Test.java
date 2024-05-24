package Selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		UserName.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("secret_sauce");
		WebElement LoginButton = driver.findElement(By.xpath("//input[@name='login-button']"));
		LoginButton.click();
		WebElement Sauce_Labs_Backpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		Sauce_Labs_Backpack.click();
		WebElement AddToCart_Button = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		AddToCart_Button.click();
		WebElement ShopptingCart = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
		ShopptingCart.click();
		WebElement Checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
		Checkout.click();
		WebElement first_name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		first_name.sendKeys("Aniv");
		WebElement Last_Name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Last_Name.sendKeys("Anil");
		WebElement Pincode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		Pincode.sendKeys("600114");
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		WebElement cancelButton = driver.findElement(By.xpath("//button[@id='cancel']"));
		cancelButton.click();
		WebElement RemoveButton = driver.findElement(By.xpath("//button[text()='Remove']"));
		RemoveButton.click();
		WebElement Open_menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		Open_menu.click();
		WebElement About = driver.findElement(By.xpath("//a[text()='About']"));
		About.click();		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file =new File("C:\\Users\\Anil\\eclipse-workspace\\saucedemo\\src\\test\\resources\\test.png");
		FileUtils.copyFile(screenshotAs, file);
		System.out.println("Completed 1");
	
		Actions action =new Actions(driver);
		WebElement Product = driver.findElement(By.xpath("(//span[text()='Products'])[1]"));
		action.moveToElement(Product).perform();
		WebElement plateformtest = driver.findElement(By.xpath("(//span[text()='Platform for Test'])[2]"));
		plateformtest.click();	
		WebElement Accept_Cookies = driver.findElement(By.xpath("//button[text()='OK']"));
		Accept_Cookies.click();
		System.out.println("Completed 2");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				;
	}

}

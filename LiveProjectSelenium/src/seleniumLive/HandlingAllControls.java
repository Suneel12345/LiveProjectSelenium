 package seleniumLive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingAllControls {
	WebDriver driver;
	@Test(priority=0)
	public void EdurekaProfile() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Testing\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.Edureka.co/");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Log In")).click();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("si_popup_email")));
		Thread.sleep(1000);
		action.click();
		action.sendKeys("Sunil26.kumar@ppbtp.com");
		Thread.sleep(2000);
		action.build().perform();
		action.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		Thread.sleep(1000);
		action.click();
		action.sendKeys("Suneel@123");
		Thread.sleep(2000);
		action.build().perform();
		action.moveToElement(driver.findElement(By.xpath("//button[text()='Login']")));
		Thread.sleep(2000);
		action.click();
		action.build().perform();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[text()='My Profile']")).click();
		Thread.sleep(2000);
		WebDriverWait waitElement=new WebDriverWait(driver, 20);
		waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")));
		driver.findElement(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")).click();
		String pageTitle=driver.getTitle();
		driver.findElement(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Edureka Guest");
		Thread.sleep(2000);
		System.out.println("b");
		driver.navigate().to("https://learning.edureka.co/my-profile");
		Thread.sleep(2000);
		System.out.println("a");
		System.out.println("abc");
		driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
		Thread.sleep(2000);
		Select dropdownCurrentJob=new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
		dropdownCurrentJob.selectByVisibleText("Software Testing");
		Thread.sleep(2000);
		Select dropdownEmpType=new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
		dropdownEmpType.selectByVisibleText("Both");
		Thread.sleep(2000);
		Select dropdownCTC=new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalary']")));
		dropdownCTC.selectByVisibleText("Not applicable");
		driver.findElement(By.xpath("//label[contains(text(),' Yes')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("//input[@name='preferredCity']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://learning.edureka.co/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		System.out.println("a");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
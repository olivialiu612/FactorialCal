package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FatorialCalculatorTest{
	
    @Test
    public static void main(String[] args) throws InterruptedException {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Olivia\\Downloads\\qa\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 1. Open https://qainterview.pythonanywhere.com/
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		
		//2. Verify the page title	
		Boolean iselementpresent = driver.findElements(By.name("The greatest factorial calculator!")).size()!= 0;
		
		//3. Click on Calculate button
		driver.findElement(By.cssSelector("[class='btn btn-success btn-lg")).click();
				
		//4. Verify result print 
		Boolean iselementpresent1 = driver.findElements(By.id("resultDiv")).size()!= 0;	
		
    }

		
	@Test
	public void boundaryTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Olivia\\Downloads\\qa\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 1. Open https://qainterview.pythonanywhere.com/
				driver.get("https://qainterview.pythonanywhere.com/");
				driver.manage().window().maximize();
				
		// 2. Test maxium boundary value 
		for(int i = 0; i <999; i++) {

	    driver.findElement(By.id("number")).sendKeys("i");     
	    driver.findElement(By.id("getFactorial")).click();
	    Thread.sleep(2000);
	    
	    String actual_result = driver.findElement(By.xpath("//input[@id='number']")).getText();
	    String expected_result = driver.findElement(By.cssSelector("[class=text-center top-space-40")).getText();
	    Assert.assertEquals(expected_result, actual_result);
		
		driver.quit();
		
		}
		
		}

}
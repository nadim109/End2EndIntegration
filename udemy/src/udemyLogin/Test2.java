package udemyLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void testcase1(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/nadeem/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.udemy.com/");
		driver.findElement(By.xpath("//a[@class='btn btn-quaternary']")).click();
		
		driver.quit();
	}
}

package DemoA.KeywordDrivenFacebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword {
	public static WebDriver driver;

	public static void openBrowser(){	
		System.setProperty("webdriver.chrome.driver", "/Users/kalpe/eclipse-workspace/SeleniumConcepts/Driver1/chromedriver.exe");
		driver=new ChromeDriver();
		}

	public static void navigateToURL(){	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		}

	public static void enterEmail(){
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kalpesh");
		}

	public static void enterPassword(){
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testuser_3"); 
		}

	public static void login(){
		driver.findElement(By.xpath("//button[@name='login']")).click();
		}

	public static void closeBrowser(){
			driver.quit();
		}	
}
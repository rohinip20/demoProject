package myapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mercuryToursDemo 
{
	

	
		  
		public WebDriver driver;

		@BeforeSuite
		public void Open_browser()
		{
			System.setProperty("webdriver.chrome.driver","E:\\cjc softwares\\Seleniumdata\\chromedriver_win32 (8)\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}

		@BeforeTest()
		public void EnterApplicationURL()
		{
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		}
			
		@Test(priority=1)
		  public void Maximize_browser() {
			
			driver.manage().window().maximize();
		  }

		@Test(priority=2)
		public void LoginwithValiddetails()
		{
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rohinip");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@name='login']")).click();
			driver.findElement(By.linkText("SIGN-OFF")).click();	
		}

		@AfterSuite
		public void Close_browser()
		{
			driver.close();
		}

		

	}




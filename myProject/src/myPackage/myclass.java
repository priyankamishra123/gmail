package myPackage;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class myclass {
	 WebDriver driver;
	
	
	/*@BeforeTest
	public void burl()
	{
	
	
	}*/
	
	
	 
	@Test(dataProvider="getdata")
	public void test(String uid,String pwd )
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hii\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(" http://www.demo.guru99.com/V4/");
	    
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(uid);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();}
		/*String eTitle=" Guru99 Bank Manager HomePage ";
		String aTitle=driver.getTitle();
		try {
			Alert alt=driver.switchTo().alert();
		Assert.assertEquals(aTitle, eTitle);
		}
		catch(NoAlertPresentException Ex) {
			String pageText = driver.findElement(By.tagName("tbody")).getText();

			// Extract the dynamic text mngrXXXX on page		
			String[] parts = pageText.split(Util.PATTERN);
			String dynamicText = parts[1];

			// Check that the dynamic text is of pattern mngrXXXX
			// First 4 characters must be "mngr"
			assertTrue(dynamicText.substring(1, 5).equals(Util.FIRST_PATTERN));
			// remain stores the "XXXX" in pattern mngrXXXX
			String remain = dynamicText.substring(dynamicText.length() - 4);
			// Check remain string must be numbers;
			assertTrue(remain.matches(Util.SECOND_PATTERN));
		}
	}
	
	/*@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	*/
	
	@DataProvider(name="getdata")
	public Object[][] getdata()
	{
		Object [][] data=new Object[4][2];
		data[0][0]="mngr161703";
		data[0][1]="dysUruh";
		data[1][0]="hi@gmail.com";
		data[1][1]="dysUruh";
		data[2][0]="mngr161703";
		data[2][1]="h12332";
		data[3][0]="kamal";
		data[3][1]="2312hfjd";
		return data;
		
	}

}

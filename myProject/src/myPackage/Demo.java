package myPackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver=new ChromeDriver();
	@Test
	public  void Gmail(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hii\\Downloads\\chromedriver_win32\\chromedriver.exe");

driver.manage().window().maximize();
driver.get(" http://www.gmail.com");

driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.id("identifierId")).sendKeys("priyanka.itengineer@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Hellojiya123");
driver.findElement(By.xpath("//span[text()='Next']")).click();



//List<WebElement> lst2=driver.findElements(By.xpath("//div[@class='afL afR J-M jQjAxd'][1]"));
//lst2.get(2).click();

Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//*[@id=\":k6\"]/div/div[1]"))).build().perform();
driver.findElement(By.xpath("//*[@id=\":k6\"]/div/img")).click();;
driver.findElement(By.xpath("//*[@id=\":l0\"]/div")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



driver.findElement(By.xpath("//div[1][@class='G-asx T-I-J3 J-J5-Ji' and @aria-hidden='true']")).click();
driver.findElement(By.xpath("//div[text()='Unread']")).click();
driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();

//List<WebElement> lst = driver.findElements(By.xpath("//div[@class='J-M jQjAxd']"));
//lst.get(3).click();
//Select dropdown=new Select(driver.findElement(By.xpath("//div[1][@class='G-asx T-I-J3 J-J5-Ji' and @aria-hidden='true']")));
//dropdown.selectByVisibleText("Unread");

}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}

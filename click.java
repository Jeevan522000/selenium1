package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click 
{
	public static void main(String[] args) 
	{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				WebElement ele = driver.findElement(By.xpath("//div[text()='Fashion']"));
				Actions a = new Actions(driver);
				a.moveToElement(ele).perform();
	}
}

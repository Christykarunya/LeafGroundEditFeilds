package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEditFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("christykarunya90@gmail.com");
		Thread.sleep(2000);
		
		WebElement eleAppend = driver.findElement(By.xpath("//label[contains(text(),'Append')]/following-sibling::input"));
		eleAppend.sendKeys("Text");
		eleAppend.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		
		//String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		//System.out.println(text);
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.name("username")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'disabled')]/following-sibling::input")).isEnabled());
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}

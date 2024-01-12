package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {

		
@Test
public void tc1() {
		WebDriverManager.chromedriver().setup();
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("greens123@gmail.com");
		
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("greens123");

		WebElement login = driver.findElement(By.name("login"));
		login.click();
}
}

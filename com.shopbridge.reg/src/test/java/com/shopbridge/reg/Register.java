package com.shopbridge.reg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		
		WebElement txtfullname = driver.findElement(By.id("name"));
		txtfullname.sendKeys("Thendral");
		
		WebElement txtorgname = driver.findElement(By.id("orgName"));
		txtorgname.sendKeys("Thendral");
		
		WebElement txtEmail = driver.findElement(By.id("singUpEmail"));
		txtEmail.sendKeys("mthendral.murugesan@gmail.com");
		
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='black-color ng-binding']"));
		checkbox.click();
		
		WebElement getstarted = driver.findElement(By.xpath("//div[@class='form-group custom-form-group']"));
		getstarted.click();
		
		driver.quit();
		
	}
	
	
	
		
	

}

package com.example.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3_4 {
	public static void main(String args[])throws InterruptedException{

	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
	//Launchig the url
	driver.navigate().to(url);
	
    driver.manage().window().maximize();
    
    
    
  
    driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Dharshana");
 
    driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("dharshana07@gmail.com");
    //email
    driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("dharshu");
    driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("dharshu04@gmail.com");
    //password

    JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,5000)", "");
    
   
    driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy Chirstmas");
    
  
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
    driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();

    
 
 
}

}

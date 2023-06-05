package com.example.day4;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3_1 {
	
	 public static void main( String[] args )throws InterruptedException
	    {
		 
		     	WebDriverManager.edgedriver().setup();
		         WebDriver driver = new EdgeDriver();
		         driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		         driver.manage().window().maximize();
		         driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Dharshana");
		         driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("V");
		         driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("dharsh07@gmail.com");
		         driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("dharsh@7");
		         JavascriptExecutor js=(JavascriptExecutor) driver;
		         js.executeScript("window.scrollBy(0,1500)","");
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
		     }
		 
	        
	        
	        

	    }



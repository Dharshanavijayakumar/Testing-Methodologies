package com.example.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3_3 {

	 public static void main( String[] args )
	    {
	    	WebDriverManager.edgedriver().setup();
			WebDriver driver= new EdgeDriver();
			String url="https://demo.opencart.com/";
			//Launchig the url
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
	    }
	
	
	
	

}

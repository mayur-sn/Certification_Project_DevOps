package com.edureka.certification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mnarkhede\\eclipse-workspace\\CerificationProject_DevOps\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mayur_sn");
		driver.findElement(By.name("password")).sendKeys("abcd@1234");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("buyFlights")).click();
		driver.findElement(By.xpath("//img[@src ='/images/forms/Logout.gif']")).click();
	}

}

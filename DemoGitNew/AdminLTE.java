package com.classes360;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AdminLTE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\Chromedriver\\chromedriver81.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/AdminLTE/index.html");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		user.sendKeys("kiran@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("123456");
		
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		signin.click();
		
		
		WebElement enter=driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a"));
		enter.click();
		
		WebElement add=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		add.click();
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys("Urvi Patel");
		
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		mobile.sendKeys("9999676789");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("urvi@gmail.com");
		
		WebElement course=driver.findElement(By.xpath("//*[@id=\"course\"]"));
		course.sendKeys("JAVA");
		
		WebElement box=driver.findElement(By.id("Female"));
		box.click();
		
		Select sel=new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"))); 
		sel.selectByIndex(1);
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("urvihirani");
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		submit.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
		
		WebElement user1=driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[3]/a/span"));
		user1.click();
		for(int th=1; th<=5; th++) {
			System.out.print("   "+driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th["+th+"]")).getText());
		}
		System.out.println();
		for(int tr=2; tr<=5; tr++) {
			for(int td=1; td<=5; td++) {
				System.out.print("   "+driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+tr+"]/td["+td+"]")).getText());
				
			}
			System.out.println();
		}
		driver.close();
		
}
}
		


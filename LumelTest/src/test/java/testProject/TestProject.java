package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProject {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("https://todomvc.com/");
		wd.manage().window().maximize();
		
		WebElement obj=wd.findElement(By.xpath("//span[contains(text(),'Angular')]"));
		
		wd.findElement(By.xpath("//span[contains(text(),'Angular')]")).click();
		
	wd.findElement(By.className("new-todo ng-valid ng-touched ng-dirty")).click();
		
	WebElement create=wd.findElement(By.className("new-todo ng-valid ng-touched ng-dirty"));	
		
	
	
	Actions a=new Actions(wd);
		a.doubleClick(create).build().perform();
		a.sendKeys("Drink Water Ever Hour").sendKeys(Keys.ENTER);
		a.sendKeys("Exercise Daily").sendKeys(Keys.ENTER);
		a.sendKeys("Clean the house").sendKeys(Keys.ENTER);
		a.sendKeys("Meditate Daily").sendKeys(Keys.ENTER);
		
		
		WebElement selec=wd.findElement(By.xpath("(//div[@class='view']/input[@class='toggle' ])[1]"));	
		Actions ab=new Actions(wd);
		ab.click(selec);
		
		
		WebElement selec1=wd.findElement(By.xpath("(//div[@class='view']/input[@class='toggle' ])[2]"));	
		Actions ab1=new Actions(wd);
		ab1.click(selec1);
		
		
		WebElement delete=wd.findElement(By.xpath("(//div[@class='view']/input[@class='toggle' ])[2]"));	
		Actions del=new Actions(wd);
		del.click(delete);
		
	
		WebElement cleanthe=wd.findElement(By.xpath("(//div[@class='view']/input[@class='toggle' ])"));	
		String data=cleanthe.getAttribute("Clean the house");
		
		if(data.contentEquals("Clean the house"))
		{
			
			wd.findElement(By.xpath("//button[@class='clear-completed']")).click();
			
		}
		
		WebElement activate=wd.findElement(By.xpath(".//a[contains(text(),'Active')]"));
		activate.click();
		
		WebElement completed=wd.findElement(By.xpath(".//a[contains(text(),'Completed')]"));
		completed.click();
		
	}

}

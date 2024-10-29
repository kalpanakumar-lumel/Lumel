package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProj {
	
public WebDriver wd;	

	@Given("Check allowing to login url and enter data in list")
	public void check_allowing_to_enter_data_in_list() {
		WebDriverManager.chromedriver().setup();
		//WebDriver wd=new ChromeDriver();
		wd.get("https://todomvc.com/");
		wd.manage().window().maximize();
		
		WebElement obj=wd.findElement(By.xpath("//span[contains(text(),'Angular')]"));
		wd.findElement(By.xpath("//span[contains(text(),'Angular')]")).click();
		
		wd.findElement(By.className("new-todo ng-valid ng-touched ng-dirty")).click();
			
				
			
	}

	@Given("Check allowing to add data in list")
	public void check_allowing_to_add_data_in_list() {
		WebElement create=wd.findElement(By.className("new-todo ng-valid ng-touched ng-dirty"));	

		Actions a=new Actions(wd);
		a.doubleClick(create).build().perform();
		a.sendKeys("Drink Water Ever Hour").sendKeys(Keys.ENTER);
		a.sendKeys("Exercise Daily").sendKeys(Keys.ENTER);
		a.sendKeys("Clean the house").sendKeys(Keys.ENTER);
		a.sendKeys("Meditate Daily").sendKeys(Keys.ENTER);
	    
	}

	@When("Check listing the added data")
	public void check_listing_the_added_data() {
		WebElement selec=wd.findElement(By.xpath("(//div[@class='view']/input[@class='toggle' ])[1]"));	
		Actions ab=new Actions(wd);
		ab.click(selec);  
	    
	}

	@Given("Check allowing to select data in list")
	public void check_allowing_to_select_data_in_list() {
		WebElement selec1=wd.findElement(By.xpath("(//div[@class='view']/input[@class='toggle' ])[2]"));	
		Actions ab1=new Actions(wd);
		ab1.click(selec1);
	    
	}

	@Given("Check allowing to delete Clean the house data from list")
	public void check_allowing_to_delete_clean_the_house_data_from_list() {
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

package assignment.week5.day1;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.Launch the URL https://www.chittorgarh.com/
 * 2.click on stock market
 * 3.click on NSE bulk deals
 * 4.get all the security names
 * 5.ensure whether there are duplicate security names
 * 
 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.chittorgarh.com/");
        driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();	
 driver.findElement(By.xpath("//a[text()='NSE SME Share Prices']")).click();
 List<WebElement> SecurityName = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[3]"));
 System.out.println("Security count is"+ SecurityName.size());
 for(int i= 0;i<SecurityName.size();i++) {
System.out.println(SecurityName.get(i).getText());
              }
// Find the Dulipcate Value
 Set<WebElement> dup=new LinkedHashSet<WebElement>(SecurityName);
 System.out.println(dup.size());
 if(SecurityName.size()==dup.size()) {
	 System.out.println("no Duplicate");
 }
 else {
	 System.out.println("Dulipcate Present");
 }
//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]
	}
	
	
}

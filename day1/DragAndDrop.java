package assignment.week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml");
        driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
 Actions bulider=new Actions(driver);
 bulider.dragAndDropBy(drag, 111,111).perform();
 //Verify by using Location
 System.out.println(drag.getLocation());
 WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
 WebElement desgination = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
 Actions bulider1=new Actions(driver);
 bulider1.dragAndDrop(source, desgination).perform();
 


 
	}

}

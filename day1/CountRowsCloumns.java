package assignment.week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRowsCloumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://html.com/tags/table/");
        driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 //find the Column Size
 List<WebElement> firstColumn = driver.findElements(By.xpath("(//table)[1]//th"));
 System.out.println("fristColumn Count"+firstColumn.size());
 //Find the row size
 List<WebElement> firstRow = driver.findElements(By.xpath("(//table)[1]//tr"));
 System.out.println("fristRow Count"+firstRow.size());
 //Find the Second Column Size
 List<WebElement> secondColumn = driver.findElements(By.xpath("(//table)[2]//th"));
 System.out.println("secondColumn Count"+secondColumn.size());
 //Find the row size
 List<WebElement> secondRow = driver.findElements(By.xpath("(//table)[2]//tr"));
 System.out.println("secondRow Count"+secondRow.size());
	}

}

package assignment.week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abosoluteusage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.Launch the URL
 * you to print the respective values based on  given library
 * (hint:if the library was absolute usage,then print all its value) 
 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://html.com/tags/table/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String text = driver.findElement(By.xpath("(//table)[1]//tr//td[text()='70.4%']")).getText();
        System.out.println("jquery is a absolute value of"+text);
        String text2 = driver.findElement(By.xpath("(//table)[1]//tr//td[text()='12.4%']")).getText();
        System.out.println("Bootstrap is a absolute value of"+text2);
        String text3 = driver.findElement(By.xpath("(//table)[1]//tr//td[text()='10.5%']")).getText();
        System.out.println("Modernizr is a absolute value of"+text3);

	}

}

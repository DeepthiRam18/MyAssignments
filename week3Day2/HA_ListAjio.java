package week3Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HA_ListAjio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Searching for Bags in Search Box and clicking search
		
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//label [contains(text(),'Men')]")).click();
		
		driver.findElement(By.xpath("//strong[text()='MORE']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'fashion bags')]")).click();
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		Thread.sleep(5000);
		
		String text1= driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("The Count of Items found is:" + text1);
		
		List<WebElement> links = driver.findElements(By.className("brand"));
		
		System.out.println("The Brands are: ");
		
		for (WebElement data : links) {
			
			String text = data.getText();
			
			System.out.print(text + ",");
		}
		
		List<WebElement> links1 = driver.findElements(By.className("nameCls"));
		
		System.out.println("\n" + "The Names of the Bags are:");
		
		for (WebElement data1 : links1) {
			
			String text2 = data1.getText();
			
			System.out.print(text2 + ",");
		}
		
		
			
	}
	
}
	
			
		
		
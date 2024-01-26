package week3Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> links = driver.findElements(By.className("a-price-whole"));
		
		int size = links.size();
		
		System.out.println("The total number in the List is :"+size);
		
		List <Integer> list = new ArrayList<Integer>();
		
		
		for (WebElement data : links) {
			String text = data.getText();
			
			//replace comma in text with ""
			String replaceAll = text.replaceAll(",","");
			
			int mobpri= Integer.parseInt(replaceAll);
			
			list.add(mobpri);
			//replace comma in text with ""
			}
		
		Collections.sort(list);
		System.out.println(list);

	}

}

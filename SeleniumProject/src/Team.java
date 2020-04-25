import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Team {
	
	
	String teamName;
	WebElement sacks;
	String picks;
	String fumblesRecovered;
	String touchdowns;
	String fantasyPoints;
	
	public void getTeamStats() {
		
		//prompt player input
		System.out.println("Choose Team: ");
		Scanner getTeamName = new Scanner(System.in);
		teamName = getTeamName.nextLine();
		
		//open driver
		System.setProperty("webdriver.chrome.driver","chromedriver");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
				
				

		driver.findElement(By.id("searchQuery")).click();;
		        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.id("searchQuery")).sendKeys(teamName);
		driver.findElement(By.name("jSubmit")).click();
		
		
		System.out.println("Team" + teamName);
		
		sacks = driver.findElement(By.className("statId-45"));
		System.out.println("Sacks: " + sacks);
		
		
		
		
		
	}
	

}

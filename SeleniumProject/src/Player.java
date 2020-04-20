import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Player {
	
//	public String name;
//	public String passingYards;
// public int passingTouchdowns;
//	public int interceptions;
//	public int rushingYards;
//	public int lostFumbles;
	
//	public Player( String passingYards) {
//		this.passingYards = passingYards;
//	}
	
//	passingYards = 0;
	
	
	public void getStats() {
		
		//prompt player one
		System.out.println("Choose player: ");
		Scanner in = new Scanner(System.in);
		String playerOne = in.nextLine();
		//prompt player two
//		System.out.println("Choose player Two: ");
//		Scanner inTwo = new Scanner(System.in);
//		String playerTwo = inTwo.nextLine();
		
		//open driver
		System.setProperty("webdriver.chrome.driver","chromedriver");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
		
		//player one get stats	    
	    Actions action = new Actions(driver);
	    WebElement element = driver.findElement(By.id("searchQuery"));
	    action.doubleClick(element).perform();
	    
        driver.findElement(By.id("searchQuery")).sendKeys(playerOne);
	    driver.findElement(By.name("jSubmit")).click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    System.out.println(playerOne + ":");
	    var playerOnePassingYards = driver.findElement(By.className("statId-5")).getText();
	    System.out.println("passing yards: " + playerOnePassingYards);
	    
	    
	    var playerOnePassingTouchdowns = driver.findElement(By.className("statId-6")).getText();
	    System.out.println("passing touchdowns" + playerOnePassingTouchdowns);

	    var playerOnePicks = driver.findElement(By.className("statId-7")).getText();
	    System.out.println("picks: " + playerOnePicks);

	    var playerOneRushYards = driver.findElement(By.className("statId-14")).getText();
	    System.out.println("rushing yards: " + playerOneRushYards);

	    var playerOneLostFumbles = driver.findElement(By.className("statId-30")).getText();
	    System.out.println("lost fumbles: " + playerOneLostFumbles);

	    var playerOneFantasyPoints = driver.findElement(By.className("playerSeasonTotal")).getText();
	    System.out.println("total fantasy points: " + playerOneFantasyPoints);
	    
	    	
	}
				 


	
	
	
	
	
		
	
	
		
		
		

}

import java.util.Scanner;
//import default.OpenSite.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Player {
	
//	public String playerOne;
//	public String passingYards;
// public int passingTouchdowns;
//	public int interceptions;
//	public int rushingYards;
//	public int lostFumbles;
	
//	public Player( String playerone) {
//		this.playerOne = playerOne;
//	}
	
//	passingYards = 0;
	String player;
	String playerCard;
	String passingYards;
	String passingTouchdowns;
	String picks;
	String rushYards;
	String lostFumbles;
	String fantasyPoints;
	
	String year;
	
	
	public void getStats() {
		
		//prompt player input
		System.out.println("Choose player: ");
		Scanner getPlayerName = new Scanner(System.in);
		player = getPlayerName.nextLine();
		
		
		//prompt year input
//		System.out.println("Choose Year: ");
//		Scanner getYear = new Scanner(System.in);
//		year = getYear.nextLine();
				
		//open driver
		System.setProperty("webdriver.chrome.driver","chromedriver");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
		
		

        driver.findElement(By.id("searchQuery")).click();;
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.findElement(By.id("searchQuery")).sendKeys(player);
	    driver.findElement(By.name("jSubmit")).click();
	    
		    
	    //get player name
	    playerCard = driver.findElement(By.className("playerNameFull")).getText();
	    		    	    
	    
	    System.out.println(player + ":");
	    passingYards = driver.findElement(By.className("statId-5")).getText();
//	    int totalPassYards = Integer.parseInt(passingYards);
	    System.out.println("passing yards: " + passingYards);
	    
	    
	     passingTouchdowns = driver.findElement(By.className("statId-6")).getText();
	    System.out.println("passing touchdowns: " + passingTouchdowns);

	     picks = driver.findElement(By.className("statId-7")).getText();
	    System.out.println("picks: " + picks);

	     rushYards = driver.findElement(By.className("statId-14")).getText();
//	     int Rushing = Integer.parseInt(rushYards);
	    System.out.println("rushing yards: " + rushYards);

	     lostFumbles = driver.findElement(By.className("statId-30")).getText();
	    System.out.println("lost fumbles: " + lostFumbles);

	    fantasyPoints = driver.findElement(By.className("playerSeasonTotal")).getText();
	    System.out.println("total fantasy points: " + fantasyPoints);
	    
	    
	    System.out.println("-----------------------");
	    
	    	
	}
	
	
	
	
//	int p2Rushing = Integer.parseInt(rushYards);
	
	
	
	
	
	public void compareStats() {
		
		
		
		
		
		
		
		
		
		
	}
				 


	
	
	
	
	
		
	
	
		
		
		

}

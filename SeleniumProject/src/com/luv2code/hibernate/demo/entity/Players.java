package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


///////


import java.util.Scanner;
//import default.OpenSite.java;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@Entity
@Table(name="nfl_players")
public class Players {

	@Id
	@Column(name="id")
	public int id;
	
	@Column(name="name")
	public String playerCard;
	
	@Column(name="passing_yards")
	public String passingYards;
	
	@Column(name="passing_touchdowns")
	public String passingTouchdowns;
	
	@Column(name="picks")
	public String picks;
	
	@Column(name="rushing_yards")
	public String rushYards;
	
	@Column(name="lost_fubles")
	public String lostFumbles;
	
	@Column(name="fantasyPoints")
	public String fantasyPoints;
	
	
	
	public Players() {
		
	}



	public Players(String playerCard, String passingYards, String passingTouchdowns,  String picks,  String rushYards,
			 String lostFumbles,  String fantasyPoints) {
		this.playerCard = playerCard;
		this.passingYards = passingYards;
		this.passingTouchdowns = passingTouchdowns;
		this.picks = picks;
		this.rushYards = rushYards;
		this.lostFumbles = lostFumbles;
		this.fantasyPoints = fantasyPoints;
	}
	
	
public void getStats() {
		
		//prompt player input
		System.out.println("Choose player: ");
		Scanner getPlayerName = new Scanner(System.in);
		playerCard = getPlayerName.nextLine();
		
		
				
		//open driver
		System.setProperty("webdriver.chrome.driver","chromedriver");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
		
		

        driver.findElement(By.id("searchQuery")).click();;
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.findElement(By.id("searchQuery")).sendKeys(playerCard);
	    driver.findElement(By.name("jSubmit")).click();
	    
		    
	    //get player name
	    playerCard = driver.findElement(By.className("playerNameFull")).getText();
	    		    	    
	    
	    System.out.println(playerCard + ":");
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
	
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPlayerCard() {
		return playerCard;
	}



	public void setPlayerCard(String playerCard) {
		this.playerCard = playerCard;
	}



	public String getPassingYards() {
		return passingYards;
	}



	public void setPassingYards(String passingYards) {
		this.passingYards = passingYards;
	}



	public String getPassingTouchdowns() {
		return passingTouchdowns;
	}



	public void setPassingTouchdowns(String passingTouchdowns) {
		this.passingTouchdowns = passingTouchdowns;
	}



	public String getPicks() {
		return picks;
	}



	public void setPicks(String picks) {
		this.picks = picks;
	}



	public String getRushYards() {
		return rushYards;
	}



	public void setRushYards(String rushYards) {
		this.rushYards = rushYards;
	}



	public String getLostFumbles() {
		return lostFumbles;
	}



	public void setLostFumbles(String lostFumbles) {
		this.lostFumbles = lostFumbles;
	}



	public String getFantasyPoints() {
		return fantasyPoints;
	}



	public void setFantasyPoints(String fantasyPoints) {
		this.fantasyPoints = fantasyPoints;
	}



	@Override
	public String toString() {
		return "Players [id=" + id + ", playerCard=" + playerCard + ", passingYards=" + passingYards
				+ ", passingTouchdowns=" + passingTouchdowns + ", picks=" + picks + ", rushYards=" + rushYards
				+ ", lostFumbles=" + lostFumbles + ", fantasyPoints=" + fantasyPoints + "]";
	}
	
	
	
	
	
}


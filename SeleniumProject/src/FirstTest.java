import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

	public static void main(String[] args) {
		
		
//		OpenSite start = new OpenSite(null, null, null, null, null, null, null, null, null);
//		start.openWebSite();

		
		Player p1 = new Player(null, null, null, null, null, null, null, null, null);
		p1.getStats();
					
		Player p2 = new Player(null, null, null, null, null, null, null, null, null);
		p2.getStats();
		
		
//		Team t1 = new Team();
//		t1.getTeamStats();
		
		//logic tests
		
		int p1Rushing = Integer.parseInt(p1.rushYards);
		int p2Rushing = Integer.parseInt(p2.rushYards);
		
		int p1Passing = Integer.parseInt(p1.passingYards);
		int p2Passing = Integer.parseInt(p2.passingYards);
		
		
		if(p1Rushing > p2Rushing) {
			System.out.println(p1.player + " " + "has more total rushing yards");
		} if(p2Rushing > p1Rushing) {
			System.out.println(p2.player + " " + "has more total rushing yards");
		} if(p1Rushing == p2Rushing) {
			System.out.println("the two players are tied");
		}
		
		
		

		

//		if(p1Passing > p2Passing) {
//			System.out.println(p1.player + " " + "has more total passing yards");
//		} if(p2Passing > p1Passing) {
//			System.out.println(p2.player + " " + "has more total passing yards");
//		} if(p1Passing == p2Passing) {
//			System.out.println("the two players are tied");
//		}

		
		
		

		
		

	    

	    

	    

	    
		
		
		

		
		
		
	}

}

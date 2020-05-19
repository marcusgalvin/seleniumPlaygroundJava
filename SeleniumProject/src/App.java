import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.luv2code.hibernate.demo.entity.Players;


public class App {

	public static void main(String[] args) {
		
				

		//scrape
		Scraper scrape = new Scraper();
		scrape.getStats();
		scrape.saveDataWithHibernate();
		
					
//		Players p2 = new Players();
//		p2.getStats();
		
		
//		Team t1 = new Team();
//		t1.getTeamStats();
		
		//logic tests
		
//		int p1Rushing = Integer.parseInt(p1.rushYards);
//		int p2Rushing = Integer.parseInt(p2.rushYards);
//		
//		int p1Passing = Integer.parseInt(p1.passingYards);
//		int p2Passing = Integer.parseInt(p2.passingYards);
//		
//		
//		if(p1Rushing > p2Rushing) {
//			System.out.println(p1.player + " " + "has more total rushing yards");
//		} if(p2Rushing > p1Rushing) {
//			System.out.println(p2.player + " " + "has more total rushing yards");
//		} if(p1Rushing == p2Rushing) {
//			System.out.println("the two players are tied");
//		}
		
		
		

		

//		if(p1Passing > p2Passing) {
//			System.out.println(p1.player + " " + "has more total passing yards");
//		} if(p2Passing > p1Passing) {
//			System.out.println(p2.player + " " + "has more total passing yards");
//		} if(p1Passing == p2Passing) {
//			System.out.println("the two players are tied");
//		}
		
		
	}

}

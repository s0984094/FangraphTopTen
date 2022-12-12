package edu.monmouth.fanGraph;
import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FangraphTopTen {
	
	public static void main(String[] args) throws IOException {
		
		String subHeading1 = "Player Name: ";
		String subHeading2 = "Wins Above Replacement value: ";

		Document battingStats2022 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0").get();;
		Document battingStats2021;
		Document battingStats2020;

/////////////////////TOP BATTING STATS FOR 2022////////////////////////////////////////
		Player[] ttp2022;
		ttp2022 = new Player[10];
	
		battingStats2022 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0").get();
		
		ttp2022 [0] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__0");
		ttp2022 [1] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__1");
		ttp2022 [2] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__2");
		ttp2022 [3] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__3");
		ttp2022 [4] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__4");
		ttp2022 [5] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__5");
		ttp2022 [6] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__6");
		ttp2022 [7] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__7");
		ttp2022 [8] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__8");
		ttp2022 [9] = new Player(battingStats2022,"LeaderBoard1_dg1_ctl00__9");
		
		System.out.println("\n"+"------------------------- Top Ten MLB Batters for 2022 -------------------------");
		System.out.printf("%20s %55s %n",subHeading1, subHeading2);
		for(int i=0; i<ttp2022.length; i++) {
			System.out.printf("%-20s %40s %n", ttp2022[i].getName(), ttp2022[i].getWarNum());
		}

///////////////////TOP BATTING STATS FOR 2021 ///////////////////////////////////////
		Player[] ttp2021;
		ttp2021 = new Player[10];
	
		battingStats2021 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0").get();
		
		ttp2021 [0] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__0");
		ttp2021 [1] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__1");
		ttp2021 [2] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__2");
		ttp2021 [3] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__3");
		ttp2021 [4] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__4");
		ttp2021 [5] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__5");
		ttp2021 [6] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__6");
		ttp2021 [7] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__7");
		ttp2021 [8] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__8");
		ttp2021 [9] = new Player(battingStats2021,"LeaderBoard1_dg1_ctl00__9");
		
		System.out.println("\n"+"------------------------- Top Ten MLB Batters for 2021 -------------------------");
		System.out.printf("%20s %55s %n",subHeading1, subHeading2);
		for(int i=0; i<ttp2021.length; i++) {
			System.out.printf("%-20s %40s %n", ttp2021[i].getName(), ttp2021[i].getWarNum());
		}

///////////////////TOP BATTING STATS FOR 2020 ///////////////////////////////////////
		Player[] ttp2020;
		ttp2020 = new Player[10];
	
		battingStats2020 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0").get();
		
		ttp2020 [0] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__0");
		ttp2020 [1] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__1");
		ttp2020 [2] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__2");
		ttp2020 [3] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__3");
		ttp2020 [4] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__4");
		ttp2020 [5] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__5");
		ttp2020 [6] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__6");
		ttp2020 [7] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__7");
		ttp2020 [8] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__8");
		ttp2020 [9] = new Player(battingStats2020,"LeaderBoard1_dg1_ctl00__9");
		
		System.out.println("\n"+"------------------------- Top Ten MLB Batters for 2020 -------------------------");
		System.out.printf("%20s %55s %n",subHeading1, subHeading2);
		for(int i=0; i<ttp2020.length; i++) {
			System.out.printf("%-20s %40s %n", ttp2020[i].getName(), ttp2020[i].getWarNum());
		}
////////////////////////////TOP 10 HITTERS  2020 - 2022////////////////////////////////////////////////
		
		System.out.println("\n"+"------------- Top Ten MLB Batters for 2020, 2021, and 2022 seasons -------------");
		System.out.printf("%20s %55s %n",subHeading1, subHeading2);

		/* Add the top ten players from each seasons array the array that will contain the top
		 *  ten players from 2020 to 2022 */
		Player[] ttp2020to2022= new Player[30];

		for(int i=0;i<ttp2022.length;i++) {
			ttp2020to2022[i] = ttp2022[i];	
		}
		for (int i=0;i<ttp2021.length;i++) {
			ttp2020to2022[i+10] = ttp2021[i];
		}
		for(int i=0;i<ttp2020.length;i++) {
			ttp2020to2022[i+20] = ttp2020[i];
		}
		
		// A loop that sorts all 30 players based on  Wins Above Replacement Stat
		 
		for(int i =0; i==ttp2020to2022.length;i++) {
			
			if(ttp2020to2022[i+1].getWarNum()> ttp2020to2022[i].getWarNum()) {
			Player temp =	ttp2020to2022[i];
			ttp2020to2022[i+1] = ttp2020to2022[i];
			ttp2020to2022[i]=temp;
			}
		} 
		
		for(int i=0;i<10;i++) {
			System.out.printf("%-20s %40s %n", ttp2020to2022[i].getName(),  ttp2020to2022[i].getWarNum());
			
		}
		
	}
}

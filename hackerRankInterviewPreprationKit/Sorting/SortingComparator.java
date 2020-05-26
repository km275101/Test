package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
		int s1 = a.score;
		int s2 = b.score;
		
		
		 return  ((s1 == s2) ? a.name.compareTo(b.name) : s1<s2 ? 1 : -1);
		 
		 
		/*if (a.score == b.score) {
			return a.name.compareTo(a.name);
		}else if(a.score > b.score) {
			return -1;
		}else {
			return -1;
		}*/
		
		
    
    }
}


public class SortingComparator  {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Player player[] = new Player[n];
    Checker checker = new Checker();
    
    for(int i=0; i < n; i++){
        player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();
 
    Arrays.sort(player, checker);
    for(int i = 0; i < player.length; i++){
        System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
    }

}

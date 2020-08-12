import java.util.HashMap;
import java.util.Map;

public class Yahtzee {

	public static int sumOfDie(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int sum = dice1 + dice2 + dice3 + dice4 + dice5;

		return sum;
	}

	public static int yatzy(int dice1, int dice2, int dice3, int dice4, int dice5) {

		dice1 = dice2 = dice3 = dice4 = dice5;

		return 50;// points
	}

	// sum of highest two die
	public static int pair(int dice1, int dice2, int dice3, int dice4, int dice5) {
		int sum = 0;
		int[] die = { dice1, dice2, dice3, dice4, dice5 };
		int highest = 0;
		int secondHighest = 0;
		for (int i = 0; i < die.length; i++)
			if (die[i] > highest) {
				secondHighest = highest;
				highest = die[i];
			} else if (die[i] > secondHighest) {
				secondHighest = die[i];
			}

		sum = highest + secondHighest;

		return sum;

	}
	// Four of a kind

	public static boolean fourOfKind(int dice1,int dice2,int dice3,int dice4,int dice5) {
        int[] die = {dice1,dice2,dice3,dice4,dice5};
       int count =0;
        for (int i = 0; i < die.length; i++){
                  if (die.equals(die[i])){
                      count ++;
                  }
        }
        if (count == 4);
       
        return true;

}

	// Three of a kind

		public static boolean threeOfKind(int dice1,int dice2,int dice3,int dice4,int dice5) {
	        int[] die = {dice1,dice2,dice3,dice4,dice5};
	       int count =0;
	        for (int i = 0; i < die.length; i++){
	                  if (die.equals(die[i])){
	                      count ++;
	                  }
	        }
	        if (count == 3);
	       
	        return true;
		}


		// Small Straight 1,2,3,4,5

		public static boolean smallStraight(int dice1,int dice2,int dice3,int dice4,int dice5) {
			boolean isTrue = true; 
			int[] die= {dice1,dice2, dice3,dice4,dice5};
			for(int i =0; i <die.length-1; i++){ 
			    int one = die[i];  
			    int two= die[i+1];

			     if (! (one == two-1) || (one==5 && two==1)) {
			       isTrue=false;
			     }

			}
			return isTrue;
			}
		
	}

//
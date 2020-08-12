import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class YahtzeeTest {
	
	
	
	
	

 @Test
 void test1(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   int actual= Yahtzee.sumOfDie(4,3,5,7,6);
	   
	 assertEquals(25, actual);
 }
 
 @Test
 void test2(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   int actual= Yahtzee.yatzy(4,4,4,4,4);
	   
	 assertEquals(50, actual);
}
 
 @Test
 void test3(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   int actual= Yahtzee.pair(4,5,6,7,1);
	   
	 assertEquals(13, actual);
}
 
 @Test
 void test4(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   boolean actual= Yahtzee.fourOfKind(4,4,4,7,4);
	   
	 assertEquals(true, actual);
}
 
 @Test
 void test5(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   boolean actual= Yahtzee.threeOfKind(4,3,4,5,4);
	   
	 assertEquals(true, actual);
}

 
 @Test
 void test6(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   boolean actual= Yahtzee.smallStraight(1,5,3,4,2);
	   
	 assertEquals(true, actual);
}
}
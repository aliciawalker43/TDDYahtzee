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
 
 
 
 @Test
 void onesTwosThrees1() {
	 
	 
	 
	 int actual = Yahtzee.onesTwosThrees(2, 2, 2, 2, 2, 2);
	 
	assertEquals(10, actual);
			 
 }
 
 @Test
 void onesTwosThrees2() {
	 
	 
	 
	 int actual = Yahtzee.onesTwosThrees(2, 2, 2, 6, 2, 6);
	 
	assertEquals(6, actual);
			 
 }
 
 @Test
 void twoPair() {
	 
	 assertEquals(6, Yahtzee.twoPair(1, 1, 2, 2, 3));
 }
 
 
 @Test
 void twoPairFail() {
	 
	 assertEquals(10, Yahtzee.twoPair(1, 2, 3, 4, 3));
 }
 
 @Test
 void largeStr8test() {
	 
	 assertEquals(20, Yahtzee.largeStraight(2, 3, 4, 5, 6));
 }
 
 @Test
 void largeStr8testfail() {
	 
	 assertEquals(20, Yahtzee.largeStraight(2, 3, 4, 5, 4));
 }
 
}
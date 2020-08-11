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
	   
	 assertEquals(20, actual);
 }
 
 @Test
 void test2(){
	 
	   int dice1;
	   int dice2;
	   int dice3;
	   int dice4;
	   int dice5;
	   
	   int actual= Yahtzee.sumOfDie(4,3,5,7,6);
	   
	 assertEquals(20, actual);
}
}
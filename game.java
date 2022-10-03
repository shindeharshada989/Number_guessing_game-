package Game;
import java.util.Random;
import java.util.Scanner;
public class MyGame {
   
	   public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   String start = "yes";
		   while(start.equals("yes")) {
			   Random random = new Random();
			   int randomNum = random.nextInt(100);
			   int guessing = -1;
			   int num = 0;
			   while(guessing!=randomNum) {
				   System.out.println("Guess a number from 1 to 100 :-");
				   guessing = sc.nextInt();
				   num++;
				   
				   if(guessing==randomNum) {
					   System.out.println("GREATE...!!!! you won the game....Well Done...");
					   System.out.println("It only took "+ num+" "+"attempts");
					   System.out.println("would you like cotinue this game...? yes or no :");
					   start = sc .next().toLowerCase();
				   }
				   else if(guessing>randomNum) {
					   System.out.println("You are guessing too High.....guess again");
				   }
                   else if (guessing<randomNum){
				   System.out.println("You are guessing too Low....guess again");
			     }
			   }
			   
		   } 
		   sc.close();
	   }
}

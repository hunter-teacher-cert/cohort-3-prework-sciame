import java.io.*;
import java.util.*;

class Guess {
  public static void main(String[] args){
  int userin;
  int D;

  Random random = new Random();
  int number = random.nextInt(1) +1;
  System.out.println(number);
   
  Scanner in = new Scanner(System.in);

  System.out.print("Guess a number between 1 and 100, inclusive.\nType a number: ");
  userin = in.nextInt();
  //include the following line after entering an int variable into the Scanner
  in.nextLine(); 



  System.out.println("Your guess is: " + userin + "\nThe computer generated: " + number);     
 

  D = Math.abs(number - userin);
  
  System.out.println("\nThe difference between you and the computer is: " + D);
  if(number==userin){
    System.out.println("\nNIIIIIIIIIIIICCCCCCCCE!!!!!!");
  }

}


}
import java.io.*;
import java.util.*;

public class Craps {

int shoot_result;
  
  
public static int roll(int n){
  Random random = new Random();
  int this_roll = random.nextInt(n)+1;
  System.out.println(this_roll);
  return this_roll;
  
}

  public static int shoot(int num_of_dice, int max_dice_value){
  if(num_of_dice == 1) {
    shoot_result = roll(6);
    } else if (num_of_dice == 2){
    shoot_result = roll(6) + roll(6);
    }
}

public static void round(int n){
  
}
  
public static void main(String[] args) {
roll(6);
  
    
}
  
}
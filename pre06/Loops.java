import java.io.*;
import java.util.*;

public class Loops {

public static double squareRoot(double a, double x, double x1) {
    do {
      x=x1;  
      x1 = (x+(a/x)) / 2;
        
      } while (Math.abs(x-x1)>0.0001); 
  return x1;
}

public static void main(String[] args) {
    System.out.println(squareRoot(81, 40, 40));
  
}
  
}
package replit;

import java.util.Scanner;

public class Chicken {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:
  if(order.equals("burger")){
      System.out.println("Your total is $12.50");
  } else if (order.equals("chicken")) {
      System.out.println("Your total is $9.75");

  }

    }
}
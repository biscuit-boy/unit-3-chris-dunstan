import java.util.Scanner;

public class Multiples{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int base = 0;

    boolean valid = false;

    while (!valid){
      try{
        System.out.println("");
        System.out.print("What's your base? -> ");
        base = in.nextInt();
        System.out.println("");

        if (base == 0){
          System.out.println("Base cannot be zero.");
        }
        else if (base < 0){
          System.out.println("Base must be a positive value.");
        }
        else{
          valid = true;
        }
      }
      catch(java.util.InputMismatchException e){
        System.out.println("");
        System.out.println("Base must be a whole number.");
        in.next();
      }
    }

    int upper = 0;

    valid = false;

    while (!valid){
      try{
        System.out.println("");
        System.out.print("What's your upper limit? -> ");
        upper = in.nextInt();
        System.out.println("");

        if (upper<0){
          System.out.println("Upper value must be a positive whole number.");
        }
        else if (upper < base){
          System.out.println("Your upper value cannot be greater than your base.");
        }
        else{
          valid = true;
        }
      }
      catch(java.util.InputMismatchException e){
        System.out.println("");
        System.out.println("Upper limit must be a whole number.");
        in.next();
      }
    }

    int iters = (int) upper / base;
    int lines = 1 + (int) iters / 5;
    int largestLen = 1 + (int) (Math.log((double) iters*base) / Math.log(10.0));

    final int LINELIMIT = 5;
    int numInLine = LINELIMIT;

    int count = 0;
    int num = 0;
    int numLen = 0;

    System.out.println("");
    for (int line = 0; line < lines; line++){
      if ((iters - count) < LINELIMIT){
        numInLine = iters - count;
      }
      else{
        numInLine = LINELIMIT;
      }
      System.out.println("");
      for (int i = 0; i < numInLine; ++i){
        num = ((count+1)*base);
        numLen = 1 + (int) (Math.log((double) num) / Math.log(10.0));
        System.out.print(num);
        for (int k = 0; k <= (largestLen - numLen); k++){
          System.out.print(" ");
        }
        count ++;
      }
    }


    System.out.println("");
  }
}

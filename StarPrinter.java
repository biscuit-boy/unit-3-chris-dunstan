import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class StarPrinter{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    // defines width of printed icons
    final int WIDTH = 21;

    // control flow variable
    int option = 0;

    // maintains while loop and allows for input testeing
    boolean looping = true;
    boolean valid = false;

    // main loop
    while(looping){
      valid = false;

      // finds user input using exception handling to determine valid input
      while(!valid){
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println(" Give a number 1-5 to get your lucky symbol. ");
        System.out.println("");
        System.out.println("               Enter 0 to quit");
        System.out.println(" ");
        System.out.println("         --  Say 6 for a surprise  --  ");
        System.out.println(" ");
        System.out.print(" -> ");

        try{
          option = in.nextInt();

          if (option >= 0 && option <= 6){
            valid = true;
          }
          else{
            System.out.println("");
            System.out.println(" You must input a number between 1 and 6.");
          }
        }
        catch(java.util.InputMismatchException e){
          in.next();
          System.out.println("");
          System.out.println(" You must input a whole number between 1 and 6.");
        }
      }

      System.out.println("");
      System.out.println("----------------------------------------------");

      // used within patterns to determine how many stars/spaces will appear
      // on each line
      int numStar = 0;
      int numSpace = 0;

      // breaks main loop
      if (option == 0){
        looping = false;
        break;
      }

      // prints triangle with right angle in NW corner
      else if (option == 1){
        System.out.println("");

        for (int i = 0; i < WIDTH; ++i){
          numStar = WIDTH - i;

          System.out.println("");
          System.out.print(" ");

          for (int k = 1; k < numStar; ++k){
            System.out.print("*");
          }
        }
      }

      // prints triangle with right angle in SE corner
      else if (option == 2){
        System.out.println("");

        for (int i = 0; i < WIDTH; ++i){
          numStar = i;
          numSpace = WIDTH - numStar;

          System.out.println("");

          // prints spaces
          for (int k = 0; k < numSpace; ++k){
            System.out.print(" ");
          }

          // prints stars
          for (int l = 0; l < numStar; ++l){
            System.out.print("*");
          }
        }
      }

      // prints triangle in NE corner
      else if (option == 3){
        System.out.println("");

        for (int i = 0; i < WIDTH; ++i){
          numStar = WIDTH - i;
          numSpace = i;

          System.out.println("");
          System.out.print(" ");

          for (int k = 0; k < numSpace; ++k){
            System.out.print(" ");
          }

          for (int k = 0; k < numStar; ++k){
            System.out.print("*");
          }
        }
      }

      // prints diamond
      else if (option == 4){
        // so that program can print half of diamond at a time
        int halfDim = (WIDTH + 1)/2;

        // first half of diamond
        for (int i = 0; i < halfDim; ++i){
              numStar = 2 * i + 1;
              numSpace = (WIDTH - numStar) / 2 + 2;

              System.out.println(" ");

              for (int k = 0; k < numSpace; ++k) {
                  System.out.print(" ");
              }

              for (int k = 0; k < numStar; ++k) {
                  System.out.print("*");
              }
          }

        // second half of diamond
        for (int i = halfDim; i >= 0; --i){
            numStar = 2*i + 1;
            numSpace = (WIDTH - numStar)/2 + 2;

            System.out.println("");

            for (int k = 0; k < numSpace; ++k){
                System.out.print(" ");
            }

            for (int k = 0; k<numStar; ++k) {
                System.out.print("*");
            }
        }
      }

      // prints hourglass
      else if (option == 5){
        int halfDim = (WIDTH + 1)/2;

        // fist half of hourglass
        for (int i = halfDim; i > 0; --i){
            numStar = 2*i + 1;
            numSpace = (WIDTH - numStar)/2 + 2;

            System.out.println(" ");

            for (int k = 0; k < numSpace; ++k){
                System.out.print(" ");
            }

            for (int k = 0; k<numStar; ++k) {
                System.out.print("*");
            }
          }

        // second half of hourglass
        for (int i = 0; i < halfDim + 1; ++i){
              numStar = 2 * i + 1;
              numSpace = (WIDTH - numStar) / 2 + 2;

              System.out.println(" ");

              for (int k = 0; k < numSpace; ++k) {
                  System.out.print(" ");
              }

              for (int k = 0; k < numStar; ++k) {
                  System.out.print("*");
              }
          }
      }

      // prints sine wave
      else if (option == 6){
        // determines wavyness and size of wave, respectivly
        final double PERIOD = 30;
        final double AMP = 90;

        // determines delay between the printing of different rows
        final int SINDELAY = 12;

        double row = 0;

        while (true){
          numStar = (int) ((Math.sin(row/PERIOD) + 1)*AMP/2);
          System.out.println(" ");

          for (int i = 0; i <= numStar; i++){
            System.out.print("*");
            }

          ++row;

          try{
            TimeUnit.MILLISECONDS.sleep(SINDELAY);
          }
          catch(InterruptedException e){
            continue;
          }

        }
      }
    }
    System.out.println("");
    System.out.println("Thank you for dropping by!");
    System.out.println("");
  }
}

import java.util.Scaner;

public class StarPrinter{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int WIDTH = 21;

    int option = 0;

    boolean valid = false;
    while(!valid){
      System.out.println("");
      System.out.pritnln("Give a number 1-5 to get your lucky symbol. ");
      System.out.println("Say 6 for a surprise. ");
      System.out.println("");
      System.out.print("-> ");

      try{
        option = in.nextInt();

        if (option >= 0 && option <= 6){
          valid = true;
        }
        else{
          System.out.println("");
          System.out.println("You must input a number between 1 and 6.");
        }
      }
      catch(java.util.InputMismatchException e){
        in.next();
        System.out.println("");
        System.out.println("You must input a whole number between 1 and 6.");
      }
    }

    int numStar = 0;
    int numSpace = 0;

    if (option == 1){
      System.out.println("");
      for (int i = 0; i < WIDTH; ++i){
        numStar = WIDTH - i;
        System.out.println("");
        for (int k = 1; k < numStar; ++k){
          System.out.print("*");
        }
      }
    }

    else if (option == 2){
      System.out.println("");
      for (int i = 0; i < WIDTH; ++i){
        numStar = i;
        System.out.println("");
        for (int k = 0; k < (WIDTH - numStar); ++k){
          System.out.print(" ");
        }
        for (int l = 0; l < numStar; ++l){
          System.out.print("*");
        }
      }
    }

    else if (option == 3){
      System.out.println("");
      for (int i = 0; i < WIDTH; ++i){
        numStar = WIDTH - i;
        System.out.println("");
        for (int k = 0; k < numStar; ++k){
          System.out.print("*");
        }
        for (int l = 0; l < (WIDTH - numStar); ++l){
          System.out.print(" ");
        }
      }
    }

    else if (option == 4){
      int halfDim = (WIDTH + 1)/2;

      for (int i = 0; i < halfDim; ++i){
            numStar = 2 * i + 1;
            numSpace = (WIDTH - numStar) / 2;

            System.out.println("");

            for (int k = 0; k < numSpace; ++k) {
                System.out.print(" ");
            }

            for (int k = 0; k < numStar; ++k) {
                System.out.print("*");
            }
        }

        for (int i = halfDim; i > 0; --i){
            numStar = 2*i + 1;
            numSpace = (WIDTH - numStar)/2;

            System.out.println("");

            for (int k = 0; k < numSpace; ++k){
                System.out.print(" ");
            }

            for (int k = 0; k<numStar; ++k) {
                System.out.print("*");
            }
      }
    }

  }
}

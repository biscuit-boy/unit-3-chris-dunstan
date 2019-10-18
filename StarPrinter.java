import java.util.Scaner;

public class StarPrinter{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int WIDTH = 20;

    int option = 0;

    boolean valid = false;
    while(!valid){
      System.out.println("");
      Sytem.out.pritnln("Give a number 1-5 to get your lucky symbol. ");
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
      catch(java.InputMismatchException e){
        System.out.println("");
        System.out.println("You must input a whole number between 1 and 6.");
      }
    }

    if (option == 1){
      System.out.println("");
      for (int i = 1; i < 20; ++i){
        System.out.println("");
        for (int k = 1; k < i)
      }
    }
  }
}

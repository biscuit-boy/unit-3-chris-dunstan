import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    DecimalFormat dFormat = new DecimalFormat("##.#");

    int games = 0;
    int won = 0;

    boolean valid = false;
    while (!valid){

      System.out.println("");
      System.out.println("How many games did you play? ");
      try{
        games = in.nextInt();

        System.out.println("");

        if (games < 0){
          System.out.println("You cannot have played negative games.");
        }
        else if (games < 1){
          System.out.println("You must play at least one game." );
        }
        else{
                  valid = true;
        }

      }
      catch (java.util.InputMismatchException e){
        System.out.println("");
        System.out.println("Games must be entered as a whole number.");
        in.nextLine();
      }
    }

    valid = false;
    while (!valid){

      System.out.println("");
      System.out.println("How many games did you win? ");
      try{
        won = in.nextInt();

        System.out.println("");

        if (won < 0){
          System.out.println("You cannot have won negative games.");
        }
        else if (won > games){
          System.out.println("You must play at least one game." );
        }
        else{
                  valid = true;
        }

      }
      catch (java.util.InputMismatchException e){
        System.out.println("");
        System.out.println("Games must be entered as a whole number.");
        in.nextLine();
      }
    }

    System.out.println("-----------------------");

    double wonPercent = 100.0 * (double) won / (double) games;

    System.out.println("");
    System.out.println("You won "+dFormat.format(wonPercent)+"% of your games.");


  }
}

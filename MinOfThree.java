import java.util.Scanner;

public class MinOfThree {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("");

    System.out.println("How many numbers do you have?");
    System.out.print("-> ");

    final int SAMPLE_SIZE = in.nextInt();

    System.out.println("");
    System.out.println("------------------------");
    System.out.println("");

    System.out.println("What are your "+SAMPLE_SIZE+" numbers?");
    System.out.println("");

    System.out.print("-> ");
    int min = in.nextInt();

    System.out.println("");

    int temp;

    for (int i = 0; i < (SAMPLE_SIZE - 1); ++i){
      System.out.print("-> ");
      temp = in.nextInt();

      if (temp < min){
        min = temp;
      }

      System.out.println("");

    }

    System.out.println("------------------------");
    System.out.println("The minimum value was: " + min);
  }
}

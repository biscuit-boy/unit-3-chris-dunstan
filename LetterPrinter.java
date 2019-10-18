import java.util.Scanner;

public class LetterPrinter{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("-> ");
    String word = in.nextLine();
    System.out.println("");

    for (int i = 0; i<word.length(); i++){
      System.out.println(word.charAt(i));
    }
  }
}

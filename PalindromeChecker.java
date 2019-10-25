import java.util.Scanner;

public class PalindromeChecker{

  public static String rawText(String text){
    text = text.toLowerCase();

    String newText = "";

    char a = 'a';
    char z = 'z';

    for(int i = 0; i < text.length(); i++){
      char let = text.charAt(i);

      if (let >= a && let <= z){
        newText += let;
      }
    }

    return newText;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Give a phrase you think is a palindrome! \n -> ");
    String text = in.nextLine();
    System.out.println("");

    text = rawText(text);

    boolean works = true;

    for (int i = 0; i < text.length() / 2; ++i){
      if (text.charAt(i) != text.charAt( text.length() - i - 1)){
        works = false;
      }
    }

    if (works){
      System.out.println("That's a palindrome!");
    }

    else{
      System.out.println("That's not a palindrome!");
    }
  }
}

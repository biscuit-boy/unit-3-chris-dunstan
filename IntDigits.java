import java.util.Scanner;

public class IntDigits{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("");
    System.out.print("What's your number? -> ");
    String num = in.nextLine();

    int odds = 0;
    int evens = 0;
    int zeros = 0;

    for (int i = 0; i < num.length(); ++i){
      if (num.charAt(i) == '0'){
        ++zeros;
      }
      else if (num.charAt(i) == '2' || num.charAt(i) == '4' || num.charAt(i) == '6' || num.charAt(i) == '8'){
        ++evens;
      }
      else if (num.charAt(i) == '1' || num.charAt(i) == '3' || num.charAt(i) == '7' || num.charAt(i) == '9'){
        ++odds;
      }
    }

    System.out.println("");
    System.out.println("Zero Digits: "+zeros);
    System.out.println("Even Digits: "+evens);
    System.out.println("Odd Digits:  "+odds);
  }
}

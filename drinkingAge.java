public class drinkingAge{
  public static void main(String[] args){
    Scanner in = new Scanner();

    System.out.print("What is your age in years ? ");
    int age = in.nextInt();

    if (age >= 21){
      System.out.println("You can drink!");
    }

    else {
      System.out.println("You can't drink for another "+(21-age)+" years!");
    }
  }
}

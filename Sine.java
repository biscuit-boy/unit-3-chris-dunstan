import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sine{
  public static void main(String[] args){
    final double pi = Math.PI;

    long delay = 9;

    double amp = 40.0;
    double period = 15;

    double row = 0;

    int stars = 0;

    while (true){
      stars = (int) ((Math.sin(row/period) + 1)*amp/2);
      System.out.println("");

      for (int i = 0; i<=stars; i++){
        System.out.print("*");
        }

      ++row;

      try{
        TimeUnit.MILLISECONDS.sleep(delay);
      }
      catch(InterruptedException e){
        continue;
      }

    }
  }
}

import static java.lang.System.*;
import java.util.Scanner;
import static java.lang.Math.*;
public class CS_Chapter2_Lab11
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(in);
		out.print("What is your favorite movie? :: ");
		String movie = keyboard.nextLine();
      
      System.out.println("I think " + movie + " is a terrible movie!");
      System.out.println("Just Kidding! I like " + movie + ", too.");
   }
}
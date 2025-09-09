import java.util.Scanner;

public class Year  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?: ");
     int year = sc.nextInt();

     if (year >= 18 && year < 65)
     {
         System.out.println("You are an adult");
     }
     else if (year > 65)
     {
         System.out.println("You are an elderly");
     }
     else  if (year < 18 )
     {
         System.out.println("You are an child");
     }

    }
}
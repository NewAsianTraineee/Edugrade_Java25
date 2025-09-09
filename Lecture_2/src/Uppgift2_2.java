import java.util.Scanner;

public class Uppgift2_2 {
    public static void main(String[] args)
    {
        /* Vi gör en lite mer "avancerad" verison av denna uppgift */
        Scanner sc = new Scanner(System.in); //Vi använder den istället för Console.Readline
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();

        if (number1 <=  number2)
        {
            System.out.println("Number 1 is less than Number 2!");
        }
        else if (number1 == number2)
            {
            System.out.println("Numbers are the same!");
            }
        else if (number1 >= number2)
        {
            System.out.println("Number 1 is greater than Number 2!");
        }
    }
        }
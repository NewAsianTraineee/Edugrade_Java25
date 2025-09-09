import java.util.Scanner;

public class Hypotenusan
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
     int a = sc.nextInt();
     System.out.println("Enter number B: ");
     int b = sc.nextInt();
     double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is: " + c);
    }
}
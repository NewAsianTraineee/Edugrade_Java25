import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int talet = 2;

        System.out.println(((Object) talet).getClass().getName());

        System.out.print("How old are you?:");
        int tal1 = sc.nextInt();


        if (tal1 < 18) {
            System.out.println("You are a minor");
        }
        else if(tal1 >= 18)
        {
            System.out.println("You are an adult");
            System.out.println(((Object) tal1) instanceof Integer);
        }
    }
    }


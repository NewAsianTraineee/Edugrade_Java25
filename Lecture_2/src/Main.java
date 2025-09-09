import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?:");
        int tal1 = sc.nextInt();


        if (tal1 < 18) {
            System.out.println("You are a minor");
        }
        else if(tal1 >= 18)
        {
            System.out.println("You are an adult");
        }
    }
    }
int age = 25;
double name = 19.99;
char gender = 'M';
String name = "Anna";
boolean isStudent = true;


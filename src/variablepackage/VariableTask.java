package variablepackage;
import java.util.Scanner;

public class VariableTask {
    public static void main(String[] args) {
       /* String firstName;
        String lastName;

        firstName = "Areeb";
        lastName = "Khan";

        String name = firstName + lastName;

        System.out.println(name);

        */

        /*int num1 = 3;
        int num2 = 4;
        System.out.println(num1+num2);

        float result = (float) num1/num2;
        System.out.println(result);

        int num3 = 8;

        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3); */

Scanner testScanner = new Scanner(System.in);
        System.out.println("Enter your first and surname");
String nameSurname = testScanner.nextLine();
System.out.println(nameSurname);

        System.out.println("Enter a number");
int num1 = testScanner.nextInt();
        System.out.println("enter another number");
int num2 = testScanner.nextInt();

System.out.println(num1+num2);

testScanner.close();
    }
}

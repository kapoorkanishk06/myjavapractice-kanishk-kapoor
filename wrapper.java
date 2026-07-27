import java.util.Scanner;

public class wrapper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first value:");
        int a = sc.nextInt();

        System.out.println("enter second value:");
        int b = sc.nextInt();

        // converting primitive values into wrapper objects
        Integer num1 = a;
        Integer num2 = b;

        // performing basic operations on wrapper values
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;

        System.out.println("sum: " + sum);
        System.out.println("difference: " + diff);
        System.out.println("multiplication: " + mul);

        // closing scanner
        sc.close();
    }
}
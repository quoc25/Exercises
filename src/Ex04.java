import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number one: ");
        int numberOne = sc.nextInt();
        System.out.print("Input number two: ");
        int numberTwo = sc.nextInt();

        if(numberOne>numberTwo) System.out.printf("%d > %d",numberOne,numberTwo);
        if(numberOne<numberTwo) System.out.printf("%d < %d",numberOne,numberTwo);
        if(numberOne==numberTwo) System.out.printf("%d = %d",numberOne,numberTwo);
    }
}

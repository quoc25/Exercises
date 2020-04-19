import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number one: ");
        int numberOne = sc.nextInt();
        System.out.print("Input number two: ");
        int numberTwo = sc.nextInt();

        System.out.printf("%d + %d = %d %n",numberOne,numberTwo,numberOne+numberTwo);
        System.out.printf("%d - %d = %d %n",numberOne,numberTwo,numberOne-numberTwo);
        System.out.printf("%d * %d = %d %n",numberOne,numberTwo,numberOne*numberTwo);
        if (numberTwo !=0 ) {
            double result =  numberOne / numberTwo ;
            System.out.print( numberOne+" / "+ numberTwo+ " = "+result);
        }else System.out.println("Number two phai khac 0!");
    }
}

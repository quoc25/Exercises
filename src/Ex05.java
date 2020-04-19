import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number one: ");
        int numberOne = sc.nextInt();
        System.out.print("Input number two: ");
        int numberTwo = sc.nextInt();
        System.out.print("Input number three: ");
        int numberThree = sc.nextInt();
        System.out.print("Input number four: ");
        int numberFour = sc.nextInt();

        int max = numberOne;
        if (max == numberTwo && max == numberThree && max == numberFour) System.out.println("khong co so lon nhat!");
        else {
            max = Math.max(max, numberTwo);
            max = Math.max(max, numberThree);
            max = Math.max(max, numberFour);
            System.out.println(max + " la so lon nhat! ");


        }
    }
}

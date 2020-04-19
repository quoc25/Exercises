import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = sc.nextInt();

        if(number>=0 && number%2==0) System.out.println(number+" la so chan duong");
        if(number>=0 && number%2==1) System.out.println(number+" la so le duong ");
        if(number<0 && number%2==0) System.out.println(number+" la so chan am");
        if(number<0 && number%2==1) System.out.println(number+" la so le am");

    }
}

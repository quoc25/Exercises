import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0 && b ==0) System.out.println("Phuong trinh co vo so nghiem");
        if (a == 0 && b != 0) System.out.println("Phuong trinh vo nghiem");
        if(a!=0 && b!=0 ) System.out.println("Phuong trinh co nghiem : "+ (-b/a) );
    }
}

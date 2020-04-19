import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double round = sc.nextInt();
        double pi = Math.PI;
        System.out.println("Chu vi hinh tron la: "+2*pi*round);
        System.out.println("Dien tich hinh tron la: "+pi*Math.pow(round,2));

    }
}

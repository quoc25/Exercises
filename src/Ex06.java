import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat: ");
        double side01 = sc.nextInt();
        System.out.print("Nhap canh thu hai: ");
        double side02 = sc.nextInt();
        System.out.println("Chu vi hinh chu nhat la: "+2*(side01+side02));
        System.out.println("Dien tich hinh chu nhat la: "+side01*side02);

    }
}

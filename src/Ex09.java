import java.util.Scanner;

public class Ex09 {
    // Giai va bien luan phuong trinh bac 2(a # 0)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so bac 2: ");
        double a = sc.nextDouble();
        System.out.println("Nhap he so bac 1: ");
        double b = sc.nextDouble();
        System.out.println("Nhap he so bac 0: ");
        double c = sc.nextDouble();

        double denta = Math.pow(b,2) -4*a*c;
        if(denta < 0 ) System.out.println("Phuong trinh vo nghiem");
        else if(denta == 0) System.out.println("Phuong trinh co nghiem kep "+(-b/(2*a)));
        else System.out.println("Phuong trinh co 2 nghiem phan biet "+ -b+(Math.sqrt(denta)/(2*a))
                    +" va "+ (-b -(Math.sqrt(denta))/(2*a)) );
        }
        }

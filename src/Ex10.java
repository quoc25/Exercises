import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so thu hai: ");
        double b = sc.nextDouble();
        System.out.println("Nhap so thu ba: ");
        double c = sc.nextDouble();

        if (a+b>c && a+c>b && b+c>a){
            System.out.println(a+" "+b+" "+ c +" "+"la mot tam giac!");
            if(a*a==(b*b+c*c)||b*b==(a*a+c*c)||c*c==(a*a+b*b)) System.out.println("Tam giac vuong");
            else if ( a == b && a==c && b==c) System.out.println("Tam giac deu");
            else if(a==b || a==c || b==c) System.out.println("Tam giac can");
            else if(a*a>(b*b+c*c)||b*b>(a*a+c*c)||c*c>(a*a+b*b)) System.out.println("Tam giac tu");
            else System.out.println("Tam giac nhon");
        }
        else System.out.println(a+" "+b+" "+ c +" "+" khong phai la ba canh cua tam giac");
    }
}

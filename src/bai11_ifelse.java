import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao tong 2 so");
//        double t = sc.nextDouble();
//        System.out.println("nhap vao hieu 2 so");
//        double h = sc.nextDouble();
//
//
//        double x=0,y=0;
//        x=t-y;
//        y=x-h;
//        x=t-(x-h);
//        x=(t+h)/2;
//        System.out.println("x= "+ (x));
//        System.out.println("y = " +(t-x));

        System.out.println("nhap vao nam ");
        long x = sc.nextLong();

        if ((x%4 ==0 && x %100!=0 ) || x%400==0){
            System.out.println("nam nhuan  ");
        }
        else {
            System.out.println("nam ko nhuan :");
        }

    }
}

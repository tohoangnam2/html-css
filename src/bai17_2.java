import java.util.Scanner;

public class bai17_2 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("nhap so A = ");
//        int a = sc.nextInt();
//        int x=0;
//            if(a%2==0) {
//                for (int i=0;i<=a;i++){
//
//                    x+=i;
//                    i++;
//                }
//                System.out.println("tong cac so chan la= "+x);
//            }
//            else {
//                System.out.println("bye");
//            }
     Scanner sc = new Scanner(System.in);
     int a;
     do {
         System.out.println("Nhap so chan A");
         a  =sc.nextInt();
     }while (a%2!=0);
     int t=0;
     for (int i=0;i<=a;i++){
         t+=i;
         i++;
     }
        System.out.println("tong A = " + t);

    }
}

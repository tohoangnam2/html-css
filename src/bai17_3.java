import java.util.Scanner;

public class bai17_3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a;
     do {
         System.out.println("Nhap so le A");
         a  =sc.nextInt();
     }while (a%2==0);
     int t=0;
     for (int i=0;i<=a;i++){
        t+=i;
        i++;
        if (i==3)
            continue;

     }
        System.out.println("tong A = " + t);

    }
}

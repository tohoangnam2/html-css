import java.util.Scanner;

public class bai17_btap {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao n va in ra ket qua n!

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n");
        int n = sc.nextInt();

        //dung vong for

//        int x=1;
//        for(int i=n;i<=n;i--){
//            if (i==1)
//                break;
//            x*=i;
//        }
//        System.out.println("n! =" + x);

        //dung while
        int i=1;
        while (i<n){
            i++;
            i*=n;

        }
        System.out.println("n!=" + i);



    }
}

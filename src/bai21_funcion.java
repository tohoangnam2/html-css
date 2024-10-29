import java.util.Scanner;

public class bai21_funcion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao a = ");
        double a =sc.nextDouble();
        System.out.println("nhap vao b = ");
        double b =sc.nextDouble();
        System.out.println("nhap vao phep tinh (+ , - ,* , /) ");
        Scanner s =new Scanner(System.in);
        String c = s.nextLine();
        phepTinh(a,b,c);
    }
    public static void phepTinh(double a,double b, String c){
        if (c.equals("+")){
            System.out.println("ket qua la = "+ (a+b));
        } else if (c.equals("-")) {
            System.out.println("ket qua la = "+ (a-b));
        } else if (c.equals("*") ){
            System.out.println("ket qua la = " + (a * b));
        }
        else{
            if (c.equals("/")&&b==0){
                System.out.println(" 0 khong chia duoc ma oi");
            } else if (c.equals("/")&&b!=0) {
                System.out.println("ket qua la = "+ (a/b));
            }

        }

    }
}

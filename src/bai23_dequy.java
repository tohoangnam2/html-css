import java.util.Scanner;

public class bai23_dequy {

    //tim UCLN cuar 2 so
    public static int gcd(int a , int b){
        while (b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    //tim BCNN
    public static int lcm(int a,int b){
        return a*b/ gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(gcd(20,6)+lcm(20,6));
    }
}

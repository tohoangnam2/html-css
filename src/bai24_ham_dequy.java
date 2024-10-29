import java.util.Scanner;

public class bai24_ham_dequy {
    //tìm số lượng ước là 1 số nguyên tô
    public static int uocNguyenTo(int n ) {
        int ans=0;
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            ++ans;
            while (n % i == 0) {
                n/=i;
            }

        }
        if(n>1) ++ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(uocNguyenTo(60));
    }
}

import java.util.Scanner;

public class bai25_mang1chieu {

    public static boolean kt(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        int dem=0;
        int t=0;
        for (int i = 0; i < n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (kt(a[i])){
                t+=a[i];
                dem++;
            }
        }
        System.out.println((double) t/dem);

    }
}

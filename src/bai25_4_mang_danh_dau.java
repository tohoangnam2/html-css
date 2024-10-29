import java.util.Scanner;

public class bai25_4_mang_danh_dau {
    public static void main(String[] args) {

        //hay liet ke tat ca cac giai tri xuat hien trong mang theo thu tu tu be > lon va tan xuat xuat hien

        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[100001];
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cnt[ a[i]]++;
        }
        int dem=0;
        for (int i = 0; i <= 1000; i++) {
            if(cnt[i] != 0 ){
                System.out.println(i+ " "+cnt[i]);
            }
        }


    }
}
import java.util.Scanner;

public class bai25_1 {
    public static void main(String[] args) {

        //đếm xem trong mảng có bao nhiêu cặp phần tử có tổng bằng n
        //input: n=10
        // 1 5 4 5 9
        //out:2

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        int dem=0;
        int k=10;
        for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if (a[i]+a[j]==k){
                    ++dem;
                }
            }

        }
        System.out.println(dem);
    }
}

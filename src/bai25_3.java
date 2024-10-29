import java.util.Scanner;

public class bai25_3 {
    public static void main(String[] args) {

// input : 4
//        1 2 2 3
//        output: 1 1
//                2 2
//                3 1

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (a[i]==a[j]){
                    check = true;
                    break;
                }
            }

            if (check==false) {
                int dem=1;
                for (int j = i+1; j <n ; j++) {
                    if (a[i]==a[j])
                        dem++;
                }
                System.out.println(a[i]+" "+ dem);

            }
        }
    }
}
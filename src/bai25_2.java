import java.util.Scanner;

public class bai25_2 {
    public static void main(String[] args) {

        //kiểm tra 1 mảng input : 1 2 3 2 5 6 4 2
        //output: 1 2 3 5 6
        //va dem xem trong mang co bao nhieu gia tri khac nhau

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        int dem=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            //neu a[i] la gia tri dau tien thi in ra
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (a[i]==a[j]){
                    check = true;
                    break;
                }
            }
            if (check==false) {
                dem++;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println(dem);

    }
}
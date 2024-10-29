import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bai26_sapxep {
    public static int tong(int n){
        int ans=0;
        while (n!=0){
            ans +=n%10;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[100001];
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //sap xep theo thu tu tang dan:
        Arrays.sort(a);//O(logN) :10^7
//        Arrays.sort(a,2,5);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }



//        sap xep theo tu tu giam dan  -> chuyen sang kieu du lieu doi tuong
//        vd :int ->Integer


         Integer[] b = {1, 4, 2, 5, 7 ,6 ,3};
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //tra ve -1 1
                //nếu 01 xuất hiện trước 02 thfi trả về -1 ngược lại
                if (tong(o1)<tong(o2)) {
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
        }


    }
}
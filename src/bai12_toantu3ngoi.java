import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem trung binh");
        double dtb = sc.nextDouble();
        String x= (dtb>=8)?"gioi":(dtb>=5&&dtb<8)?"kha": "yeu";
        System.out.println(x);
    }
}

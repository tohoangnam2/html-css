import java.util.Calendar;
import java.util.Scanner;

public class bai22_password {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int demChu=0;
        int demSo=0;
        int check=0;
        do {
            System.out.println("Moi ban nhap mat khau : ");
            String pass= sc.nextLine();
            for (int i=0;i<pass.length();i++) {
                char c = pass.charAt(i);
                if (Character.isLetter(i)){
                    demChu++;
                } else if (Character.isDigit(i)) {
                    demSo++;
                }
            }
            if (pass.length()<6&&demChu<1&&demSo<1){
                System.out.println("nhap lai mat khau : ");
                demSo=0;
                demChu=0;
                check++;
            }
            else
                break;
        }while (check<5);
        System.out.println("ban da nhap mat khau chinh xac");

    }
}

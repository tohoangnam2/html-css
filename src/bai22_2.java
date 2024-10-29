import java.util.Scanner;

public class bai22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi : ");
        String s = sc.nextLine();
        int demSo=0;
        int demSpace=0;
        int demChuT=0;
        int demChuH=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLowerCase(c)){
                demChuT++;
            } else if (Character.isUpperCase(c)) {
                demChuH++;
            }else if (Character.isSpaceChar(c)) {
                demSpace++;
            }else if (Character.isDigit(c)){
                demSo++;
            }
        }
        System.out.println("chu" +demChuT + " hoa " + demChuH + "so "+ demSo + " khoang trang" + demSpace);

    }
}

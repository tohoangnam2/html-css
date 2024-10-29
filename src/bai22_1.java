import java.util.Calendar;
import java.util.Scanner;

public class bai22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day,month,year;
        try {
            System.out.println("nhap ngay sinh : ");
            day =sc.nextInt();
            System.out.println("nhap thang sinh : ");
            month =sc.nextInt();
            System.out.println("nhap nam sinh : ");
            year =sc.nextInt();
        } catch (Exception e) {
            System.out.println("nhap lai ngay thang nam sinh ");
            throw new RuntimeException(e);

        }


        Calendar birthday = Calendar.getInstance();
        birthday.set(year,month-1,day);

        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngay thang nam sinh la " + namSinh + " " + (thangSinh+1 )+ " "+ngaySinh);

        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);

        System.out.println("ban nam nay " + (namHienTai-namSinh));

    }
}

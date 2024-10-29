import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngay+" " + (thang +1) +" " + nam);

        // set ngay thang nam theo y muon
        cal.set(Calendar.YEAR,2003);
        cal.set(Calendar.MONTH,04);
        cal.set(Calendar.DAY_OF_MONTH,05);
        int nams = cal.get(Calendar.YEAR);
        int thangs = cal.get(Calendar.MONTH);
        int ngays = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngays+" " + (thangs +1) +" " + nams);

        //xuat theo dinh dang

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d =cal.getTime();
        String s = form.format(d);
        System.out.println(s);
    }
}

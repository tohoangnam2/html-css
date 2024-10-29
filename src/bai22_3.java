public class bai22_3 {
    public static void main(String[] args) {
        String strl ="English = 78 Science = 83 Math = 68 History = 65";
        System.out.println(strl.length());
        String s1 = strl.substring(10,12);
        String s2 = strl.substring(23,25);
        String s3 = strl.substring(33,35);
        String s4 = strl.substring(46,48);

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(" tong = "+(a+b+c+d ));
        System.out.println("trung binh cong = " + (a+b+c+d)/4);
    }
}

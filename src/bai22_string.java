public class bai22_string {
    public static void main(String[] args) {
        String s = "mot hai ba" +
                "\n nam sau";
        System.out.println(s);

        StringBuilder sb= new StringBuilder();
        //them vao cuoi chuoi
        sb.append("xin chao");
        sb.append(", cac ban");
        System.out.println(sb);

        //chèn vao chuoi :vi tri- gia tri can chen
        sb.insert(0,3);
        System.out.println(sb);

        //xoá tất cả các vị trí từ start - end-1
        sb.delete(0,5);
        System.out.println(sb);

        System.out.println(sb.length()); // dem tu 1

        // 7.kiem tra vi tri xuat hien dau tien trong chuoi
        String s7 ="toi di tim toi";
        System.out.println(s7.indexOf("di"));//output :4

        //8.kiem tra chuoi con

        String s9=".mp3";
        String s10 = "tuhoc.mp3";
        boolean check  = s10.contains(s9);
        if (check)
            System.out.println("co");
        else
            System.out.println("ko");

        //cat chuoi con

        String s11 = "012345";
        String s12 = s11.substring(2);
        System.out.println(s12);
        String s13 =s11.substring(2,5);//den end-1
        System.out.println(s13);

        //thay the chuoi
        String s14= "toi di tim toi";
        String s15 = s14.replace("toi","ban");

        System.out.println(s14);
        System.out.println(s15);

        String s16 = s14.replaceFirst("toi ", "ban");
        System.out.println(s16);

        // xoa toan bo khoang trang o dau va cuoi
        String s18 = "   ga lai lap trinh     ";
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);

        //xoa khoang trang o cuoi chuoi
        String s21 = "   ga lai lap trinh     ";
        while (s21.endsWith(" ")){
            s21=s21.substring(0,s21.length()-1);
        }
        System.out.println(s21);

        //xoa khoangn trang o cuoi chuoi
        String s25 = "   ga lai lap trinh     ";
        while (s25.startsWith(" ")){
            s25 = s25.substring(1);
        }
        System.out.println(s25);

        //so sanh 2 chuoi

        String s26 = "abc1";
        String s27 ="Abc1";

        int x = s26.compareToIgnoreCase(s27);
        System.out.println(x);


        //spit tach chuoi

        String s38= "Hello,world";
        String[] mang = s38.split(",");

        for (int i=0;i< mang.length;i++){
            System.out.println(mang[i]);
        }

        //chu hoa chu thuong

        String s39 = s38.toUpperCase();

        //tach chuoi thanh tung ki tu

        String s42 ="abcadas123@";
        char[] mang2 = s42.toCharArray();

        for (int i=0;i< mang2.length;i++){
            System.out.println(mang2[i]);
        }

        //dao nguoc chuoi revese
        String s43 ="avcad123";
        StringBuilder sb1= new StringBuilder(s43);
        sb1.reverse();

        System.out.println(sb1);
        //neu khong dung duoc thi dung String builder









    }


}

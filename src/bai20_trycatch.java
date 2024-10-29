public class bai20_trycatch {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {
            int c=a/b;
            System.out.println("c =" + c);
        } catch (Exception ex) {
            System.out.println("co loi roi");
            ex.printStackTrace();
        }
        finally {
            System.out.println("co loi hay khong thi van thuc hien cai nay");
        }


        System.out.println("code phia sau");
    }
}

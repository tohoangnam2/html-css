public class bai15_dowhile {
    public static void main(String[] args) {
        int a=1;
        int t=0;
        do{
            t+=a;
            a++;
        }while (a<=5);
        System.out.println("ket qua la :" +t);
    }
}

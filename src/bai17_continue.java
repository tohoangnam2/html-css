public class bai17_continue {
    public static void main(String[] args) {
        //tinh tong 1-5 nhung bo qua so 3
        int t=0;
        for (int i=1;i<=5;i++){
            if(i==3)
                continue;
            else
                t+=i;
        }
        System.out.println(t);


    }
}

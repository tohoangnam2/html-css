import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soChuSo = 0;
        int soKyTu = 0;
        int soLanKiemTra = 0;
        do{
            System.out.println("nhap mat khau: ");
            String input = sc.nextLine();
            char[] arrChar = input.toCharArray();
            for (int i = 0; i < arrChar.length; i++){
                if(Character.isDigit(arrChar[i])){
                    soKyTu += 1;
                } else if (Character.isLetter(arrChar[i])) {
                    soChuSo += 1;
                }
            }
            if(arrChar.length < 6 || soKyTu < 1 || soChuSo < 1){
                System.out.println("mat khau khong thoa man");
                soKyTu = 0;
                soChuSo = 0;
                soLanKiemTra += 1;
            }else {
                break;
            }
        }
        while (soLanKiemTra<5);
    }
}
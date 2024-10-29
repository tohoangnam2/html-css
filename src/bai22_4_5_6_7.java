public class bai22_4_5_6_7 {
    public static void main(String[] args) {
        String input = " ga lai   lap   Trinh  ";
        System.out.println(chuanHoa(input));

    }

    public static String chuanHoa(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstW = words[i].substring(0,1);
            firstW = words[i].toUpperCase();
            words[i] = firstW + words[i].substring(1);


        }
        return String.join(" ",words);


}}
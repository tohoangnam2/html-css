public class a {
    public static void main(String[] args) {
        int height = 5; // Chiều cao của tam giác

        for (int i = 1; i <= height; i++) {
            // In khoảng trắng ở đầu mỗi hàng để tạo hình tam giác
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            // In dấu sao
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

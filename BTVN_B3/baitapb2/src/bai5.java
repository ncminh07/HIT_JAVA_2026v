import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String hoTen = scanner.nextLine();
        String[] tuList =  hoTen.trim().split("\\s+"); // tách theo 1 hoặc nhiều khoảng trắng
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tuList.length; i++) {
            String tu = tuList[i].toLowerCase();
            if (tu.length() > 0) {
                String tuHoaChuDau = Character.toUpperCase(tu.charAt(0)) + tu.substring(1);
                sb.append(tuHoaChuDau);
                if (i < tuList.length - 1) {
                    sb.append(" ");
                }
            }
        }

    }
}

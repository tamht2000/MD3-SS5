package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String st = new Scanner(System.in).nextLine();

        // kiểm tra xem người dùng nhập vào là chuỗi rỗng hay k
        if(st.isEmpty()) {
            System.out.println("chuỗi rỗng");
        } else {
            System.out.println("không rỗng");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng: 3 cách
//        String fullName = "Tam Do";
//        StringBuilder string = new StringBuilder(fullName);
//        System.out.println(string);

        // các phương thức đặc biệt
        // 1. chèn append()
//        string.append(". Tuổi - 24");
//        string.append("34534");
//        System.out.println(string);

        // 2. chèn vào vị trí bất kì
//        string.insert(0,"hello ");
//        System.out.println(string);

        // 3. xoá chuỗi con
//        string.delete(0, 5);
//        string.deleteCharAt(7);
//        System.out.println(string);

        // 4. Đảo ngược chuỗi
//        string.reverse();
//        System.out.println(string);

        // 5. Thay thế
//        string.replace(0, 5, "hi");
//        System.out.println(string);


        // ví dụ áp dụng
        // cho phép người dùng nhập vào 1 chuỗi, tim kiếm ra chuỗi con có độ dài lớn nhất mà sắp xếp các kí tự tăng dần
        // input: abcdbzjy;
        // output: abcd;
        StringBuilder input = new StringBuilder(new Scanner(System.in).nextLine()) ;
        // B1: duyệt qua lần lượt các ký tự của chuỗi và tìm ra tất cả các chuỗi tăng dần
        // B2: tim trong danh sách các chuỗi đấy chuỗi nào có độ dài lớn nhất
        String arr = "";
        for (int i = 0; i < input.length(); i++) {
            StringBuilder subString = new StringBuilder();
            subString.append(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if(input.charAt(j - 1) < input.charAt(j)){
                    subString.append(input.charAt(j));

                } else {
                    i=j;
                    break;
                }
            }
            System.out.println(subString);
            if(arr.isEmpty()) {
                arr+= subString;
            } else {
                arr = arr + "," + subString;
            }

        }

        // chuyển đổi thành mảng
        String[] arrSubString = arr.split(",");
        System.out.println(Arrays.toString(arrSubString));

        int idMax = 0;
        for (int i = 1 ; i < arrSubString.length; i++) {
            if(arrSubString[i].length() > arrSubString[idMax].length()) {
                idMax = i;
            }
        }

        // hiển thị kết quả
        System.out.println(" Chuỗi con dài nhất là: " + arrSubString[idMax]);
    }
}

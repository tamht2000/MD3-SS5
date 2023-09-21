import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String fullName = "Hùng";
        System.out.println(fullName);
        fullName = "Tâm To";
        System.out.println(fullName);
        // so sánh 2 chuỗi
        System.out.println(fullName.equalsIgnoreCase("tâm to"));

        // Tìm kiếm chuỗi con trong chuỗi cha
        System.out.println(fullName.contains("âm"));

        // chuỗi bắt đầu và kết thúc
        System.out.println(fullName.startsWith("T"));
        System.out.println(fullName.endsWith("O"));

        // Kiểm tra 1 chuỗi có rỗng không
        String st = "";
        System.out.println(st.isEmpty());

        // Lấy vị trí của kí tự đầu tiên tìm được
        System.out.println(fullName.indexOf("o"));

        // Tìm kiếm và thay thế chuỗi
        String content = "String là một kiểu dữ liệu tham chiếu. Trong ví dụ trên, message là một biến tham\n" +
                "chiếu, tham chiếu tới một đối tượng chuỗi có giá trị là Welcome to Java.";
        String rs = content.replace("là", "");
        System.out.println(rs);

        // Nối chuỗi
        String newName = fullName.concat("Nam Anh");
        System.out.println(newName);

        // chuyển 1 chuỗi thành 1 mảng
        String numbers = "1,2,3,4,5,6,7,8,9";
        String arr[] = numbers.split(",");
        System.out.println(Arrays.toString(arr));

        // chuyển 1 mảng thành chuỗi
        System.out.println();


        // In hoa in thường, xoá khoảng trắng 2 đầu
        String demo = "         hello         ";
        System.out.println(demo.trim());


        // Bởi vì là 1 mảng kí tự nên có thể duyệt chuỗi
        for (int i = 0; i < demo.length(); i++) {
            System.out.println(demo.charAt(i));
        }
//        for (String ch: demo.split("")) {
//            System.out.println(ch);
//        }

        System.out.println("a".compareTo("A"));

        // Cắt chuỗi
        System.out.println(content.substring(10, 30));
    }
}
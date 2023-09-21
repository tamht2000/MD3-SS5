import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(validateUsername("Tamht2000"));
    }
    // yêu cầu nâng cao :
    // tạo lớp Validation kiểm tra sự chính xác của các dữ liệu sau :
    // email : gmail.com
    // số điện thoai : vietnam
    // mật khẩu : bảo mật cao
    // ngày tháng năm : dd/MM/yyyy
    // validate chuỗi nhập vào có phải
    // là số không  "217864" : bắt người dùng nhập đến khi nhập đúng số
    // thị mới hiển thị, nếu ko là số thì nhâp lại ;
    public static boolean validateUsername(String username) {
        // yêu cầu: 8-12 kí tự, k kí tự đặc biệt, k khoảng trắng, bắt đầu bằng chữ in hoa
        // cách 1:
//        String pattern = "^[A-Z][(a-zA-Z0-9)&&\\S]{7,11}$";
//        Pattern patt = Pattern.compile(pattern);
//        Matcher math = patt.matcher(username);
//        return math.matches();

        // cách 2:
//        return Pattern.matches("^[A-Z][(a-zA-Z0-9)&&\\S]{7,11}$", username);

        // cách 3:
        return username.matches("^[A-Z][(a-zA-Z0-9)&&\\S]{7,11}$");
    }
}

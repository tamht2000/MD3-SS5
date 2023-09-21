import java.util.regex.*;
import java.util.Scanner;

public class Validation {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String PHONE_REGEX = "^(0[0-9]{9}|84[0-9]{9}|\\\\+848[0-9]{8}|\\\\+849[0-9]{8}|0[1-9][0-9]{8}|84[1-9][0-9]{8}|\\\\+848[1-9][0-9]{7}|\\\\+849[1-9][0-9]{7})$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final String DATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
    private static final String NUMBER_REGEX = "^[0-9]{6}+$";

    public static boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email) && email.endsWith("gmail.com");
    }

    public static boolean isValidPhone(String phone) {
        return Pattern.matches(PHONE_REGEX, phone); //&& phone.toLowerCase().contains("vietnam");
    }

    public static boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static boolean isValidDate(String date) {
        return Pattern.matches(DATE_REGEX, date);
    }

    public static String getValidNumberInput(Scanner scanner) {
        String input;
        do {
            System.out.print("Nhập mã xác nhận (217864): ");
            input = scanner.nextLine();
            if(Pattern.matches(NUMBER_REGEX, input) && input.equals("217864")) {
                System.out.println("Mã chính xác.");
                break;
            } else {
                System.out.println("Mã sai, vui lòng nhập lại.");
            }
        } while (!Pattern.matches(NUMBER_REGEX, input) || !input.equals("217864"));
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kiểm tra email
        String email;
        do {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isValidEmail(email));

        System.out.println("Email hợp lệ.");

        // Kiểm tra số điện thoại
        String phone;
        do {
            System.out.print("Nhập số điện thoại: ");
            phone = scanner.nextLine();
            if (!isValidPhone(phone)) {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isValidPhone(phone));

        System.out.println("Số điện thoại hợp lệ.");

        // Kiểm tra mật khẩu
        String password;
        do {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();
            if (!isValidPassword(password)) {
                System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isValidPassword(password));

        System.out.println("Mật khẩu hợp lệ.");

        // Kiểm tra ngày tháng năm
        String date;
        do {
            System.out.print("Nhập ngày tháng năm (dd/MM/yyyy): ");
            date = scanner.nextLine();
            if (!isValidDate(date)) {
                System.out.println("Ngày tháng năm không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!isValidDate(date));

        System.out.println("Ngày tháng năm hợp lệ.");

        // Nhập số đến khi đúng
        String validNumber = getValidNumberInput(scanner);
        System.out.println("Số bạn đã nhập: " + validNumber);

        System.out.println("\u001B[35mValidate thành công ❤❤❤");
        scanner.close();
    }
}

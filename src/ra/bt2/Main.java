package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String st1 = new Scanner(System.in).nextLine();
        String st2 = new Scanner(System.in).nextLine();

        if(st1.equalsIgnoreCase(st2)) {
            System.out.println("giống nhau");
        } else {
            System.out.println("khác nhau");
        }
    }
}

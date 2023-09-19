package ra.TH3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
     try {
        URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//            open the stream and put it into BufferedReader
        Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
        sc.useDelimiter("\\Z");
        String content = sc.next();
//            close scanner
        sc.close();
//            remove all new line
        content = content.replaceAll("\n+", "");
//            đổi pattern mới vì pattern cũ đã không còn sử dụng được
//            regex
        Pattern p = Pattern.compile(";\\\"(.*)<\\/a>");
        Matcher m = p.matcher(content);
        while (m.find()){
            System.out.println(m.group(1));
        }

    } catch (
    MalformedURLException e){
        e.printStackTrace();
    } catch (
    UnsupportedEncodingException e){
        e.printStackTrace();
    } catch (
    IOException e){
        e.printStackTrace();
    }
}
}

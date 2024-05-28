package Boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2_1 {
    public static void boj2_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();

        String[] s = a.split(" ");
        if(Integer.valueOf(s[0]) > Integer.valueOf(s[1])) {
            System.out.println(">");
        } else if (Integer.valueOf(s[0]) < Integer.valueOf(s[1])) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

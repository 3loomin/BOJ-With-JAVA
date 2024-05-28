package Boj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1_4 {
    public static void boj1_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();

        String[] s = a.split(" ");
        System.out.println(Integer.valueOf(s[0]) * Integer.valueOf(s[1]));
    }
}

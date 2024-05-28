package Boj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1_11 {
    public static void boj1_11() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();

        String[] s = a.split(" ");
        System.out.println(Long.valueOf(s[0]) + Long.valueOf(s[1]) + Long.valueOf(s[2]));
    }
}

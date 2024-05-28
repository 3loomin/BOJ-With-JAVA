package Boj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1_8 {
    public static void boj1_8() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();

        System.out.println(Integer.valueOf(a) - 543);
    }
}

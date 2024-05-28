package Boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3_2 {
    public static void boj3_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        Integer i = Integer.valueOf(a);

        for (int j = 0; j < i; j++) {
            String b = br.readLine();
            String[] s = b.split(" ");
            System.out.println((Integer.valueOf(s[0])+Integer.valueOf(s[1])));
        }

    }
}

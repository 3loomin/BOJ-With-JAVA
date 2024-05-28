package Boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3_1 {
    public static void boj3_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        Integer i = Integer.valueOf(a);

        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " * " + j + " = " + (i*j));
        }

    }
}

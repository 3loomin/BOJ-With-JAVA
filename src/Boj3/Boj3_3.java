package Boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3_3 {
    public static void boj3_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        Integer i = Integer.valueOf(a);
        int sum = 0;

        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        System.out.println(sum);

    }
}

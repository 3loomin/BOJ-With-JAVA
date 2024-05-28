package Boj11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11_6 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long ans = 0;
        for (int i = a -2 ; i >= 1 ; i--) {
            ans += S(i);
        }
        System.out.println(ans);
        System.out.println(3);

    }

    private static long S(int i) {
        return ((long)Math.pow(i, 2) + i ) / 2;
    }
}

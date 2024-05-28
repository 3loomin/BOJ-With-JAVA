package Boj11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long count = 0;
        for (int i = 1; i < a; i++) {
            count += i;
        }
        System.out.println(count);
        System.out.println(2);

    }
}

package Boj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1_10 {
    public static void boj1_10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        br.close();

        int i = Integer.valueOf(a);
        int j = Integer.valueOf(b);

        int one = j % 10;
        int two = (j / 10) % 10;
        int three = j / 100;

        System.out.println(one * i);
        System.out.println(two * i);
        System.out.println(three * i);
        System.out.println((three * i) * 100 + (two * i) * 10 + (one * i) );

    }
}

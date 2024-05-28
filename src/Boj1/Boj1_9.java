package Boj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1_9 {
    public static void boj1_9() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        String[] s1 = s.split(" ");
        Integer a = Integer.valueOf(s1[0]);
        Integer b = Integer.valueOf(s1[1]);
        Integer c = Integer.valueOf(s1[2]);

        System.out.println((a + b) % c);
        System.out.println( ((a % c) + (b % c)) % c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
    }
}

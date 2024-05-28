package Boj5;

import java.io.*;

public class Boj5_9 {
    public static void boj5_9() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] split = s.split(" ");
        Integer i = Integer.valueOf(split[0]);
        Integer j = Integer.valueOf(split[1]);

        if (reverse(i) > reverse(j)) {
            System.out.println(reverse(i));
        } else {
            System.out.println(reverse(j));
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static int reverse(Integer a){
        int first = a / 100;
        int second = (a / 10) % 10;
        int third = a % 10;

        return third * 100 + second * 10 + first;
    }
}

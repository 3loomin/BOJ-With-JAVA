package Boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2_3 {
    public static void boj2_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        Integer i = Integer.valueOf(a);

        if( (i % 4 == 0) && (i % 100 != 0) || (i % 100 == 0) && ( i % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

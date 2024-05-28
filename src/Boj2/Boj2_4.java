package Boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2_4 {
    public static void boj2_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        br.close();
        Integer i = Integer.valueOf(a);
        Integer j = Integer.valueOf(b);

        if(i > 0){
            if (j > 0){
                System.out.println(1);
            }
            else System.out.println(4);
        } else {
            if (j > 0){
                System.out.println(2);
            }
            else System.out.println(3);
        }
    }
}

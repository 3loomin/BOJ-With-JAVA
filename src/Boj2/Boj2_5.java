package Boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2_5 {
    public static void boj2_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        String[] s = a.split(" ");

        int hour = Integer.valueOf(s[0]);
        int min = Integer.valueOf(s[1]);

        if(min >= 45) {
            System.out.println(hour + " " + (min - 45));
        }
        else {
            if(hour == 0){
                System.out.println(23 + " " + (60 - (45 - min )));
            }
            else {
                System.out.println(hour - 1 + " " + (60 - (45 - min )));
            }
        }
    }
}

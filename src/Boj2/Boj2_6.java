package Boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2_6 {
    public static void boj2_6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        br.close();
        String[] s = a.split(" ");

        int hour = Integer.valueOf(s[0]);
        int min = Integer.valueOf(s[1]);
        int time = Integer.valueOf(b);

        if(min + time >= 60){
            int i = (min + time) / 60;
            int j = (min + time) % 60;
            hour += i;
            min = j;
            if(hour >= 24){
                hour %= 24;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min + time));
        }
    }
}

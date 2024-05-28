package Boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3_4 {
    public static void boj3_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String total = br.readLine();
        String num  = br.readLine();
        int sum = 0;
        for (int i = 0; i < Integer.valueOf(num); i++) {
            String set = br.readLine();
            String[] s = set.split(" ");
            sum += Integer.valueOf(s[0]) * Integer.valueOf(s[1]);
        }
        if(Integer.valueOf(total).equals(sum)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        br.close();
    }
}

package Boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3_5 {
    public static void boj3_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bytes = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();


        Integer i = Integer.valueOf(bytes);
        int a = i/4;
        int b = i%4;
        for (int j = 1; j < a ; j++) {
            sb.append("long ");
        }

        sb.append("long int");
        System.out.println(sb);
    }
}

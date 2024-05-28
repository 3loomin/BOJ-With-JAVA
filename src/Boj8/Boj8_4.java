package Boj8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8_4 {
    public static void boj8_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n  = Integer.parseInt(br.readLine());
        //An = (A(n-1) + A(n-1)-1)^2
        int[] answer = new int[16];
        answer[0] = 2;
        for (int i = 1; i <= 15 ; i++) answer[i] = answer[i-1] * 2 - 1 ;
        System.out.println(answer[n] * answer[n]);
    }
}

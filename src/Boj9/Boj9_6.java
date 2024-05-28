package Boj9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9_6 {
    public static void boj9_6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = a;
        while(a != 1){
            for (int i = 2; i <= b ; i++) {
                if(a % i == 0){
                    System.out.println(i);
                    a /= i;
                    break;
                }
            }
        }
    }
}

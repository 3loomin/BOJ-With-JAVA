package Boj9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj9_2 {
    public static void boj9_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList answer = new ArrayList();

        for (int i = 1; i <= a; i++) {
            if(a % i == 0) answer.add(i);
        }
        if(b > answer.size()) System.out.println(0);
        else System.out.println(answer.get(b - 1));
    }
}

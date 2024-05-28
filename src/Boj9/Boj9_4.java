package Boj9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj9_4 {
    public static void boj9_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(st.nextToken());
            count += isPrime(a);
        }
        System.out.println(count);

    }
    private static int isPrime(int a) {
        int result = 0;
        ArrayList<Integer> factor = new ArrayList<>();
        for (int i = 1; i <= a ; i++) {
            if(a % i == 0) factor.add(i);
        }
        if(factor.size() == 2 && factor.get(factor.size() - 1) == a) result = 1;
        return result;

    }
}

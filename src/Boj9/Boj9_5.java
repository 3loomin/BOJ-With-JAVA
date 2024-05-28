package Boj9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj9_5 {
    public static void boj9_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;
        int least = 0;
        for (int i = b; i >= a; i--) {
            if (isPrime(i) == 1){
                sum += i;
                least = i;
            }
        }

        if (sum == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(least);
        }
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

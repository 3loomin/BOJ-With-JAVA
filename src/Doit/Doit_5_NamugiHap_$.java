package Doit;

import java.io.*;
import java.util.StringTokenizer;

public class Doit_5_NamugiHap_$ {
    public static void solution() throws IOException {
        /*
            Boj_10986_g3
            n개의 수 a[n]이 주어졌을 때 연속된 부분의 합이 m으로 나누어 떨어지는 구간의 개수를 구하라

            핵심 : (a + b) % c = ((a % c) + (b % c)) % c를 이용
            ex)   (8 + 3) % 5 = (3 + 3) % 5 = 11 % 5 = 1
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 문자열 길이 N , 연산 대상 M 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 입력 받는 배열, 합배열 , 합배열 mod 한 배열, m 크기(나머지이기 때문에) 를 가진 나머지 수를 세기 위한 배열;
        // 입력되는 원소가 10의 9 승까지다 10억. int가 아닌 long으로.
        long[] S = new long[n + 1];
        long[] modS = new long[n + 1];
        long[] counter = new long[m];

        st = new StringTokenizer(br.readLine());
        // 포문 돌리면서 a와 s 와 modS 구성
        for(int i = 1 ; i <= n ; i++) {
            int a = Integer.parseInt(st.nextToken());
            S[i] = S[i - 1] + a;
            modS[i] = S[i] % m;
            counter[(int) modS[i]]++;
        }
        // modS의 0 값이 있다면 걔는 일단 경우의 수에 포함.
        // 그리고 modS의 원소의 값이 같다면 걔네들의 조합 수를 경우의 수에 더해주면 됌

        long res = counter[0];
        for(int i = 0 ; i < m ; i++) {
            res += nC2(counter[i]);
        }
        bw.write(res + "\n");
        bw.flush();
        bw.close();
    }
    public static long nC2( long n ){
        if(n < 2) return 0;
        else return n * (n - 1) / 2 ;
    }
}

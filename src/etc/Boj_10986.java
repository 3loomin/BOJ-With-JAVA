package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_10986 {
    public static void solution() throws IOException {
        /*
            Boj_10986_g3
            n개의 수 a[n]이 주어졌을 때 연속된 부분의 합이 m으로 나누어 떨어지는 구간의 개수를 구하라

            핵심 : (a + b) % c = ((a % c) + (b % c)) % c를 이용
            ex)   (8 + 3) % 5 = (3 + 3) % 5 = 11 % 5 = 1
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //n,m 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 배열을 받아 구간합 배열 구성
        // 구간합을 나머지로 나눈 합 나머지 배열 구성


        long[] s = new long[n + 1];
        long[] d = new long[n + 1];
        long[] c = new long[m];

        // 경우의 수 구하기
        long result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            s[i] = s[i - 1] + Long.parseLong(st.nextToken());
            d[i] = s[i] % m;
            if(d[i] == 0) result++;
            c[(int) d[i]]++;
        }
        // 조합의 수 세기
        for(int j = 0; j < m; j++){
            result += n_combination_2(c[j]);
        }

        bw.write(result+"");
        bw.flush();
        bw.close();

    }
    public static long n_combination_2( long n ){
        if(n < 2) return 0;
        else return n * (n - 1) / 2 ;
    }
}

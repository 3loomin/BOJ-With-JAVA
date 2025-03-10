package Doit;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Doit_8_isGood {
    public static void solution() throws IOException {
        /*
            Boj_1253_g4
            좋은 수 구하기

            N개의 수 중에서 어떤 수가 다른 수 "두 개"의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
            N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
            수의 위치가 다르면 값이 같아도 다른 수이다.

            핵심: 투 포인터
            O(N^2)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int count = 0;

        for(int k = 0; k < n; k++){
            if(isGood(a,a[k],k)) count++;
        }
        bw.write(count +"");
        bw.flush();
        bw.close();

    }
    public static boolean isGood(long[] a, long find, int find_idx){
        long sum = 0;
        int start_idx = 0;
        int end_idx = a.length - 1;
        while(start_idx < end_idx){
            sum = a[start_idx] + a[end_idx];
            if(sum > find) end_idx--;
            else if(sum < find) start_idx++;
            else{
                // 자신은 좋은 수가 안되기 때문에 그 경우를 걸러 줘야함
                if(start_idx != find_idx && end_idx != find_idx){
                    return true;
                }
                else if (start_idx == end_idx){
                    start_idx++;
                }
                else if(end_idx == find_idx){
                    end_idx--;
                }
            }
        }
        return false;
    }
}

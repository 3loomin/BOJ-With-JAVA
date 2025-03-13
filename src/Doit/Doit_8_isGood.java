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
        /*
            N(입력)
            for (N만큼) {
                arr(입력) 10억까지임 제발 입력값좀 봐라
            }
            arr 정렬

            for(k 0~n까지 반복){
                변수 초기화 하기 (찾고자 하는 값 find, 투 포인터(i , j))
                while(i<j){
                    sum = A[i] + A[j]
                    if( sum == 찾고자 하는 값){
                        두 포인터가 k가 아닐때 count++, while 문 탈출
                        두 포인터가 k일 때 i , j 갱신

                    {
                    else if(sum < 찾고자 하는 값) i 증가
                    else j 감소
            }
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;

        for (int k = 0; k < n; k++) {
            long find = arr[k];
            int i = 0;
            int j = n - 1;
            while (i < j) {
                long sum = arr[i] + arr[j];
                if (sum == find) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (sum < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}

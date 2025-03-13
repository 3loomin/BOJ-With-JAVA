package Doit;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Doit_7_Jumong {
    public static void solution() throws IOException {
        /*
        N(입력)M(입력)arr(입력)
        2 7 4 1 5 3
        배열 정렬(arr)
        1 2 3 4 5 7

        start는 맨처음 end는 맨 뒤 로 초기화
        While(start < end)
            sum = arr[start] + arr[end]
            if(sum > m) end를 하나 전으로
            if(sum < m) start를 하나 뒤로
            sum이 N과 같다면 count 증가
        출력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int count = 0;
        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum > m){
                end--;
            }
            else if(sum < m){
                start++;
            }
            else{
                count++;
                start++;
                end--;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}

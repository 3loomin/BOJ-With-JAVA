package Doit;

import java.io.*;
import java.util.Arrays;

public class Doit_2_PyoungGyun {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // N개의 점수들을 저장할 double 배열
        double[] arr = new double[N];
        // 점수 입력
        String s = br.readLine();
        String[] split = s.split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(split[i]);
        }
        // arr에서 최댓값 찾기
        double max = Arrays.stream(arr).max().getAsDouble();
        for(int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
        }

        // 평균 구하기
        double sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[i];
        }

        bw.write(sum/N + "\n");
        bw.flush();
        bw.close();

    }

}

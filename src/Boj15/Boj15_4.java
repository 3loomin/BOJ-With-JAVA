package Boj15;

import java.io.*;

public class Boj15_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }

        br.close();

        int answer = 0;

        for (int i = 0; i <  n -1; i++) {
            int distance = arr[i+1] - arr[i];
            answer = GCD(distance, answer);
        }

        int i1 = (arr[n - 1] - arr[0]) / answer + 1 - arr.length;
        bw.write(i1 + "");
        bw.flush();
        bw.close();
    }

    static int GCD(int A, int B){
        while(B != 0){
            int R = A%B;
            A = B;
            B = R;
        }
        return A;
    }
}

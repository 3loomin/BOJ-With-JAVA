package Doit;

import java.io.*;

public class Doit_15_BubbleSort {
    public static void solution() throws IOException {
        /*

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if( a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }

    }
}

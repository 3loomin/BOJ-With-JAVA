package Boj4;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalInt;

public class Boj4_4 {
    public static void boj4_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            String a = br.readLine();
            arr[i] = (Integer.parseInt(a));
        }

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max.getAsInt());
        for(int i = 0; i < 9; i++) {
            if(arr[i] == max.getAsInt()){
                System.out.println((i+1));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

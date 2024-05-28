package Boj6;

import java.io.*;

public class Boj6_3 {

    public static void boj6_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Integer n = Integer.valueOf(s);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i -1; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 *(n-i) - 1 ; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
            if(i != n - 1) System.out.println();

        }
        //bw.flush();
        bw.close();
        br.close();
    }

}

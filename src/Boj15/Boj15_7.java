package Boj15;

import java.io.*;

public class Boj15_7 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        while(n != 0){
            int count = 0;
            for (int i = n + 1; i <= 2*n; i++) {
                if (isPrime(i) && i != 1) count++;
            }
            bw.write(count +"\n");

            n = Integer.parseInt(br.readLine());

        }
        bw.flush();
        bw.close();

    }

    public static boolean isPrime(long a){
        int mit = 2;
        while (a > 1 && mit <= Math.sqrt(a)) {
            if (a % mit == 0 ) {
                return false;
            } else mit++;
        }
        return true;
    }
}

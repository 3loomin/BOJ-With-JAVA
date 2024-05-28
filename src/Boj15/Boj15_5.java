package Boj15;

import java.io.*;

public class Boj15_5 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(br.readLine());
            if(a == 0 || a ==1) {
                System.out.println(2);
                continue;
            }
            long j = a;
            while(!isPrime(j)){
                j++;
            }
            System.out.println(j);
        }

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

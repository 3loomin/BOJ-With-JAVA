package Boj21;

import java.io.*;
import java.util.StringTokenizer;

public class Boj21_3 {
    private static int count;
    // Main Class
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            count = 0;
            String[] split = s.split("");
            int palidrome = isPalidrome(split);
            bw.write(palidrome + " " + count + "\n");
        }



        bw.flush();
        bw.close();
    }

    public static int isPalidrome(String[] s){
        return recursion(s, 0 , s.length -1);
    }

    public static int recursion(String[] s, int l, int r){
        count++;
        if(l >= r ) return 1;
        else if(!s[l].equals(s[r]) ) return 0;
        else return recursion(s, l+1, r-1);
    }
}

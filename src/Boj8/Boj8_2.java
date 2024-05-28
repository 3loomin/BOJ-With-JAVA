package Boj8;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj8_2 {
    public static void boj8_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n = Integer.valueOf(st.nextToken());
        Integer radix = Integer.valueOf(st.nextToken());
        ArrayList<String> stack = new ArrayList<>();

        while(n > 0){
            char c = Character.forDigit(n % radix, radix);
            stack.add(String.valueOf(c).toUpperCase());
            n /= radix;
        }

        for (int i = stack.size() - 1 ; i >= 0 ; i--) {
            bw.write(stack.get(i));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

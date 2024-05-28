package Boj16;

import java.io.*;
import java.util.Stack;

public class Boj16_2 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if( a == 0 ) stack.pop();
            else stack.push(a);
        }

        br.close();

        int sum = 0;
        int stackn = stack.size();
        for (int i = 0; i < stackn ; i++) {
            sum += stack.pop();
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}

package Boj16;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj16_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken("");
            int check = 0 ;
            for (int j = 0; j < s.length(); j++) {

                String[] split = s.split("");

                if (split[j].equals("(")) stack.push(s);
                else if(!stack.isEmpty() && split[j].equals(")")) stack.pop();
                else if(stack.isEmpty() && split[j].equals(")"))check++;

            }
            bw.write((check == 0 && stack.isEmpty())? "YES" + "\n" : "NO" + "\n");
        }


        bw.flush();
        bw.close();
    }
}

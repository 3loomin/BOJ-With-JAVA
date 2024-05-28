package Boj16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj16_7 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = n; i >= 1; i--) {
            queue.push(i);
        }
        while(!(queue.size() == 1)){
            queue.pop();
            queue.add(queue.pop());
        }
        bw.write(queue.pop() + "\n");
        bw.flush();
        bw.close();
    }
}

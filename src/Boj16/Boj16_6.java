package Boj16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj16_6 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push" -> {
                    int a = Integer.parseInt(st.nextToken());
                    queue.add(a);
                }
                case "pop" -> {
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(queue.pop() + "\n");
                    }
                }
                case "size" -> {
                    bw.write( queue.size() + "\n");

                }
                case "empty" -> {
                    bw.write(queue.isEmpty()? 1 + "\n" : 0 + "\n");
                }
                case "front" -> {
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(queue.getFirst() + "\n");
                    }

                }
                case "back" -> {
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(queue.getLast() + "\n");
                    }

                }
            }

        }
        bw.flush();
        bw.close();
    }
}

package Boj16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj16_9 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch (a) {
                case 1 -> deque.addFirst(Integer.valueOf(st.nextToken()));
                case 2 -> deque.addLast(Integer.valueOf(st.nextToken()));
                case 3 -> {
                    if(!deque.isEmpty()) bw.write(deque.pop() + "\n");
                    else bw.write(-1 + "\n");
                }
                case 4 -> {
                    if(!deque.isEmpty()) bw.write(deque.pollLast() + "\n");
                    else bw.write(-1 + "\n");
                }
                case 5 -> bw.write(deque.size() + "\n");
                case 6 -> {
                    if (deque.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                }
                case 7 ->{
                    if(!deque.isEmpty()) bw.write(deque.getFirst() + "\n");
                    else bw.write(-1 + "\n");
                }
                case 8 -> {
                    if(!deque.isEmpty()) bw.write(deque.getLast() + "\n");
                    else bw.write(-1 + "\n");
                }

            }

        }
        bw.flush();
        bw.close();

    }
}

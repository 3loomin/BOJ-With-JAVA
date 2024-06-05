package etc;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_10828 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s){
                case "push" -> deque.push(Integer.valueOf(st.nextToken()));
                case "top"  -> {
                    if(deque.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deque.getFirst()+"\n");
                }
                case "pop"  -> {
                    if(deque.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deque.pop()+"\n");
                }
                case "size" -> bw.write(deque.size() + "\n");
                case "empty" -> {
                    if(deque.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                }
            }


        }
        bw.flush();
        bw.close();
    }

}

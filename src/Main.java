import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {solution();}
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int cur = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            Deque<Integer> deque = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                deque.add(a);
                list.add(a);
            }
             int cnt = 0;

            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) > list.get(cur)){
                    cnt++;
                    deque.removeFirstOccurrence(list.get(j));
                    list.remove(j);

                }
            }
            cnt += cur;

            bw.write();

        }

        bw.flush();
        bw.close();
    }

}
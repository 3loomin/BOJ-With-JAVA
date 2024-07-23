package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_9699 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n  = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            list.sort(Integer::compareTo);
            Integer i1 = list.get(4);
            bw.write("Case #" +i +": " + i1 + "\n");
        }

        bw.flush();
        bw.close();
    }
}

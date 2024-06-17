package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2752 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(st.nextToken());
            list.add(a);
        }
        list.sort(Integer::compareTo);
        for (int i = 0; i < 3; i++) {
            bw.write(list.get(i) + " ");
        }
        bw.flush();
        bw.close();
    }
}

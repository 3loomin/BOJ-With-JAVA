package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_18110 {
    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        int cut  = (int) Math.round(n * 0.15);

        list.sort(Integer::compareTo);
        int sum = 0;
        for (int i = cut; i < list.size() - cut ; i++) {
            sum += list.get(i);
        }
        int answer = (int) Math.round((double)sum/(n - 2 * cut));
        bw.write(answer+"");


        bw.flush();
        bw.close();
    }
}

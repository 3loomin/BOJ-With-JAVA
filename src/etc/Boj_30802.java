package etc;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj_30802 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            map.put(i, Integer.valueOf(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        double t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            sum += (int) Math.ceil(map.get(i)/t);
        }

        bw.write(sum + "\n");
        bw.write((n / p) + " ");
        bw.write((n % p)+"");

        bw.flush();
        bw.close();
    }
}

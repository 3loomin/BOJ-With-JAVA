package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_5596 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sum = new int[2];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                int a = Integer.parseInt(st.nextToken());
                sum[i] += a ;
            }
        }
        int max = Math.max(sum[0], sum[1]);
        bw.write(max +"");


        bw.flush();
        bw.close();
    }
}

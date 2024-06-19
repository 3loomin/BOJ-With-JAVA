package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_3046 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int mean = Integer.parseInt(st.nextToken());
        int r2 = 2 * mean - r1;
        bw.write(r2+"");

        bw.flush();
        bw.close();

    }
}

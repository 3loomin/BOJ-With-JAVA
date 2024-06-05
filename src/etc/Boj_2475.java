package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_2475 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(Integer.valueOf(st.nextToken()),2);
        }

        bw.write((sum%10) +"");

        bw.flush();
        bw.close();
    }
}

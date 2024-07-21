package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_8760 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());


        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            int res = w*h/2;
            bw.write(res+"\n");
        }

        bw.flush();
        bw.close();
    }
}

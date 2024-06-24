package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_4589 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        bw.write("Gnomes:");
        bw.newLine();
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a < b && b < c || a > b && b > c) bw.write("Ordered");
            else bw.write("Unordered");

            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}

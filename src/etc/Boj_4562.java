package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_4562 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int brain = Integer.parseInt(st.nextToken());
            int need = Integer.parseInt(st.nextToken());
            if(brain >= need) bw.write("MMM BRAINS");
            else bw.write("NO BRAINS");

            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}

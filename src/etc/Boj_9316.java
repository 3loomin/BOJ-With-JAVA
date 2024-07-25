package etc;

import java.io.*;

public class Boj_9316 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n  = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            bw.write("Hello World, Judge " + i +"!" + "\n");
        }

        bw.flush();
        bw.close();
    }
}

package etc;

import java.io.*;

public class Boj_19602 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a * i;
        }

        if (sum >= 10) {
            bw.write("happy");
        } else {
            bw.write("sad");
        }
        bw.flush();
        bw.close();
    }
}

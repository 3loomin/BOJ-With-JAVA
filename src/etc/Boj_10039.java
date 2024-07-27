package etc;

import java.io.*;

public class Boj_10039 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a <= 40) a = 40;
            sum += a;
        }
        int avg = sum/5;

        bw.write(avg+"\n");
        bw.flush();
        bw.close();
    }
}

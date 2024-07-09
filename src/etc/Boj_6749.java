package etc;

import java.io.*;

public class Boj_6749 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = b + ( b - a );

        bw.write(c + "");
        bw.flush();
        bw.close();
    }
}

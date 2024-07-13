package etc;

import java.io.*;

public class Boj_6810 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 91;
        int a = Integer.parseInt(br.readLine());
        res += a * 1;
        a = Integer.parseInt(br.readLine());
        res += a * 3;
        a = Integer.parseInt(br.readLine());
        res += a * 1;

        bw.write("The 1-3-sum is "+res);
        bw.flush();
        bw.close();
    }
}

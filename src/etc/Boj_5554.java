package etc;

import java.io.*;

public class Boj_5554 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
        }
        int x = sum / 60;
        int y = sum % 60;

        bw.write(x +"\n" + y);


        bw.flush();
        bw.close();
    }
}

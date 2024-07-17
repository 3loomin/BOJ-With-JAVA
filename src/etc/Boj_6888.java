package etc;

import java.io.*;

public class Boj_6888 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        bw.write("All positions change in year " + a);
        bw.newLine();
        int b = Integer.parseInt(br.readLine());

        int c = (b - a)/60;
        int d = a + 60;
        for (int i = 0; i < c; i++) {
            bw.write("All positions change in year " + d);
            bw.newLine();
            d+=60;
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }
}

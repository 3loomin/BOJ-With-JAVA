package Boj3;

import java.io.*;

public class Boj3_7 {
    public static void boj3_7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCase = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer i = Integer.valueOf(testCase);

        for (int j = 0; j < i; j++) {
            String a = br.readLine();
            String[] s = a.split(" ");
            bw.write("Case #" + (j+1) + ": "+ (Integer.valueOf(s[0])+Integer.valueOf(s[1])) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

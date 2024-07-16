package etc;

import java.io.*;

public class Boj_6887 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = (int) Math.floor(Math.sqrt(a));
        bw.write("The largest square has side length "+b +"." );
        bw.newLine();
        bw.flush();
        bw.close();
    }
}

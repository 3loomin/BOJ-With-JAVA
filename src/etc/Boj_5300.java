package etc;

import java.io.*;

public class Boj_5300 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a  = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a ; i++) {
            bw.write(i + " ");
            if(i % 6 == 0 ) bw.write("Go! ");
            else if (i == a) bw.write("Go! ");
        }

        bw.flush();
        bw.close();
    }
}

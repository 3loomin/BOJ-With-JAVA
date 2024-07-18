package etc;

import java.io.*;

public class Boj_7595 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        while(a != 0){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            a = Integer.parseInt(br.readLine());
        }
        bw.flush();
        bw.close();
    }
}

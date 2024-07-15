package etc;

import java.io.*;

public class Boj_5543 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ab = Integer.parseInt(br.readLine());
        int bb = Integer.parseInt(br.readLine());
        int cb = Integer.parseInt(br.readLine());

        int coke = Integer.parseInt(br.readLine());
        int soda = Integer.parseInt(br.readLine());

        int minb = Math.min(Math.min(ab, bb), cb);
        int drink = Math.min(coke, soda);
        bw.write((minb+drink - 50 )+"");

        bw.flush();
        bw.close();
    }
}

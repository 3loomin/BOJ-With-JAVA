package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_5575 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());

            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());
            int es = Integer.parseInt(st.nextToken());

            int rh = eh - sh;
            int rm = em - sm;
            int rs = es - ss;

            if(rs < 0){
                rs = 60 + rs;
                rm--;
            }
            if (rm < 0){
                rm = 60 + rm;
                rh--;
            }

            bw.write(rh + " " + rm + " " + rs +"\n");
        }

        bw.flush();
        bw.close();
    }
}

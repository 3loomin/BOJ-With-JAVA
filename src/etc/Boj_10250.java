package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_10250 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            double h = Double.parseDouble(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int customer = Integer.parseInt(st.nextToken());

            int ho = (int) Math.ceil(customer / h);
            int f = (int) (customer % (h));
            if(f == 0) f = (int) h;
            if(ho < 10) bw.write(((int)f) + "0" + ho + "\n");
            else bw.write(((int)f) + "" + ho + "\n");
        }
        bw.flush();
        bw.close();
    }
}

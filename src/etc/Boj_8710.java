package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_8710 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ko = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int add = Integer.parseInt(st.nextToken());
        int i = 0;
        while(ko<limit){
            i++;
            ko += add;
        }
        bw.write(i + "");
        bw.flush();
        bw.close();
    }
}

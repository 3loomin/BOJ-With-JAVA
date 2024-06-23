package etc;

import java.io.*;

public class Boj_3765 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        while(s!=null){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}

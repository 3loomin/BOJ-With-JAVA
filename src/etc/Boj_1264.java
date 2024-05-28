package etc;

import java.io.*;

public class Boj_1264 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().toLowerCase();

        while(!s.equals("#")){
            String[] split = s.split("");
            int count = 0;
            for (int i = 0; i < split.length; i++) {
                if(split[i].equals("a") || split[i].equals("e") ||split[i].equals("i") ||split[i].equals("o") ||split[i].equals("u")) count++;
            }
            bw.write(count + "\n");
            s = br.readLine().toLowerCase();
        }
        bw.flush();
        bw.close();

    }
}

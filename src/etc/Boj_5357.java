package etc;

import java.io.*;

public class Boj_5357 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a  = Integer.parseInt(br.readLine());
        for (int i = 1; i <= a ; i++) {
            String tmp = "1";
            String s = br.readLine();
            String[] split = s.split("");
            for (int j = 0; j < split.length; j++) {
                if(!tmp.equals(split[j])) {
                    bw.write(split[j]+"");
                }
                tmp = split[j];
            }

            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}

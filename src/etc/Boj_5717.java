package etc;

import java.io.*;

public class Boj_5717 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] split = s.split(" ");
        while(!split[0].equals("0") && !split[1].equals("0")){
            int sum = 0;
            sum += Integer.valueOf(split[0]);
            sum += Integer.valueOf(split[1]);
            bw.write(sum +"\n");

            s = br.readLine();
            split = s.split(" ");
        }

        bw.flush();
        bw.close();
    }
}

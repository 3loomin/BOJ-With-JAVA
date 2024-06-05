package etc;

import java.io.*;

public class Boj_31403 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String  answer = "";
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            String s = br.readLine();
            answer = answer + s;
            sum += Integer.valueOf(s);
        }

        String s = br.readLine();
        sum -= Integer.valueOf(s);

        int i1 = Integer.valueOf(answer) - Integer.valueOf(s);
        bw.write(sum + "\n");
        bw.write(i1 + "");

        bw.flush();
        bw.close();
    }
}

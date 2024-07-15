package etc;

import java.io.*;

public class Boj_6841 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        while(!s.equals("TTYL")){
            switch (s) {
                case "CU" -> bw.write("see you" + "\n");
                case ":-)" -> bw.write("I’m happy" + "\n");
                case ":-(" -> bw.write("I’m unhappy" + "\n");
                case ";-)" -> bw.write("wink" + "\n");
                case ":-P" -> bw.write("stick out my tongue" + "\n");
                case "(~.~)" -> bw.write("sleepy" + "\n");
                case "TA" -> bw.write("totally awesome" + "\n");
                case "CCC" -> bw.write("Canadian Computing Competition" + "\n");
                case "CUZ" -> bw.write("because" + "\n");
                case "TY" -> bw.write("thank-you" + "\n");
                case "YW" -> bw.write("you’re welcome" + "\n");
                default -> bw.write(s +"\n");
            }
            s = br.readLine();
        }

        bw.write("talk to you later");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}

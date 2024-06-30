package etc;

import java.io.*;

public class Boj_5358 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        while (s != null){
            String[] split = s.split("");
            for (int i = 0; i < s.length(); i++) {
                if( s.charAt(i) == 'i') bw.write("e");
                else if( s.charAt(i) == 'e') bw.write("i");
                else if( s.charAt(i) == 'I') bw.write("E");
                else if( s.charAt(i) == 'E') bw.write("I");
                else bw.write(s.charAt(i)+"");
            }

            bw.newLine();
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}

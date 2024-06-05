package etc;

import java.io.*;

public class Boj_1259 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        while(!s.equals("0")){
            String[] split = s.split("");
            int check = 0;
            for (int i = 0; i <= split.length/2; i++) {
                if(!split[i].equals(split[split.length - 1 - i])) check++;
            }
            if(check == 0) bw.write("yes" + "\n");
            else bw.write("no" + "\n");
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}

package etc;

import java.io.*;

public class Boj_6778 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int hair  = Integer.parseInt(br.readLine());
        int eyes =  Integer.parseInt(br.readLine());
        if(hair >= 3 && eyes <= 4) bw.write("TroyMartian" +"\n");
        if(hair <= 6 && eyes >= 2) bw.write("VladSaturnian" + "\n");
        if(hair <= 2 && eyes <= 3) bw.write("GraemeMercurian"+"\n");


        bw.flush();
        bw.close();
    }
}

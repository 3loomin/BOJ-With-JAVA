package etc;

import java.io.*;

public class Boj_2083 {
    public static void main(String[] args) throws IOException {
        solution();

    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] split = s.split(" ");

        while(!split[0].equals("#") ){
            if(Integer.valueOf(split[1]) > 17 || Integer.valueOf(split[2]) >= 80) bw.write(split[0]+ " Senior" +"\n");
            else bw.write(split[0]+ " Junior" +"\n");

            s = br.readLine();
            split = s.split(" ");
        }

        bw.flush();
        bw.close();
    }
}

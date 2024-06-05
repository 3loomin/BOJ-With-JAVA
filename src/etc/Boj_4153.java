package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_4153 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        while(a != 0){
            if( isRight(a,b,c) ) bw.write("right" + "\n");
            else bw.write("wrong" + "\n");

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }

        bw.flush();
        bw.close();
    }

    private static boolean isRight(int a, int b, int c) {
        if(Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2) ||
                Math.pow(a,2)+Math.pow(c,2) == Math.pow(b,2) ||
                Math.pow(b,2)+Math.pow(c,2) == Math.pow(a,2)) return true;
        else return false;

    }


}

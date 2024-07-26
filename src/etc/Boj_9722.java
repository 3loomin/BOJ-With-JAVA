package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_9722 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());

        while( !(a == 0 && b == 0) ){
            if(a>0){
                if (b > 0) bw.write("Q1" + "\n");
                if ( b == 0) bw.write("AXIS" + "\n" );
                if (b < 0) bw.write("Q4" + "\n");
            }
            else if (a == 0) bw.write("AXIS" + "\n" );

            else{
                if (b > 0) bw.write("Q2" + "\n");
                if ( b == 0) bw.write("AXIS" + "\n" );
                if (b < 0) bw.write("Q3" + "\n");

            }
            st = new StringTokenizer(br.readLine());
            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());

        }
        bw.write("AXIS" + "\n" );

        bw.flush();
        bw.close();
    }
}

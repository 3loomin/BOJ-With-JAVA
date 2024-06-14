package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_2530 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(br.readLine());

        int tmph = target / 3600;
        target %= 3600;
        int tmpm = target / 60;
        target %= 60;
        int tmps = target;
        int mcarry = 0;
        int hcarry = 0;

        if(target + s >= 60){
            mcarry = (target + s) / 60;
            s = (target + s) % 60;
        } else {
            s = target + s;
        }

        if(mcarry + tmpm + m >= 60){
            hcarry = (tmpm + m + mcarry) / 60;
            m = (tmpm + m + mcarry) % 60;
        } else {
            m = mcarry + m + tmpm;
        }

        if(hcarry + tmph + h >= 24){
            h = (hcarry + tmph + h) % 24;
        } else {
            h = hcarry + tmph + h;
        }

        bw.write(h +" " + m +" " + s );

        bw.flush();
        bw.close();
    }

}

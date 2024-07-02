package etc;

import java.io.*;

public class Boj_5532 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int vacation = Integer.parseInt(br.readLine());
        double ko = Double.parseDouble(br.readLine());
        double ma = Double.parseDouble(br.readLine());
        double kp = Double.parseDouble(br.readLine());
        double mp = Double.parseDouble(br.readLine());

        int i = (int) ko / (int) kp;
        int j = (int) ma / (int) mp;

        if((int) ko % (int) kp != 0) i++;
        if((int) ma % (int) mp != 0) j++;

        int max = Math.max(i, j);
        bw.write(vacation - max +"");


        bw.flush();
        bw.close();
    }
}

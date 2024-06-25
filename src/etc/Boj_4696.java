package etc;

import java.io.*;

public class Boj_4696 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double a = Double.parseDouble(br.readLine());
        while(a != 0){
            double sum = 0;
            for (int i = 0; i < 5 ; i++) {
                sum += Math.pow(a, i);
            }
            sum = (double) Math.round(sum * 100) / 100.0;

            System.out.println(String.format("%.2f", sum));

            a = Double.parseDouble(br.readLine());
        }

        bw.flush();
        bw.close();
    }
}

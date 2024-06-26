package etc;

import java.io.*;

public class Boj_4717 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double a = Double.parseDouble(br.readLine());
        while(a != -1){
            double moon = a * 0.167;
            moon = Math.round(moon * 100) / 100.0;
            bw.write("Objects weighing " + String.format("%.2f", a) + " on Earth will weigh " + String.format("%.2f",moon) + " on the moon.");
            bw.newLine();

            a = Double.parseDouble(br.readLine());
        }

        bw.flush();
        bw.close();
    }
}

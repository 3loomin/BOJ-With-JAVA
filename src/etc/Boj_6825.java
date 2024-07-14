package etc;

import java.io.*;

public class Boj_6825 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double w = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        double bmi = w/Math.pow(h,2);

        if(bmi > 25.0) bw.write("Overweight");
        else if (bmi >= 18.5 && bmi <= 25.0) bw.write("Normal weight");
        else if (bmi < 18.5) bw.write("Underweight");

        bw.flush();
        bw.close();
    }
}

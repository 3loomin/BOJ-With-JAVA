package Boj6;

import java.io.*;

public class Boj6_8 {
    public static void boj6_8() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalamount = 0;
        double totalscore = 0;
        for (int i = 0; i < 20; i++) {

            String s = br.readLine();
            String[] split = s.split(" ");
            Double amount = Double.valueOf(split[1]);
            double score;
            switch (split[2]) {
                case "A+": score = 4.5;
                    break;
                case "A0": score = 4.0;
                    break;
                case "B+": score = 3.5;
                    break;
                case "B0": score = 3.0;
                    break;
                case "C+": score = 2.5;
                    break;
                case "C0": score = 2.0;
                    break;
                case "D+": score = 1.5;
                    break;
                case "D0": score = 1.0;
                    break;
                default: score = 0;
            }
            if(!(split[2].equals("P") || split[2].equals("P"))){
                totalscore += score * amount;
                totalamount += amount;
            }
        }

        System.out.println(totalscore/totalamount);

        bw.flush();
        bw.close();
        br.close();
    }
}

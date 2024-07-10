package etc;

import java.io.*;

public class Boj_6763 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int limit = Integer.parseInt(br.readLine());
        int my = Integer.parseInt(br.readLine());
        if (limit >= my) bw.write("Congratulations, you are within the speed limit!");
        else{
            int i = my - limit;
            if(i <= 20) bw.write("You are speeding and your fine is $100.");
            else if (i <= 30) bw.write("You are speeding and your fine is $270.");
            else bw.write("You are speeding and your fine is $500.");

        }
        bw.flush();
        bw.close();
    }
}

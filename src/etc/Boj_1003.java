package etc;

import java.io.*;

public class Boj_1003 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        if (n % 3 == 0 ){
            n /= 3;
            count++;
        }
        if ( n % 2 == 0) {
            n /= 2;
            count++;
        }
        if (n == 1) {
            bw.write(count + "");
        }
        else if ( (n - 1) == 1){
            count++;
            bw.write(count + "");
        }
        bw.flush();
        bw.close();
    }
}

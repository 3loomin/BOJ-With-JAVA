package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_2609 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //최대공약수 유클리드 호제법
        bw.write(gcd(a,b) + "\n");
        bw.write((a * b /gcd(a,b) +""));

        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b){
        int r;
        while(b > 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

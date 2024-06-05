package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj_1676 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());

        BigInteger f = factorial(BigInteger.valueOf(n));
        String s = String.valueOf(f);
        String[] split = s.split("");

        int count = 0;
        for (int i = split.length - 1;  i > 0; i--) {
            if(split[i].equals("0")) count++;
            else break;

        }

        bw.write(count + "");

        bw.flush();
        bw.close();
    }

    public static BigInteger factorial( BigInteger n ){
        if(n.compareTo(BigInteger.ONE) >= 0) {
            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        } else return BigInteger.ONE;
    }
}

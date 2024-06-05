package etc;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj_15829 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        BigInteger sum = new BigInteger("0");
        BigInteger hash = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            int i1 = s.charAt(i) - 'a' + 1;
            sum = sum.add(BigInteger.valueOf(i1).multiply(hash)).mod(BigInteger.valueOf(1234567891));
            hash = hash.multiply(BigInteger.valueOf(31));
        }
        sum.mod(BigInteger.valueOf(1234567891));

        bw.write( sum + "");
        bw.flush();
        bw.close();
    }
}

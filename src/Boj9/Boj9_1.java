package Boj9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9_1 {
    public static void boj9_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while( a != 0 && b != 0) {
            //factor
            if(b % a == 0) System.out.println("factor");
            else if(a % b == 0) System.out.println("multiple");
            else System.out.println("neither");

            st = new StringTokenizer(br.readLine());
            if (st.hasMoreElements()) {
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            }

        }
    }
}

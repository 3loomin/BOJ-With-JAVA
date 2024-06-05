import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static int zero_count = 0;
    public static int one_count = 0;
    public static void main(String[] args) throws IOException {
        solution();

    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int a  = Integer.parseInt(br.readLine());
            fibonachi(a);
            bw.write(zero_count + " " + one_count);
            zero_count = 0;
            one_count = 0;
            bw.write("\n");

        }

        bw.flush();
        bw.close();
    }

    public static long fibonachi(long n){
        if (n == 0){
            zero_count++;
            return n;
        }
        else if( n == 1 ){
            one_count++;
            return n;
        }
        else return fibonachi(n - 1) + fibonachi(n - 2);
    }

}
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    
    public static void main(String[] args) throws IOException {solution();}
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
<<<<<<< HEAD
        int r1 = Integer.parseInt(st.nextToken());
        int mean = Integer.parseInt(st.nextToken());
        int r2 = 2 * mean - r1;
        bw.write(r2+"");

=======
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int sg = l * p;
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(st.nextToken());
            list.add(a);
        }

        for (int i = 0; i < 5; i++) {
            bw.write((list.get(i) - sg) + " ");
        }
>>>>>>> c32d7da48dc09d16b62cc095f120ea2ba9855530
        bw.flush();
        bw.close();

    }

}

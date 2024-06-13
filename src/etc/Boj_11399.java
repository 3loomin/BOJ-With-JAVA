package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

public class Boj_11399 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a  = Integer.parseInt(st.nextToken());
            list.add(a);
        }
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Optional<Integer> min = list.stream().min(Integer::compareTo);
            sum = sum + min.get();
            list.remove(list.indexOf(min.get()));
            answer += sum;
        }
        bw.write(answer + "");


        bw.flush();
        bw.close();
    }
}

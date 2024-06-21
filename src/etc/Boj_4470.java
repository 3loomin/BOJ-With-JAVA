package etc;

import java.io.*;
import java.util.HashMap;

public class Boj_4470 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i <= a; i++) {
            map.put(i, br.readLine());
        }
        for (int i = 1; i <= a; i++) {
            bw.write(i + ". " + map.get(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}

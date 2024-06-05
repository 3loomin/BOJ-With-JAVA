package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2920 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }
        boolean isAsc = true;
        boolean isDes = true;

        for (int i = 1; i <= 8; i++) {
            if(isAsc && list.get(i - 1) == i) continue;
            else isAsc = false;
        }

        for (int i = 1; i <= 8; i++) {
            if(isDes && (list.get(i - 1) == 9 - i)) continue;
            else isDes = false;
        }

        if(isAsc) bw.write("ascending");
        else if (isDes) bw.write("descending");
        else if (!isDes && !isAsc) bw.write("mixed");

        bw.flush();
        bw.close();
    }
}

package Boj4;

import java.io.*;
import java.util.ArrayList;

public class Boj4_8 {
    public static void boj4_8() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer target = Integer.valueOf(br.readLine());
            list.add(target%42);
        }

        for (int i = 0; i < 10; i++) {
            if(!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }
        }

        System.out.println(list2.size());
        bw.flush();
        bw.close();
        br.close();
    }
}

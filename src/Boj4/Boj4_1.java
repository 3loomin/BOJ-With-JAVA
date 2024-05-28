package Boj4;

import java.io.*;
import java.util.Arrays;

public class Boj4_1 {
    public static void boj4_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer T = Integer.valueOf(br.readLine());
        String inp = br.readLine();
        String find = br.readLine();

        String[] s = inp.split(" ");
        long count = Arrays.stream(s).filter(a -> a.equals(find)).count();
        System.out.println(count);

        bw.flush();
        bw.close();
        br.close();
    }
}

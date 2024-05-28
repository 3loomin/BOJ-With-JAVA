package Boj4;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Boj4_3 {
    public static void boj4_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String given = br.readLine();
        String[] s = given.split(" ");
        int find = Integer.parseInt(s[1]);
        String when = br.readLine();
        String[] s1 = when.split(" ");
        Arrays.stream(s1)
                .filter(a -> Integer.valueOf(a) < find)
                .peek(a -> System.out.print(a + " "))
                .collect(Collectors.toList());

        bw.flush();
        bw.close();
        br.close();
    }
}

package Boj13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj13_2 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum =0;
        for (int i = 0; i < 5; i++) {
            int a  = Integer.parseInt(br.readLine());
            sum += a;
            list.add(a);
        }

        Collections.sort(list);

        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}

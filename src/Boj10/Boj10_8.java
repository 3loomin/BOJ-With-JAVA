package Boj10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj10_8 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> tri = new ArrayList<>();
        for (int i = 0; i < 3; i++) list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);

        if(list.get(2) < list.get(0) + list.get(1)){
            System.out.println(list.get(0)+list.get(1)+list.get(2));
        }else System.out.println(2 * (list.get(1)+list.get(0)) - 1 );

    }
}

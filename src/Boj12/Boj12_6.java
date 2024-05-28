package Boj12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj12_6 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n/5; i++) {
            for (int j = 0; j <= n/3; j++) {
                if(5*i + 3*j == n){
                    list.add(i+j);
                }
            }
        }
        list.sort(Integer::compareTo);
        if(!list.isEmpty()) System.out.println(list.get(0));
        else System.out.println(-1);
    }
}

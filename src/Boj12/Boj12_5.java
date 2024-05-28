package Boj12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Boj12_5 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        list.add("666");
        int i = 1;
        while(list.size() < N){
            String x = String.valueOf(666);
            String target = String.valueOf(i) + x;
            if(i % 10 == 6 && i % 100 != 66 && i % 1000 != 666){
                for (int j = 0; j < 10; j++) {
                    String s;
                    if (i / 10 == 0) {
                        s =  x + String.valueOf(j);
                    }
                    else {
                        s = String.valueOf(i / 10) + x + String.valueOf(j);
                    }
                    list.add(s);
                }
            } else if (i % 100 == 66 && i % 1000 != 666) {
                for (int j = 0; j < 10; j++) {
                    String s;
                    if (i / 100 == 0) {
                        s =  x + "0" + String.valueOf(j);
                    }
                    else {
                        s = String.valueOf(i / 100) + x + "0" + String.valueOf(j);
                    }
                    list.add(s);
                }

                for (int j = 10; j < 100; j++) {
                    String s;
                    if (i / 100 == 0) {
                        s =  x  + String.valueOf(j);
                    }
                    else {
                        s = String.valueOf(i / 100) + x +  String.valueOf(j);
                    }
                    list.add(s);
                }

            } else if ( i % 1000 == 666) {

                for (int j = 0; j < 10; j++) {
                    String s;
                    if (i / 1000 == 0) {
                        s =  x + "0" + "0"+ String.valueOf(j);
                    }
                    else {
                        s = String.valueOf(i / 1000) + x + "0" + "0" + String.valueOf(j);
                    }
                    list.add(s);
                }

                for (int j = 10; j < 100; j++) {
                    String s;
                    if (i / 1000 == 0) {
                        s =  x + "0" + String.valueOf(j);
                    }
                    else {
                        s = String.valueOf(i / 1000) + x + "0" +  String.valueOf(j);
                    }
                    list.add(s);
                }

                for (int j = 100; j < 1000; j++) {
                    String s;
                    if (i / 1000 == 0) {
                        s =  x  + String.valueOf(j);
                    }
                    else {
                        s = String.valueOf(i / 1000) + x  +  String.valueOf(j);
                    }
                    list.add(s);
                }
            } else
                list.add(String.valueOf(i+x));
            i++;
        }

        Collections.sort(list.stream().mapToInt(Integer::valueOf).boxed().collect(Collectors.toList()));
        System.out.println(list.get(N-1));

    }
}

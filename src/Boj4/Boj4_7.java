package Boj4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Boj4_7 {
    public static void boj4_7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb =  new StringBuilder();

        int[] res = new int[31];
        res[0] = 1;
        String s = br.readLine();
        while(s!= null){
            res[Integer.valueOf(s)] = 1;
            s= br.readLine();
        }

        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while( i <= 30){
            if(res[i] != 1)
                list.add(i);

            i++;
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        bw.flush();
        bw.close();
        br.close();
    }
}

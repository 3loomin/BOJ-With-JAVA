package Boj6;

import java.io.*;
import java.util.Arrays;

public class Boj6_7 {
    public static void boj6_7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer T = Integer.valueOf(br.readLine());
        int count = 0;
        for (int i = 0; i < T; i++) {
            int check = 0;
            String s = br.readLine();
            String[] split = s.split("");
            String[] history = new String[split.length];
            int historyidx = 0;
            for (int j = 0; j < split.length; j++) {
                if(!Arrays.asList(history).contains(split[j])){
                    history[historyidx++] = split[j];
                } else{
                    if(!history[historyidx-1].equals(split[j])){
                        check = -1;
                    }
                }
            }
            if(check != -1) count++;
        }
        System.out.println(count);
        bw.flush();
        bw.close();
        br.close();
    }
}

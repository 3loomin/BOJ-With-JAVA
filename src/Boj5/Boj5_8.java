package Boj5;

import java.io.*;

public class Boj5_8 {
    public static void boj5_8() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] split1 = s.split("");
        if(split1[0].equals(" ")){ //여백으로 시작할 때
            s = s.substring(1);
        }

        String[] split = s.split(" ");
        if(String.valueOf(split[0]) == "")System.out.println(split.length - 1);
        else System.out.println(split.length);

        bw.flush();
        bw.close();
        br.close();
    }
}

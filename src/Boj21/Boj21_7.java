package Boj21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj21_7 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 0;
    static List<String> list = new ArrayList<>();
    //Main Class
    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int start = 1;
        int end = 3;
        int via = 2;

        hanoi(N, start, end ,via);
        bw.write(count + "\n");
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
        }

        bw.flush();
        bw.close();
    }
    public static void hanoi(int N, int start, int end, int via) throws IOException {
        if (N == 1) {
            move(1,start,end);
        } else {
            hanoi(N-1, start, via, end);
            move(N, start, end);
            hanoi(N-1 , via, end , start);
        }
    }
    public static void move(int N, int start, int end ) throws IOException {
        count++;
        list.add(start + " " + end + "\n");
    }


}

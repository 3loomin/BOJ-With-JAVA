package Boj21;

import java.io.*;
import java.util.HashMap;

public class Boj21_5_ {
    public static HashMap<Integer, String> list = new HashMap<>();
    //Main Class
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        while(s != null){
            list = new HashMap<>();
            int n = Integer.parseInt(s);
            int k = (int) Math.pow(3, n);

            for (int i = 0; i < k; i++) {
                list.put(i, "-");
            }

            divide_And_Conquer(0, (int) Math.pow(3,n));
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + "");
            }
            bw.write("\n");
            s = br.readLine();
        }

        bw.flush();
        bw.close();
    }

    public static void divide_And_Conquer(int start, int size) {
        if (size == 1) {
            return;
        }
        int newSize = size / 3;
        for (int i = start + newSize; i < start + 2 * newSize; i++) {
            list.put(i, " ");
        }
        divide_And_Conquer(start, newSize);
        divide_And_Conquer(start + 2 * newSize, newSize);
    }
}

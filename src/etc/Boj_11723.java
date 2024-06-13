package etc;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj_11723 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "add" -> {
                    int a  = Integer.parseInt(st.nextToken());
                    map.put(a,0);
                }
                case "remove" -> {
                    int a  = Integer.parseInt(st.nextToken());
                    if(map.getOrDefault(a,-1) != -1){
                        map.remove(a);
                    }
                }
                case "check" -> {
                    int a  = Integer.parseInt(st.nextToken());
                    if(map.getOrDefault(a,-1) != -1){
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                }
                case "toggle" -> {
                    int a  = Integer.parseInt(st.nextToken());
                    if(map.getOrDefault(a,-1) == -1){
                        map.put(a,0);
                    } else {
                        map.remove(a);
                    }
                }

                case "empty" -> map = new HashMap<>();

                case "all" -> {
                    for (int j = 1; j <= 20; j++) {
                        map.put(j,0);
                    }
                }
            }

        }

        bw.flush();
        bw.close();
    }
}

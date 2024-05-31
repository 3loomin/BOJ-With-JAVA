package Boj20;

import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj20_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        TreeMap<String,Integer> tree = new TreeMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");

            if(split[0].equals("ChongChong")){
                tree.put(split[0] , 1);
                tree.put(split[1] , 1);
            } else if (split[1].equals("ChongChong")){
                tree.put(split[0] , 1);
                tree.put(split[1] , 1);
            }

            else if(tree.containsKey(split[0])){
                if( tree.get(split[0]) == 1) tree.put(split[1] , 1);
            }
            else if(tree.containsKey(split[1])){
                if( tree.get(split[1]) == 1) tree.put(split[0] , 1);
            }
        }

        for(Map.Entry<String,Integer> entry: tree.entrySet() ){
            if(entry.getValue() == 1 )count++;
        }
        bw.write(count+ "");
        bw.flush();
        bw.close();
    }


}

package Boj15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj15_1 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> aMap = new HashMap<>();
            HashMap<Integer, Integer> bMap = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            // 6 10
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            if(min == 1){
                bw.write(max + "\n");
                continue;
            }
            int mit = 2;
            // a 소인수 분해
            while(a != 1 && a > 1){

                int jisu = 1;
                if(a % mit == 0){
                    if(!aMap.containsKey(mit)){
                        aMap.put(mit, jisu++);
                        a /= mit;
                    }
                    else if(aMap.containsKey(mit)){
                        aMap.put(mit, aMap.get(mit) + 1);
                        a /= mit;
                    }
                } else mit++;
            }
            mit = 2;
            // b 소인수 분해
            while(b != 1 && b > 1){

                int jisu = 1;
                if(b % mit == 0){
                    if(!bMap.containsKey(mit)){
                        bMap.put(mit, jisu++);
                        b /= mit;
                    }
                    else if(bMap.containsKey(mit)){
                        bMap.put(mit, bMap.get(mit) + 1);
                        b /= mit;
                    }
                } else mit++;
            }
            HashMap<Integer, Integer> answerMap = new HashMap<>();
            for(Map.Entry<Integer, Integer> entry : aMap.entrySet()){
                if(bMap.containsKey(entry.getKey())){
                    answerMap.put(entry.getKey(), Math.max(entry.getValue(), bMap.get(entry.getKey())));
                } else answerMap.put(entry.getKey(), entry.getValue());
            }
            for(Map.Entry<Integer, Integer> entry : bMap.entrySet()){
                if (!answerMap.containsKey(entry.getKey()))answerMap.put(entry.getKey(), entry.getValue());
            }
            int sum = 1;
            for(Map.Entry<Integer, Integer> entry : answerMap.entrySet()){
                sum *= Math.pow(entry.getKey(), entry.getValue());
            }
            bw.write(sum + "\n");

        }
        bw.flush();
    }
}

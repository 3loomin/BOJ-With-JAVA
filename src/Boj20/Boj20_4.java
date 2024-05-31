package Boj20;

import java.io.*;
import java.util.*;

public class Boj20_4 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a  = Integer.parseInt(br.readLine());
            arr[i] = a;
            list.add(a);
            if(!map.containsKey(a)) map.put(a,1);
            else map.put(a, map.get(a) + 1);
        }
        OptionalDouble average = Arrays.stream(arr).average();
        long round = Math.round(average.getAsDouble());
        bw.write(round + "\n");

        list.sort(Integer::compareTo);
        Integer i = list.get(n / 2);

        bw.write( i+"\n");
        int i1 = list.get(list.size() - 1) - list.get(0);
        List<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort(Comparator.comparing(map::get));
        List<Integer> answer = new ArrayList<>();
        if(keyset.size() == 1) bw.write(keyset.get(0) + "\n");
        else{
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                if(entry.getValue() == map.get(keyset.get(keyset.size()-1)))answer.add(entry.getKey());
            }
            if(answer.size()==1) bw.write(answer.get(0)+ "\n");
            else{
                answer.sort(Integer::compareTo);
                bw.write(answer.get(1) + "\n");
            }
        }
        bw.write(i1 +"\n");
        bw.flush();
        bw.close();
    }
}

package etc;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_5430 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            Deque<Integer> list = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            boolean reverse = false;
            int dropcnt = 0;
            boolean errorchk = false;
            String comand = br.readLine();
            String[] split = comand.split("");
            for (int j = 0; j < split.length ; j++) {
                if (split[j].equals("R")) {

                } else {
                    dropcnt++;
                }
            }

            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            s = s.substring(1 , s.length() - 1);
            String[] split1 = s.split(",");
            for (int j = 0; j < n; j++) {
                list.add(Integer.valueOf(split1[j]));
            }

            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("D")) {
                    if(list.isEmpty()){
                        errorchk = !errorchk;
                        break;
                    }
                    if (reverse) {
                        list.pollLast();

                    } else {
                        list.pollFirst();
                    }

                } else {
                    reverse = !reverse;
                }
            }
            int cnt = list.size();
            if(reverse){
                for (int j = 0; j < cnt; j++) {
                    if(list.size() == 1){
                        sb.append(list.pollLast());
                    } else {
                        sb.append(list.pollLast() + ",");
                    }
                }
            } else {
                for (int j = 0; j < cnt; j++) {
                    if(list.size() == 1){
                        sb.append(list.pollFirst());
                    } else {
                        sb.append(list.pollFirst() + ",");
                    }
                }
            }
            sb.append("]");
            if(errorchk) bw.write("error"+"\n");
            else bw.write(sb.toString()+"\n");
        }


        bw.flush();
        bw.close();
    }
}

package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_1940 {
    public static void solution() throws IOException {
        /*
            Boj_1940
            배열과 숫자 m 이 주어지고 배열의 값 두개의 합이 m과 같은 경우의 수를 구하라

            핵심: 투포인터
            1/ 3/ 4/ 7/ 8/ 9/ , m = 10
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list.add(Integer.valueOf(st.nextToken()));
        }
        list.sort(Integer::compareTo);
        int sum = 0;
        int start = 0;
        int end = n - 1;
        int count = 0;
        while(start < end){
            sum = list.get(start) + list.get(end);
            if(sum < m) start++;
            else if(sum > m) end--;
            else{
                count++;
                start++;
                end--;
            }
        }

        bw.write(count+ "");
        bw.flush();
        bw.close();

    }
}

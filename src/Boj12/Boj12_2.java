package Boj12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj12_2 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int ndigit = (int) Math.log10(N) + 1;
        List<Integer> answer = new ArrayList<>();

        // N자릿수 보다 한 자릿수 낮은 9..0 부터 N까지 순회
        for (int i = 9 * (int)Math.pow(10,ndigit - 2); i <= N ; i++) {
            int divsum = 0;         // 분해합 저장할 곳
            String strNum = Integer.toString(i);    //i 값을 문자열로 변경
            for (int j = 0; j <strNum.length() ; j++) {
                divsum += strNum.charAt(j) - '0'; // 각 문자열 돌면서 자리수 더하기
            }
            // 분해합 + 자기 자신의 합이 N과 같다면
            if(divsum + i == N) {
                answer.add(i);
            }
        }
        Collections.sort(answer);       //정렬
        // 0번 값이 존재하면 get(0) 아니면 0
        if(answer.isEmpty()) System.out.println(0);
        else System.out.println(answer.get(0));
    }
}

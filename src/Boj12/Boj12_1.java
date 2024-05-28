package Boj12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj12_1 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> cardList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardList.add(card);
        }

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < cardList.size() - 2; i++) {
            for (int j = i + 1; j < cardList.size() - 1; j++) {
                for (int k = j + 1; k < cardList.size(); k++) {
                    sum = cardList.get(i) + cardList.get(j) + cardList.get(k);
                    if( (sum <= M ) && (temp < sum ) ) temp = sum;
                }
            }
        }
        System.out.println(temp);
    }
}

package Doit;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Doit_13_CardGame {

    public static void solution() throws IOException {
    /*
        Boj_2164_s4
        카드게임

        N장의 카드가 있다. 1번 카드가 맨 위 N번 카드가 가장 아래
        while(카드 수 > 1)
            가장 위의 카드를 바닥에 버림
            가장 위에 있는 카드를 가장아래에 있는 카드 밑으로 보냄
     */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N 카드 개수 queue(카드 저장 자료구조)
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        //for( 카드 개수 만큼 반복) 큐에 카드 저장
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        /*
        while(카드 수 > 1)
            가장 위의 카드를 바닥에 버림
            가장 위에 있는 카드를 가장아래에 있는 카드 밑으로 보냄
         */
        while(queue.size() > 1){
            queue.poll();
            queue.add(queue.poll());
        }
        bw.write(queue.poll() + "");
        bw.flush();
        bw.close();
    }

}

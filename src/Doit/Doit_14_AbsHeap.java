package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Doit_14_AbsHeap {

    public static void solution() throws IOException {
        /*
        Boj_11286_s1
        절댓값 힙 구현하기

        절댓값 힙은 다음과 같은 연산을 지원하는 자료구조
        1. 배열에 정수(0 말고)를 넣는다.
        2. 배열에서 절댓값이 가장 작은 값을 출력
        3. 그 값을 배열에서 제거
        4. 절댓값이 가장 작은 값이 여러 개라면 그 중 가장 작은 수를 출력
        5. 그 값을 배열에서 제거

        입력 : 1 <= N <= 100,000 , N개의 (-213<=)정수(<=231)가 들어옴 이 떄 0이 들어오면 배열에서 절댓값이 가장 작은 값을 출력,
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(정수개수) queue(내보낼 순서를 알고있는 queue)를 양수 음수로 {T 음수 큐 H} 0 {H 양수 큐 T} 로 생각  >> 우선순위 큐로 우선순위를 매기자!
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if( first_abs == second_abs) return o1 > o2 ? 1 : -1 ; // 절댓값이 같을땐 음수 먼저
            else return first_abs - second_abs; //  절댓값을 기준으로 정렬
        });

        //for(N번) //요청이 1 일때 queue.add 요청이 0 일때: queue가 비어있을때 0 아니라면 front 출력
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(br.readLine());
            if (a == 0){
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            }
            // 0이 아닌 정수가 들어왔을 때 >> 우선순위 큐를 사용.
            else{
                queue.add(a);
            }
        }
    }
}

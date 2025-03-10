import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        /*
            Boj_11003_p5
            최솟값 찾기

            N개의 수 A1, A2, ..., AN과 L이 주어진다.
            Di = A(i-L+1) ~ A(i) 중의 최솟값이라고 할 때, D에 저장된 수를 출력하는 프로그램을 작성하시오. 이때, i ≤ 0 인 Ai는 무시하고 D를 구해야 한다.

            TODO 이때, i ≤ 0 인 Ai는 무시하고 D를 구해야 한다.

            핵심: 투포인터 , 한번 만 훑기. >> 라고 생각하니 무조건 o(nlogn)의 시간복잡도를 가짐
            Deque 이용하는 방식으로 진행

            들어 오는 족족 자기 자신보다 큰 값들은 제거하고 삽입 덱에 추가 1번쨰가 범위에 벗어나면 제거
            >> 자동 정렬 효과
            덱에 첫번째에 있는녀석이 현재 범위에서 제일 작은 값
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        // 배열 입력
        st = new StringTokenizer(br.readLine());
        Deque<Node> mydeque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            //현재 입력 받은 값
            int now = Integer.parseInt(st.nextToken());
            // 덱 마지막 위치에서부터 now보다 큰 값들 다 제거
            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast();
            }
            // 덱의 뒤에 새로운 값 추가
            mydeque.add(new Node(i, now));
            // 덱의 1번째 위치에서부터 L 범위를 벗어난 값을 제거
            if(mydeque.getFirst().index <= i - L){
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");

        }
        bw.flush();
        bw.close();
    }

    static class Node {

        public int value;
        public int index;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}

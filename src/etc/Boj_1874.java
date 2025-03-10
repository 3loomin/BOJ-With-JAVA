package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_1874 {

    public static void solution() throws IOException {
    /*
        Boj_1874_s2
        스택으로 오름차순 수열 만들기
        임의의 수열을 스택에 넣었다가 출력하는 방식으로 오름차순 수열을 출력할 수 있는지 확인하고, 출력할
        수 있다면 push와 pop 연산을 어떤 순서로 수행해야 하는지를 알아내는 프로그램을 작성해 보자.


        BufferedWriter 쓰려다가 애먹었다.. 조건에 따라 답의 형태가 달라질 수 있다면 Stringbuffer를 쓰자

     */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bf = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        boolean flag = true;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        int num = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (a >= num){
                while(a >= num){
                    stack.push(num);
                    num++;
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > a){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }

        }
        if (flag){
            System.out.println(bf.toString());
        }
    }
}

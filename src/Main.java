import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        /*
            Boj_17298_g4
            오큰수

            A(i) 에 관련된 오큰수 NGE(i)를 구하려고 한다. A(i)의 오큰수는 오른쪽에 있으면서 A(i)보다 큰 수 중 가장 왼쪽에 있는 수를 의미한다. 이러한 수가 없을 때 오큰수는 -1이다.

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] ans = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        stack.push(0);
        for(int i = 1; i < N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                ans[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }

        for(int i = 0; i< N; i++){
            bw.write(ans[i] + " ");
        }
        bw.flush();
        bw.close();
    }

}

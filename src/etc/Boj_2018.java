package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_2018 {
    public static void solution() throws IOException {
        /*
            Boj_2018_s5
            어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.
            예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.

            핵심 : 투포인터 , 그려서 풀어볼 것
            1/ 2/ 3/ 4/ 5/ 6/ 7/ ... 15/

            start = 1 , end = 1 부터 시작
            1. sum을 기준으로 sum이 n보다 크다면 sum - start 해주고 start 증가
            2. sum이 N보다 작다면 end를 end 증가, sum에 더하고 다시 비교
            3. 만약 같다면 end를 증가해주고 sum에 더해주면 무조건 1로 감

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 살펴 볼 인덱스 start 와 end 사이의 숫자들
        int start = 1;
        int end = 1;

        //비교대상
        int sum = 1;

        // 자기 자신(N)은 미리추가
        int count = 1;

        while( end != N){
            //찾았을 때
            if(sum == N){
                sum += ++end;
                count++;
            }
            else if(sum < N)sum += ++end;
            else if(sum > N) sum -= start++;
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}

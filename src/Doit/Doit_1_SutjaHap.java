package Doit;

import java.io.*;

public class Doit_1_SutjaHap {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        // N(입력)
        int N = Integer.parseInt(br.readLine());
        // N자릿 수 입력
        String s = br.readLine();
        // 한자리씩 뜯어서 배열로 저장
        String[] split = s.split("");

        long res = 0;

        // 배열에 접근하여 결과 값에 더해주기
        for(int i = 0; i < N; i++) {
            res += Long.parseLong(split[i]);
        }
        bw.write(res + "\n");
        bw.flush();
        bw.close();

    }

}

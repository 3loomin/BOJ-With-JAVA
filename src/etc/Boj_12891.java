package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_12891 {
    public static void solution() throws IOException {
        /*
            Boj_12891_s2
            DNA 비밀번호
            문제 해석:
            {A,C,G,T}으로 이루어진 문자열에서 부분 문자열을 뽑을 때 문자의 개수가 특정 개수 이상인 비밀번호 묶음의 갯수는?
            단, 부분 문자열이 등장하는 위치가 다르면 부분 문자열의 내용이 같더라도 다른 문자열로 취급

            예) AAACCTGCCAA > 부분 문자열길이 :4 , {A,C,G,T} {1,1,1,0}
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 문자열길이와 윈도우 길이 입력
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        //DNA 문자열 입력
        String[] dna = br.readLine().split("");

        //ACGT 제한 개수 입력
        st = new StringTokenizer(br.readLine());
        int[] ACGT = new int[4];
        for (int i = 0; i < 4; i++) {
            ACGT[i] = Integer.parseInt(st.nextToken());
        }
        int[] myACGT = new int[4];
        //입력받은 dna 문자열에서 패스워드길이만큼 윈도우로 잘라서 해당 개수만큼 존재하는지 체크
        int start = 0;
        int end = P - 1;
        int count = 0;

        for (int i = start; i <= end; i++) {
            switch (dna[i]) {
                case "A" -> myACGT[0]++;
                case "C" -> myACGT[1]++;
                case "G" -> myACGT[2]++;
                case "T" -> myACGT[3]++;
            }
        }
        while (end < S - 1) {
            // 안전한 패스워드인지 확인
            if (isSafe(myACGT, ACGT)) {
                count++;
            }

            //myACGT 업데이트
            end++;
            switch (dna[end]) {
                case "A" -> myACGT[0]++;
                case "C" -> myACGT[1]++;
                case "G" -> myACGT[2]++;
                case "T" -> myACGT[3]++;
            }
            switch (dna[start]) {
                case "A" -> myACGT[0]--;
                case "C" -> myACGT[1]--;
                case "G" -> myACGT[2]--;
                case "T" -> myACGT[3]--;
            }
            start++;
        }
        //end 가 맨 마지막인 경우 확인
        if (isSafe(myACGT, ACGT)) {
            count++;
        }
        bw.write(count + "");
        bw.flush();
        bw.close();


    }

    public static boolean isSafe(int[] myACGT, int[] ACGT) {
        for (int i = 0; i < 4; i++) {
            if (myACGT[i] < ACGT[i]) {
                return false;
            }
        }
        return true;
    }
}

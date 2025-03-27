package Doit;

import java.io.*;
import java.util.StringTokenizer;

public class Doit_9_DnaPassword {
    public static void solution() throws IOException {
        /*
            Boj_12891_s2
            DNA 비밀번호
            문제 해석:
            {A,C,G,T}으로 이루어진 문자열에서 부분 문자열을 뽑을 때 문자의 개수가 특정 개수 이상인 비밀번호 묶음의 갯수는?
            단, 부분 문자열이 등장하는 위치가 다르면 부분 문자열의 내용이 같더라도 다른 문자열로 취급

            예) AAACCTGCCAA > 부분 문자열길이 :4 , {A,C,G,T} {1,1,1,0}
         */
        /*
        N(DNA 길이) L(부분 문자열의 길이)
        DNA(dna 문자 배열)
        ACGT(문자 규칙의 위한 배열)
        myACGT(부분 문자열에서 사용할 규칙과 비교할 배열)
        for(0~3){
            ACGT[i] = 입력
        }
        int start = 0;
        int end = L - 1;

        초기 윈도우를 만들어서 myACGT를 구성한다
        for(start 부터 end까지){
            switch(DNA[i]){
            A라면 myACGT[0]증가
            C라면 myACGT[1]증가
            G라면 2 인덱스 증가
            T라면 3 인덱스 증가
        }
        while(end < N - 1){
            if myACGT >= ACGT 이라면{
                count증가
            }
             myACGT[DNA[start++]]감소;
             myACGT[DNA[++end]]증가;

        }
        if myACGT >= ACGT 이라면{
                count증가
            }
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        String s = br.readLine();
        String[] DNA = s.split("");

        st = new StringTokenizer(br.readLine());
        int[] myACGT = new int[4];
        int[] ACGT = new int[4];
        for (int i = 0; i < 4; i++) {
            ACGT[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = L - 1;
        int count = 0;

        for (int i = start; i <= end; i++) {
            switch (DNA[i]) {
                case "A" -> myACGT[0]++;
                case "C" -> myACGT[1]++;
                case "G" -> myACGT[2]++;
                case "T" -> myACGT[3]++;
            }
        }

        while (end < N - 1) {
            if (isSafe(myACGT, ACGT)) {
                count++;
            }
            switch (DNA[start++]) {
                case "A" -> myACGT[0]--;
                case "C" -> myACGT[1]--;
                case "G" -> myACGT[2]--;
                case "T" -> myACGT[3]--;
            }
            switch (DNA[++end]) {
                case "A" -> myACGT[0]++;
                case "C" -> myACGT[1]++;
                case "G" -> myACGT[2]++;
                case "T" -> myACGT[3]++;
            }
        }
        if (isSafe(myACGT, ACGT)) {
            count++;
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }

    public static boolean isSafe(int[] myACGT, int[] ACGT) {
        for (int i = 0; i < 4; i++) {
            if (myACGT[i] < ACGT[i]) return false;
        }
        return true;
    }
}

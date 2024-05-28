package Boj6;

import java.io.*;

public class Boj6_4 {
    public static void boj6_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] split = s.split("");
        System.out.println(isPalindrom(split,split.length));

        //bw.flush();
        bw.close();
        br.close();
    }
    public static int isPalindrom(String[] s , int n){
        int check = 1;
        for (int i = 0, j = n - 1 ; i < s.length; i++, j--) {
            if(check == 1 && s[i].equals(s[j])){
                check = 1;
            }
            else check = 0;
        }

        return check;

    }
}

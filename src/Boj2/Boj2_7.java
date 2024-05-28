package Boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Boj2_7 {
    public static void boj2_7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        br.close();
        String[] s = a.split(" ");


        int first = Integer.valueOf(s[0]);
        int second = Integer.valueOf(s[1]);
        int third = Integer.valueOf(s[2]);

        if(first == second){
            if(second == third){
                //3개가 다 똑같을 경우(1번경우)
                System.out.println((10000 + (first*1000)));
            }
            else {
                //첫번째와 두번째가 같을 경우(2번경우)
                System.out.println((1000 + (first*100)));

            }
        }
        else if(first == third){
            // 첫번째와 세번째가 같을 경우(2번경우)
            System.out.println((1000 + (first*100)));
        }
        else {
            if(second == third){
                //두번째와 세번째가 같을 경우(2번경우)
                System.out.println((1000 + (second*100)));
            }
            else{
                // 모두 다 다른 경우(3번경우)
                OptionalInt max = Arrays.stream(s).mapToInt(x -> Integer.parseInt(x)).max();
                System.out.println((max.getAsInt()*100));
            }
        }
    }
}

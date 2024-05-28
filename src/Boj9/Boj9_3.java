package Boj9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj9_3 {
    public static void boj9_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        while( a != -1){
            ArrayList answer = new ArrayList();
            for (int i = 1; i < a; i++) {
                if(a % i == 0)answer.add(i);
            }
            int sum = 0;
            for (int i = 0; i < answer.size(); i++) {
                sum += (int)answer.get(i);
            }

            if(sum == a){
                System.out.print(a + " = ");
                for (int i = 0; i <= answer.size() - 2 ; i++) {
                    System.out.print(answer.get(i)+ " + ");
                }
                System.out.print(answer.get(answer.size() - 1));
            }
            else {
                System.out.print(a + " is NOT perfect.");
            }
            System.out.println();
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
        }
    }
}

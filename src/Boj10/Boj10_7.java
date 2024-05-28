package Boj10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj10_7 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        while(!(a == 0 && b == 0 && c == 0)){
            List<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);

            Collections.sort(list);
            if(list.get(2) < list.get(0) + list.get(1)){
                if( a == b && b == c && c == a) System.out.println("Equilateral");
                else if( a == b || b == c || c == a) System.out.println("Isosceles");
                else System.out.println("Scalene ");
            }else System.out.println("Invalid");

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }
    }
}

package Boj8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8_5 {
    public static void boj8_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;

        while ( n - 1 > 0 ){
            if((y == 1) && (x % 2 == 1)) x++;
            else if((x == 1) && (y % 2 == 0)) y++;
            else if( (x + y) % 2 == 1){
                y++;
                x--;
            }
            else if( (x + y) % 2 == 0){
                y--;
                x++;
            }
            n--;
        }
        System.out.println(y + "/" + x);
    }
}

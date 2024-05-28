package Boj12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(st.nextToken());

        double d = Integer.parseInt(st.nextToken());
        double e = Integer.parseInt(st.nextToken());
        double f = Integer.parseInt(st.nextToken());
        int y = 0;
        int x = 0;
        if(b != 0 && e !=0){
            x = (int) ((b*f - c*e) / (b*d - a*e));
            y = (int) ((-a * x + c) / b);
        }
        else if( a != 0){
            y = (int) ((c * d / a  -f ) / (b * d / a - e));
            x = (int) ((c - b * y )/ a);
        } else if (b != 0){
            x = (int) ((c * e / b - f) / (a * e / b - d));
            y = (int) ((c - a * x )/ b);
        }

        System.out.println(x + " " + y );

    }
}

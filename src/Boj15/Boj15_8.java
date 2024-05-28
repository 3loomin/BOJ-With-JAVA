package Boj15;

import java.io.*;

public class Boj15_8 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.valueOf(br.readLine());
            int[] eratos = Eratos(a);
            int count = 0;
            for (int j = 2; j <=a/2; j++) {
                if(eratos[j] == 0 && eratos[a-j] == 0) count++;
            }
            bw.write(count + "\n" );

        }

        bw.flush();
        bw.close();
    }

    public static int[] Eratos(int a){
        int[] eratos = new int[a + 1];
        eratos[0] = 1;
        eratos[1] = 1;
        for (int i = 2; i * i <= a; i++) {
            if(eratos[i] == 0){
                for (int j = i*i; j <= a ; j+=i) eratos[j] = 1;
            }
        }
        return eratos;
    }
}

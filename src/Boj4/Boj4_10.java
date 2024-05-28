package Boj4;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Boj4_10 {
    public static void boj4_10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Integer i = Integer.valueOf(s);
        String s1 = br.readLine();
        String[] score = s1.split(" ");


        OptionalInt max = Arrays.stream(score).mapToInt(Integer::valueOf).max();

        double[] newScore = new double[i];

        for (int j = 0; j < i; j++) {
            newScore[j] = Double.valueOf(score[j])/max.getAsInt()*100;
        }

        OptionalDouble average = Arrays.stream(newScore).average();
        System.out.println(average.getAsDouble());

        bw.flush();
        bw.close();
        br.close();
    }
}

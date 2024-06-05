package etc;

import java.io.*;

public class Boj_28702 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int answer = 0;
        if (Character.isDigit(s1.charAt(0))) {
            answer = Integer.parseInt(s1) + 3;
            if(answer % 3 == 0 && answer % 5 == 0) bw.write("FizzBuzz");
            else if(answer % 3 == 0) bw.write("Fizz");
            else if(answer % 5 == 0) bw.write("Buzz");
            else bw.write(answer + "");
        }
        else if (Character.isDigit(s2.charAt(0))){
            answer = Integer.parseInt(s2) + 2;
            if(answer % 3 == 0 && answer % 5 == 0) bw.write("FizzBuzz");
            else if(answer % 3 == 0) bw.write("Fizz");
            else if(answer % 5 == 0) bw.write("Buzz");
            else bw.write(answer + "");
        }
        else if (Character.isDigit(s3.charAt(0))){
            answer = Integer.parseInt(s3) + 1;
            if(answer % 3 == 0 && answer % 5 == 0) bw.write("FizzBuzz");
            else if(answer % 3 == 0) bw.write("Fizz");
            else if(answer % 5 == 0) bw.write("Buzz");
            else bw.write(answer + "");
        }


        bw.flush();
        bw.close();
    }
}

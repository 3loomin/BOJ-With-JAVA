package Boj16;

import java.io.*;
import java.util.Stack;

public class Boj16_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        while(!s.equals(".")){
            String[] split = s.split("");
            Stack<String> stack = new Stack<>();
            int check = 0;
            for (int i = 0; i < split.length; i++) {

                if(split[i].equals("(")) stack.push(split[i]);
                else if (split[i].equals("[")) stack.push(split[i]);

                else if(!stack.isEmpty() &&  (split[i].equals(")") || split[i].equals("]"))){
                    if( split[i].equals(")") && stack.get(stack.size() - 1).equals("(")) stack.pop();
                    else if(split[i].equals("]") && stack.get(stack.size() - 1).equals("[")) stack.pop();
                    else check ++;
                }
                else if(stack.isEmpty() &&  (split[i].equals(")") || split[i].equals("]"))) check++;
            }
            bw.write((check == 0 && stack.isEmpty())? "yes" + "\n" : "no" + "\n");
            s = br.readLine();
        }

        bw.flush();
        bw.close();
    }
}

package Boj16;

import java.io.*;
import java.util.Stack;

public class Boj16_5 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> aStack = new Stack<>();
        Stack<Integer> bStack = new Stack<>();

        int n = Integer.valueOf(br.readLine());
        String s = br.readLine();
        String[] split = s.split(" ");

        int check = 0;
        for (int i = split.length - 1; i >= 0; i--) {
            aStack.push(Integer.parseInt(split[i]));
        }
        if (isNice(n,aStack,bStack)) System.out.println("Nice");
        else System.out.println("Sad");

    }
    public static boolean isNice(int n, Stack<Integer> aStack, Stack<Integer> bStack){
        for (int j = 1; j <= n; j++) {
            if (!aStack.isEmpty() && aStack.get(aStack.size() - 1 ) == j ){
                aStack.pop();
                continue;
            }
            else if (!bStack.isEmpty() && bStack.get(bStack.size() - 1) == j){
                bStack.pop();
                continue;
            }

            while(!aStack.isEmpty() && aStack.get(aStack.size() - 1 ) != j){
                bStack.push(aStack.pop());
            }
            if (!aStack.isEmpty() && aStack.get(aStack.size() - 1 ) == j ) aStack.pop();
            else if (!bStack.isEmpty() && bStack.get(bStack.size() - 1) == j) bStack.pop();
            else return false;

        }
        return true;

    }
}

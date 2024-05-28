package Boj6;

import java.io.*;

public class Boj6_6 {
    public static void boj6_6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            //c= , c-
            if(split[i].equals("c")) {
                if(i < split.length - 1) {
                    if(split[i+1].equals("=") || split[i+1].equals("-")) {
                        split[i] = "a";
                        split[i+1] = "0";
                    }
                }
            }
            //dz= , d-
            else if(split[i].equals("d")) {
                if(i < split.length - 1) {
                    if(split[i+1].equals("-")) {
                        split[i] = "a";
                        split[i + 1] = "0";
                    }
                    if(i < split.length - 2){
                        if(split[i+1].equals("z") && split[i+2].equals("=")) {
                            split[i] = "a";
                            split[i + 1] = "0";
                            split[i + 2] = "0";
                        }
                    }
                }
            } // lj
            else if(split[i].equals("l")) {
                if(i < split.length - 1) {
                    if(split[i+1].equals("j")){
                        split[i] = "a";
                        split[i + 1] = "0";
                    }
                }
            } // nj
            else if(split[i].equals("n")) {
                if(i < split.length - 1) {
                    if(split[i+1].equals("j")) {
                        split[i] = "a";
                        split[i + 1] = "0";
                    }
                }
            } // s=
            else if(split[i].equals("s")) {
                if(i < split.length - 1) {
                    if(split[i+1].equals("=")) {
                        split[i] = "a";
                        split[i + 1] = "0";
                    }
                }
            } // z=
            else if(split[i].equals("z")) {
                if(i < split.length - 1) {
                    if(split[i+1].equals("=")) {
                        split[i] = "a";
                        split[i + 1] = "0";
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < split.length; i++) {
            if(split[i]!="0") count++;
        }

        System.out.println(count);

        bw.flush();
        bw.close();
        br.close();
    }
}

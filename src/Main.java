import java.io.*;


public class Main {

    
    public static void main(String[] args) throws IOException {solution();}
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a  = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            bw.write(s.toLowerCase()+"");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}

import java.io.*;


public class Main {

    
    public static void main(String[] args) throws IOException {solution();}
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        while(s!=null){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        bw.flush();
        bw.close();

    }

}

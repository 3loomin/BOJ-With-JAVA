import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        class Boj16{
            int bal;
            int pap;

            public int getBal() {
                return bal;
            }

            public void setBal(int bal) {
                this.bal = bal;
            }

            public int getPap() {
                return pap;
            }

            public void setPap(int pap) {
                this.pap = pap;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        Deque<Boj16> deque = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            Boj16 boj16 = new Boj16();
            int a = Integer.parseInt(st.nextToken());
            boj16.setBal(i);
            boj16.setPap(a);
            deque.add(boj16);
        }

        Boj16 poll1 = deque.poll();
        bw.write(poll1.bal + " ");
        int a = poll1.pap;
        while(deque.size() > 0) {
           if(a > 0){
               for (int i = 1; i < a; i++) {
                   deque.add(deque.poll());
               }
               Boj16 poll = deque.poll();
               a = poll.pap;
               bw.write(poll.bal + " ");
           }
           else if (a < 0) {
               for (int i = 1; i < -a ; i++) {
                   deque.addFirst(deque.pollLast());
               }
               Boj16 boj16 = deque.pollLast();
               a = boj16.pap;
               bw.write(boj16.bal + " ");
           }

        }

        bw.flush();
        bw.close();
    }


}
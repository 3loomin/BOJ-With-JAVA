import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static class Human{
        int weight;
        int height;
        int rank;

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
    }
    public static void main(String[] args) throws IOException {
        solution();

    }

    public static void solution() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        List<Human> list = new ArrayList<>();
        List<Human> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            Human human = new Human(weight, height);
            list.add(human);
            answer.add(human);
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if(list.get(i).weight < list.get(j).weight && list.get(i).height < list.get(j).height)
                    rank++;

            }
            bw.write(rank + " ");
        }


        bw.flush();
        bw.close();
    }


}
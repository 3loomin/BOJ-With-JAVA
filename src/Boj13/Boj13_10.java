package Boj13;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Boj13_10 {
    public static void solution() throws IOException {
        class User {
            String name;
            int age;
            int seq;


            public String getName() {
                return name;
            }
            public int getAge() {
                return age;
            }
            public int getSeq() {
                return seq;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<User> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            User user = new User();
            user.age = age;
            user.name = st.nextToken();
            user.seq = i;
            list.add(user);
        }

        list.sort(Comparator.comparingInt(User::getAge).thenComparing(user -> user.seq));
        for(User user : list) {
            bw.write(user.age + " " + user.name + " " + "\n");
        }
        bw.flush();
    }
}

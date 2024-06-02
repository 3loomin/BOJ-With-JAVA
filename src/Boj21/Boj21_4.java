package Boj21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj21_4 {
    public static int[] arr = null;
    public static List<Integer> answer = new ArrayList<>();
    public static int k = 0;
    public static int[] tmp = null;
    //Main Class

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        tmp = new int[n*2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, arr.length -1, answer);
        bw.write(-1+"");
        bw.flush();
        bw.close();
    }

    public static void merge_sort(int[] A , int p , int r , List<Integer> answer){
        if ( p < r) {
            int q = (p+r)/2;
            merge_sort(A, p, q, answer);
            merge_sort(A, q + 1, r, answer);
            merge(A,p,q,r, answer);
        }
    }

    private static void merge(int[] a, int p, int q, int r, List<Integer> answer) {
        int i = p;
        int j = q + 1;
        int t = 1;
        while(i <= q && j<= r) {
            if(a[i] <= a[j]){
                tmp[t++] = a[i++];

            }
            else{
                tmp[t++] = a[j++];

            }
        }

        while ( i <= q){
            tmp[t++] = a[i++];

        }
        while(j <= r){
            tmp[t++] = a[j++];

        }
        i = p;
        t = 1;
        while(i <= r){
            a[i++] = tmp[t];
            answer.add(tmp[t++]);
            if(answer.size() == k){
                System.out.println(answer.get(answer.size() -1));
                System.exit(0);
            }
        }

    }
}

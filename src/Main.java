import java.io.*;
import java.util.*;

import static java.util.Collections.swap;


public class Main {


    public static void main(String[] args) throws IOException {
        solution();
    }
    public static void solution() throws IOException {
        /*

        안쪽 루프는 1에서 n - j까지, 즉 왼쪽에서 오른쪽으로 이동하면서 swap을 수행한다. 이는 특정 데이터가 안
        쪽 루프에서 swap의 왼쪽으로 이동할 수 있는 최대 거리가 1이라는 뜻이다. 즉, 데이터의 정렬 전 index와
        정렬 후 index를 비교해 왼쪽으로 가장 많이 이동한 값을 찾으면 이 문제를 해결할 수 있다.
         0 1 2 3 4    0 1 2 3 4
        10 1 5 2 3 >> 1 2 3 5 10
        왼쪽으로 가장 많이 이동한놈은  2와 3이 왼쪽으로 2번씩 이동 + 1 = 3
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean change = false;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 2];
        int[] arr_index = new int[n + 2];
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());

        }
//        for(int i = 1; i <= n + 1; i++){
//            change = false;
//            for(int j = 1; j <= n - i; j++){
//                if(arr[j] > arr[j + 1]){
//                    change = true;
//                    mySwap(arr, j, j + 1);
//                }
//            }
//            if(!change){
//                System.out.println(i +"\n");
//                break;
//            }
//        }
        //처음으로 정렬된 상태를 확인하는 코드임.
        int[] diff = new int[n + 2];



    }
    public static void mySwap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}

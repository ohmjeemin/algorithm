package algowithjava.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {

        }else {
            int max =0;
            for(int i=0; i<arr.length; i++){
                if(max < arr[i]) max = arr[i];
            }

        }

    }
}

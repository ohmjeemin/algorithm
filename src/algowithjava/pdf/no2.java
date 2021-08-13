package algowithjava.pdf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        // 배열 넣기
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        int temp;
        for(int i=0; i<2; i++){
            if(arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        // 삼각형 체크
        if(arr[0] + arr[1] >= arr[2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

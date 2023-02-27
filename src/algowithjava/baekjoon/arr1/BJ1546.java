package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//오차 범위가 있기 때문에 반드시 연산할 때 최소한 자료형 1개 이상은 double 형으로 써야한다.
//자동형변환이 되면서 자료형이 큰 쪽으로 (int -> double) 변환이 되기 때문이다.
//이 코드에서 배열과 sum을 double형으로 해줬다.
public class BJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        double[] scoreArray = new double[N];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++) {
            scoreArray[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(scoreArray);

        for(int i=0; i<N; i++){
            sum += ((scoreArray[i] / scoreArray[N-1]) * 100);
        }
        System.out.println(sum/N);
    }
}

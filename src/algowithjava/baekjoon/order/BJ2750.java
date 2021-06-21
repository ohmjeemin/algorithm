package algowithjava.baekjoon.order;
import java.io.*;
import java.util.*;

/*
* 수 정렬하기
* 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
* */
public class BJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<cnt; i++) {
           numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);

        for(int num : numbers) {
            sb.append(num+"\n");
        }
        System.out.println(sb);
    }
}

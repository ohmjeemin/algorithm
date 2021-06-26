package algowithjava.baekjoon.order;

/**
 * 소트인사이드
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면 그 수의 각 자리수를 내림차순으로 정렬하자.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BJ37006 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        char[] arr = N.toCharArray();
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.print(sb);
        br.close();
    }
}

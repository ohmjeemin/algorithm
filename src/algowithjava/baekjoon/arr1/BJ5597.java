package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] studentNumArray = new boolean[31];
        for(int i=0; i<28; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            studentNumArray[studentNum] = true;
        }
        for(int i=1; i<31; i++) {
            if(!studentNumArray[i]) {
                System.out.println(i); //StringBuilder 만들어서 하는 것보다 바로 출력하는 게 더 ..메모리랑 시간을 절약한다..
            }
        }
    }

}

package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<loopCnt; i++) {
            if(Integer.parseInt(numArr[i]) == target) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}

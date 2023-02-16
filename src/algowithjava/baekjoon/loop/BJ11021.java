package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loopCnt = Integer.parseInt(br.readLine());
        for(int i=1; i<=loopCnt; i++) {
            //Case #1: 2
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            sb.append("Case #"+i+": ").append(a+b+"\n");
        }
        System.out.println(sb);
    }
}

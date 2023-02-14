package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BJ10950 {
    //test
    public void main(String[] args) throws IOException {

        Calc c = new Calc();
        c.getLoopCnt();
        System.out.println(c.loop());
    }
    class Calc {
        public BufferedReader br;
        public StringBuilder sb;
        public int T;

        //입력 받기
        public void getLoopCnt() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            T = Integer.parseInt(br.readLine());
        }
        //계산하기
        public StringBuilder loop() throws IOException {
            for(int i=0; i<T; i++) {
                String[] lineArr =  br.readLine().split(" ");
                int a = Integer.parseInt(lineArr[0]);
                int b = Integer.parseInt(lineArr[1]);
                sb.append(a+b+"\n");
            }
            return sb;
        }

    }
}

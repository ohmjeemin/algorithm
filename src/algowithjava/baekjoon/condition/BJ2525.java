package algowithjava.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        int timeH = time / 60;
        int timeM = time % 60;

        M += timeM;
        if(M >= 60) {
            H += 1;
            M -= 60;
        }
        H += timeH;
        H = H % 24;

        System.out.println(H+" "+M);
    }
}

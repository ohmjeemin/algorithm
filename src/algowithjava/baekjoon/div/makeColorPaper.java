package algowithjava.baekjoon.div;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeColorPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] paper = new int[cnt][cnt];

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cnt; i++) {
            sb.append(br.readLine());
        }

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt; j++) {
                System.out.println(paper[i][j]+" ");
            }
        }



    }
}

package algowithjava.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            time[i][1] = Integer.parseInt(st.nextToken()); //종료시간
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) { //종료시간이 같으면
                    return o1[0] - o2[0]; //시작시간이 빠른순으로
                }
                return o1[1] - o2[1]; //아니면 종료시간이 빠른순으로
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for(int i = 0; i < n; i++) {
            //직전 종료시간이 다음 회의 시작 시간보다 작거나 같으면 갱신
            if(prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count ++;
            }
        }
        System.out.println(count);
    }
}

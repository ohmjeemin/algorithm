package algowithjava.programmers.level1;

import java.util.*;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0; i<2; i++){
            if(min > arr[i+1]) {
                min = arr[i+1];
            }
        }
        System.out.println(min);
    }
}

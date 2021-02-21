package algowithjava.codeup.basic;

import java.util.*;

public class ArrQ1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input;
        int[] arr=  new int[23];

        for(int i=0; i<n; i++) {
            //System.out.println(n-i+"만큼 더 입력하세오!");
            input = sc.nextInt();
            arr[input-1] = arr[input-1] + 1;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}

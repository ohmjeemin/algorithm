package algowithjava.codeup.basic;

import java.util.Scanner;

public class Arr03 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input;
        int[] arr=  new int[n];

        for(int i=0; i<n; i++) {
            //System.out.println(n-i+"만큼 더 입력하세오zz!");
            input = sc.nextInt();
            arr[i] = input;
        }

        int num=arr[n-1];
        for(int j=n-2; j>0; j--) {
            num = Math.min(num, arr[j]);
        }
        System.out.println(num);
    }
}

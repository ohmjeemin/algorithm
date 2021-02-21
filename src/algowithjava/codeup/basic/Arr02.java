package algowithjava.codeup.basic;

import java.util.Scanner;

public class Arr02 {
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

        for(int i=n-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}

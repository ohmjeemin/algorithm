package algowithjava.inflearn.ch1;

import java.util.Scanner;

public class Main3 {
    public String solution(String str) {
        String[] arr = str.split(" ");
        int maxIdx = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1].length() < arr[i].length()) {
                maxIdx = i;
            }
        }

        return arr[maxIdx];
    }

    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        System.out.print(main.solution(str));
    }
}


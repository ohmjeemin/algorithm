package algowithjava.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String str: strArr) {
            char[] arr = str.toCharArray();
            String result = "";
            for(int i=arr.length-1; i>=0; i--) {
                result += arr[i];
            }
            answer.add(result);
        }
        return answer;
    }

    public static void main(String[] args){
        Main4 main = new Main4();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] strArr = new String[n];

        for(int i=0; i<n; i++) {
           strArr[i] = in.next();
        }

        for(String x: main.solution(n, strArr)) {
            System.out.println(x);
        }

    }
}


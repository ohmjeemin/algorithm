package algowithjava.inflearn.ch1;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";
        str=str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            String t = String.valueOf(str.charAt(i)).toUpperCase();
            if(t.equals(String.valueOf(str.charAt(i)))) {
                sb.append(t.toLowerCase());
            }else {
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }

        return sb.toString();
    }
    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner in=new Scanner(System.in);
        String str = in.next();

        System.out.print(main.solution(str));
    }
}

package algowithjava.inflearn.ch1;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for(char x: str.toCharArray()) {
            String u = String.valueOf(x).toUpperCase();
            if(u.equals(String.valueOf(x))) {
                sb.append(u.toLowerCase());
            }else {
                sb.append(String.valueOf(x).toUpperCase());
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

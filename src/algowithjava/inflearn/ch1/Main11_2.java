package algowithjava.inflearn.ch1;

import java.util.*;


/*
* 문자열 압축
* 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를
* 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오
* 단 반복횟수가 1인 경우 생략합니다.
* */
public class Main11_2 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s=s+" ";
        int cnt=1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt ++;
            else {
                answer.append(s.charAt(i));
                if(cnt>1) answer.append(cnt);
                cnt=1;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Main11_2 main = new Main11_2();
        Scanner in = new Scanner(System.in);
        String s = in.next(); //문자열
        System.out.print(main.solution(s));
    }
}


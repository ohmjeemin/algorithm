package algowithjava.inflearn.ch1;

import java.util.*;


/*
* 문자열 압축
* 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를
* 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오
* 단 반복횟수가 1인 경우 생략합니다.
* */
public class Main11 {
    public String solution(String s) {

        List<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        int cnt =0;
        for(int i=0; i<s.toCharArray().length; i++){
            if(s.indexOf(s.charAt(i)) == i) {
                list.add(s.charAt(i));
                map.put(s.charAt(i), 1);
            } else {
                if(map.get(s.charAt(i))!=null) cnt = map.get(s.charAt(i)) + 1;
                else cnt = 1;
                map.put(s.charAt(i), cnt);
            }
        }
        Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()) {
            Map.Entry<Character, Integer> entrySet = (Map.Entry<Character, Integer>) it.next();
            sb.append(entrySet.getKey());
            if(entrySet.getValue()!=1) sb.append(entrySet.getValue());
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Main11 main = new Main11();
        Scanner in = new Scanner(System.in);
        String s = in.next(); //문자열
        System.out.print(main.solution(s));

    }
}


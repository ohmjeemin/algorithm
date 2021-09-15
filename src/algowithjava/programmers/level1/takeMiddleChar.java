package algowithjava.programmers.level1;

public class takeMiddleChar {
    //그냥 한거
    public static String solution(String s) {
        String answer = "";
        if(s.length()%2==0) { answer = String.valueOf(s.toCharArray()[s.length()/2-1]); }
        return answer += String.valueOf(s.toCharArray()[s.length()/2]);
    }
    //두번째로
    public static String solution2(String s) {
        return s.length()%2==0 ? s.substring(s.length()/2-1, s.length()/2+1) : s.substring(s.length()/2, s.length()/2+1);
    }
    public static void main(String[] args){
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

}

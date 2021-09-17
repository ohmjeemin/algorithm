 package algowithjava.programmers.level1;

public class addString {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }
//    1번째
//    public static int solution(int n) {
//        char[] arr = String.valueOf(n).toCharArray();
//        int answer = 0;
//        for(int i=0; i< arr.length; i++) {
//            answer += Integer.parseInt(Character.toString(arr[i]));
//        }
//        return answer;
//    }
//   2번째
//    public static int solution(int n) {
//        String[] arr = String.valueOf(n).split("");
//        int answer = 0;
//        for(int i=0; i< arr.length; i++) {
//            answer += Integer.parseInt(arr[i]);
//        }
//        return answer;
//    }
//    3번째
    public static int solution(int n) {
        int answer = 0;
        while(true) {
            answer += n % 10;
            if(n < 10) break;
            n = n / 10;
        }
        return answer;
    }

}

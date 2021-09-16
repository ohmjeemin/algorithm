 package algowithjava.programmers.level1;

public class addString {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }
    public static int solution(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int answer = 0;
        for(int i=0; i< arr.length; i++) {
            answer += arr[i];
            System.out.println(answer);
        }
        return answer;
    }
}

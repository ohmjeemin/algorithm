package algowithjava.pdf;
import java.util.*;


public class no4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N;
        //1 for문을 이용한
//        for(int i=1; i<=N; i++){
//            sum += i;
//        }
        while(--N>0) {
            sum += N;
        }
        System.out.print(sum);
    }
}

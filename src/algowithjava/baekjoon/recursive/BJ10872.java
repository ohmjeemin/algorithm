package algowithjava.baekjoon.recursive;
import java.util.*;

public class BJ10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 0;
        result = fac(input);
        System.out.println(result);
    }
    public static int fac(int n){
        if(n<=1) return 1;
        return n * fac(n-1);
    }
}

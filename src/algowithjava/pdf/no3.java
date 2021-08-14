package algowithjava.pdf;

import java.util.*;
public class no3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if(N % 12 > 0) {
            System.out.println(N / 12 + 1);
        }else {
            System.out.println(N / 12);
        }
    }
}

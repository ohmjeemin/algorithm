package algowithjava.codeup.basic;
import java.util.*;
public class PrintNoThree {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n+1; i++){
            if(i%3!=0) {
                System.out.print(i+ " ");
            }
        }
    }
}

package algowithjava.codeup.basic;
import java.util.*;

public class NoMoreAdd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n+1; i++){
            sum+=i;
            if(sum>=n){
                System.out.println(sum);
                return;
            }
        }

    }
}

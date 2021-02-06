package algowithjava.programmers.level1;//같은 숫자는 싫어
import java.util.*;

public class RemoveDuplNum {
    public int[] solution(int []arr) {
        int[] answer = {};
        int count = 1;
        int index = 1;
        
        for(int i=0; i<arr.length-1; i++){
          if (arr[i] != arr[i+1]) count ++;
        }
        
        answer = new int[count];     
        answer[0]=arr[0];
            
        for(int j=1; j<arr.length; j++){
                if(answer[index-1]!=arr[j]){
                  answer[index]=arr[j];
                  index++;
                 }
         }
        return answer;
    }
    
}
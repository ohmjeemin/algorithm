package algowithjava.programmers.level1;

//두 정수 사이의 합
class AddTwoInt {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a==b) return a;
        int big = Math.max(a,b);
        int small = Math.min(a,b);
         
        for(int i=small; i<=big; i++){
          answer+=i;  
        }
        
         return answer;     
        }       
    }
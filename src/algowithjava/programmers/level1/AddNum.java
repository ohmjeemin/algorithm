package algowithjava.programmers.level1;

class AddNum {
    public int solution(int n) {
        int answer = 0;
       
        if(n!=0){
          for(int i=1; i<n+1; i++){
            if(n%i == 0) answer+=i;
           } 
       }
        return answer;
    }
}
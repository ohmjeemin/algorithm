package algowithjava.programmers.level1;

class MakeOnlyNumber {
    public boolean solution(String s) {
        boolean answer = false;
        System.out.println(s.length());
        if(s.length()==4 || s.length()==6){
            
            if(s.matches("^[0-9]*$")){
                answer = true;
            }
        }      
    
        return answer;
    }
}

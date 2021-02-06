package algowithjava.programmers.level1;

//문자열 내 p와 y의 개수
class CountPY {
    boolean solution(String s) {
        
        int pCount = 0;
        int yCount = 0;
       
        s=s.toUpperCase();
        char[] cArr =s.toCharArray();
        
        for(int i=0; i<cArr.length; i++){
            if(cArr[i]=='P') pCount++;
            if(cArr[i]=='Y') yCount++;
        }
        
       
         return (pCount==yCount)?true:false;
    }
}
package corejava9;

public interface IntSequence {
    boolean hasNext();
    int next();

    int getAge();

    boolean isOlder(int age);

    //인터페이스도 기본 메서드를 가질 수 있다.
    default boolean getMessaged() { return true; }

    //인터페이스의 메서드로도 average 메서드를 구현할 수 있다.
    static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while(seq.hasNext() && count < n){
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }
}

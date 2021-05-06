package corejava9;

public abstract class Seq implements IntSequence{

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public boolean isOlder(int age) {
        return false;
    }
}

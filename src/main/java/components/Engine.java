package components;

public class Engine {
    private int bhp;
    private int size;

    public Engine(int bhp, int size) {
        this.bhp = bhp;
        this.size = size;
    }

    public int getBhp() {
        return bhp;
    }

    public int getSize() {
        return size;
    }
}

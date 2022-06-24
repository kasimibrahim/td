package ocean;

public class Submarine {
    private int horizontal = 0;
    private int vertical = 0;


    public void move(int horizontal, int  vertical) {
        this.horizontal += horizontal;
        this.vertical += vertical;
    }

    public int[] getPosition(){
        return new int[]{this.horizontal, this.vertical};
    }
}

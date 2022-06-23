package ocean;

public class Submarine {
    private final int horizontal = 0;
    private final int vertical = 0;

    private final int[] position = new int[]{this.horizontal, this.vertical};


    public void move(int horizontal, int  vertical) {
        this.position[0] += horizontal;
        this.position[1] += vertical;
    }

    public int[] getPosition(){

        return position;
    }
}

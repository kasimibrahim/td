import ocean.Submarine;
import org.junit.Assert;
import org.testng.annotations.Test;


public class SubMarineTest {
    Submarine floater = new Submarine();
    @Test
    public void canMoveHorizontally(){

        floater.move(2,0);
        floater.move(2,0);
        Assert.assertEquals(4,floater.getPosition()[0]);
    }

    @Test
    public void canMoveVertically() {
        floater.move(0, 4);
        System.out.println(floater.getPosition()[1]);
        Assert.assertEquals(4, floater.getPosition()[1]);
    }


}

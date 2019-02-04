import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canDrinkWater(){
        waterBottle.drinkWater(10);
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}

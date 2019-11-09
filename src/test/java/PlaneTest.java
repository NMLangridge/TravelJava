import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA320);
    }

    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.AIRBUSA320, plane.getPlane());
    }

    @Test
    public void planeHasCapacity() {
        plane = new Plane(PlaneType.AIRBUSA320);
        assertEquals(10, plane.getCapacityFromEnum());
    }

    @Test
    public void planeHasTotalWeight() {
        plane = new Plane(PlaneType.BOEING777);
        assertEquals(300, plane.getTotalWeightFromEnum());
    }

}

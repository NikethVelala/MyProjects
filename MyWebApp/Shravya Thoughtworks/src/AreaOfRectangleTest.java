import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaOfRectangleTest {
    @Test
    public void areaOfRectangle(){
        Rectangle r=new Rectangle(10,20);
        assertEquals(200,r.area());
    }
}

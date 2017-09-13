import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void squareTest(){

        Square s = mock(Square.class);

        when(s.getX1()).thenReturn(0);
        when(s.getY1()).thenReturn(0);
        when(s.getX2()).thenReturn(0);
        when(s.getY2()).thenReturn(5);
        when(s.getX3()).thenReturn(5);
        when(s.getY3()).thenReturn(5);
        when(s.getX4()).thenReturn(5);
        when(s.getY4()).thenReturn(0);

        SquareInfo info = new SquareInfo();
        assertTrue(info.check(s));

    }
}

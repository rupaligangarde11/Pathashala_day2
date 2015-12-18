import org.junit.Assert;
import org.junit.Test;

//import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LineLengthTest {

    @Test
    public void lineWithLengthZero() {
        Line line = new Line(new Point(0,0), new Point(0,0));
        assertEquals(0.0, line.length(),0);
    }

    @Test
    public void lineWithLengthOne(){

        Line line = new Line(new Point(1,0), new Point(1,1));
        assertEquals(1.0, line.length(),0);
    }

   @Test
    public void lineWithLengthEight(){
       Line line = new Line(new Point(0,0), new Point(0,0));
       assertEquals(0.0, line.length(),0);
    }

    @Test
    public void checkCoordinatesOfTwoLinesAreSame(){
        Line line1 = new Line(new Point(4,5), new Point(8,7));
        Line line2 = new Line(new Point(4,5), new Point(8,7));
        assertTrue(line1.equals(line2));
    }

    @Test
    public void checkCoordinatesOfTwoLinesAreReversed(){
        Line line1 = new Line(new Point(4,5), new Point(8,7));
        Line line2 = new Line(new Point(8,7), new Point(4,5));
        assertTrue(line1.equals(line2));
    }
}

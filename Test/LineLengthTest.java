import org.junit.Assert;
import org.junit.Test;

//import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LineLengthTest {

    @Test
    public void lineWithLengthZero() {
        Point point1 = new Point(0.0,0.0);
        Point point2 = new Point(0.0,0.0);

        Line line = new Line(point1,point2);
        double length = line.length();
        assertEquals(0.0,length,0);
    }

    @Test
    public void lineWithLengthOne(){
       Line line = new Line(3,0,4,0);
        assertEquals(1.0,line.length(),0);
    }

   @Test
    public void lineWithLengthEight(){
        Line line=new Line(5,4,-1,-1);
        assertEquals(8.0,line.length(),0);
    }

    @Test
    public void checkIfLineHasNegativeLength(){
       Line line=new Line(-4,-5,0,6);
        assertTrue(line.length() > 0);
    }
    @Test
    public void checkCoordinatesOfTwoLinesAreSame(){
        Line line1=new Line(4,5,8,7);
        Line line2=new Line(4,5,8,7);
        Line line3 = new Line(4,5,8,7);
        Line line4 = new Line(8,7,4,5);
        assertTrue(line1.isEqual(line2));
        assertTrue(line4.isEqual(line3));
    }

}

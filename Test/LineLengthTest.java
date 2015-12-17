import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineLengthTest {

    @Test
    public void lineWithLengthZero() {
        Line line = new Line(0,0,0,0);
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
        assertEquals(true,line.length()>0);
    }
    @Test
    public void checkCoordinatesOfTwoLinesAreSame(){
        Line line1=new Line(4,5,8,7);
        Line line2=new Line(4,5,8,7);
        Line line3 = new Line(4,5,8,7);
        Line line4 = new Line(8,7,4,5);
        assertEquals(true,line1.isequal(line2));
        assertEquals(true,line3.isequal(line4));
    }
}

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
    public void lineWithLengthSix(){
        Line line=new Line(4,8,1,3);
        assertEquals(6.0,line.length(),0);
    }

    @Test
    public void checkIfLineHasNegativeLength(){
       Line line=new Line(-4,-5,0,6);
        assertEquals(true,line.length()>0);

    }
}

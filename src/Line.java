import java.awt.*;

public class Line {
    private  Point point2;
    private  Point point1;


    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Point point1, Point point2) {
        this.point1=point1;
        this.point2=point2;

    }

    public double length() {
        double distance;
        double xDIff = point1.Xdiff(point2);
        double yDiff = point1.Ydiff(point2);
        distance=Math.sqrt((xDIff * xDIff) + (yDiff * yDiff));
        return Math.ceil(distance);
    }

    public boolean isEqual(Line line2) {
        if(isXCoordinateEqual(this.x1,this.x2,line2.x1,line2.x2)&&isYCoordinateEqual(this.y1,this.y2,line2.y1,line2.y2))
            return true;
        return false;
    }

    public boolean isXCoordinateEqual(int line1_x1,int line1_x2,int line2_x1,int line2_x2){
        if((line1_x1==line2_x1)&& (line1_x2==line2_x2)||((line1_x1==line2_x2)&&(line2_x1==line1_x2)))
            return true;
        return false;
    }

    public boolean isYCoordinateEqual(int line1_y1,int line1_y2,int line2_y1,int line2_y2){
        if((line1_y1==line2_y1)&& (line1_y2==line2_y2)||((line1_y1==line2_y2)&&(line2_y1==line1_y2)))
            return true;
        return false;
    }

}

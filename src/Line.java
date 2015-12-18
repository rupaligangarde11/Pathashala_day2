public class Line {
    private  Point point2;
    private  Point point1;


    public Line(Point point1, Point point2) {
        this.point1=point1;
        this.point2=point2;

    }

    public double length() {
        return this.point1.length(this.point2);
    }

    public boolean equals(Object obj) {
        Line that=(Line)obj;
        return (this.point1.equals(that.point1)&&(this.point2.equals(that.point2))
                ||(this.point1.equals(that.point2)
                &&(this.point2.equals(that.point1))));

    }
}

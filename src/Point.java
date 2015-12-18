public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x=x;
        this.y =y;
    }
    public double Xdiff(Point that)
    {
        return(this.x-that.x);
    }
    public double Ydiff(Point that)
    {
        return(this.y-that.y);
    }
}

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x=x;
        this.y =y;
    }


    @Override
    public boolean equals(Object obj) {
        Point that=(Point)obj;
        return((this.x==that.x)&&(this.y==that.y));
    }
    public double length(Point that) {
        double distance;
        distance=Math.sqrt(Math.pow((this.x-that.x),2) + Math.pow((this.y - that.y),2));
        return Math.ceil(distance);
    }
}

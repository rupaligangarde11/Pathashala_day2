public class Line {
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

    public double length() {
        double distance;
        int xDIff = x2 - x1;
        int yDiff = y2 - y1;
        distance=Math.sqrt((xDIff * xDIff) + (yDiff * yDiff));
        return Math.ceil(distance);
    }
}

package pl.recompiled.demo.point;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        }
        return false;
    }

}

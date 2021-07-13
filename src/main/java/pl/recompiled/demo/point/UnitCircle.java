package pl.recompiled.demo.point;

import java.util.HashSet;
import java.util.Set;

public class UnitCircle {

    private final Set<Point> points;

    public UnitCircle(int x, int y) {
        this.points = new HashSet<>();
        this.points.add(new Point(x, y + 1));
        this.points.add(new Point(x, y - 1));
        this.points.add(new Point(x + 1, y));
        this.points.add(new Point(x - 1, y));
    }

    public boolean contains(Point point) {
        return this.points.contains(point);
    }

}

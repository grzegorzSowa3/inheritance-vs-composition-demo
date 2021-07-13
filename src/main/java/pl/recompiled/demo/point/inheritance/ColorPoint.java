package pl.recompiled.demo.point.inheritance;

import pl.recompiled.demo.point.Color;
import pl.recompiled.demo.point.Point;

import java.util.Objects;

class ColorPoint extends Point {

    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ColorPoint other) {
            return super.equals(other) && this.color == other.color;
        }
        if (o instanceof Point other) {
            return super.equals(other);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}

package pl.recompiled.demo.point.composition;

import pl.recompiled.demo.point.Color;
import pl.recompiled.demo.point.Point;

class ColorPoint {

    private Point point;
    private Color color;

    public Point asPoint() {
        return this.point;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ColorPoint other) {
            return this.point.equals(other.point) && this.color.equals(other.color);
        }
        return false;
    }

}

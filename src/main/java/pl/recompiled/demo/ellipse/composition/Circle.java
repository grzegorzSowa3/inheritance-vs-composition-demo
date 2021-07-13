package pl.recompiled.demo.ellipse.composition;

import pl.recompiled.demo.ellipse.AreaCalculable;
import pl.recompiled.demo.ellipse.Ellipse;

public class Circle implements AreaCalculable, Scalable {

    private final Ellipse ellipse;

    public Circle(float r) {
        this.ellipse = new Ellipse(r, r);
    }

    public void increaseR(float dr) {
        this.ellipse.increaseR1(dr);
        this.ellipse.increaseR2(dr);
    }

    public float getR() {
        return this.ellipse.getR1();
    }

    @Override
    public double area() {
        return ellipse.area();
    }

    @Override
    public void scale(int factor) {
        this.increaseR(this.ellipse.getR1() * 2);
    }

}

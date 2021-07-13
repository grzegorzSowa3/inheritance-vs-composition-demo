package pl.recompiled.demo.ellipse.inheritance;

import pl.recompiled.demo.ellipse.Ellipse;

class Circle extends Ellipse {

    public Circle(float r) {
        super(r, r);
    }

    @Override
    public double area() { // area makes sense
        return super.area();
    }

    @Override
    public void increaseR1(float dr) {
        // increaseR1 doesn't make any sense on circle
        super.increaseR1(dr);
        // u can simultaneously increase r2 but it breaks Liskov substitution principle
        super.increaseR2(dr);
    }

    @Override
    public void increaseR2(float dr) {
        super.increaseR1(dr);
        super.increaseR2(dr);
    }
}

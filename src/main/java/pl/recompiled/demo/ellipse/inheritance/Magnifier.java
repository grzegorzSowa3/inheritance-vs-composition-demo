package pl.recompiled.demo.ellipse.inheritance;

import pl.recompiled.demo.ellipse.Ellipse;

public class Magnifier {

    public void magnify(Ellipse ellipse) {
        ellipse.increaseR1(ellipse.getR1() * 2);
        ellipse.increaseR2(ellipse.getR2() * 2);
    }

}

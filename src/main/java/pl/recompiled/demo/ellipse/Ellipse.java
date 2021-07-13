package pl.recompiled.demo.ellipse;

public class Ellipse {

    private float r1;
    private float r2;

    public Ellipse(float r1, float r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void increaseR1(float dr) {
        this.r1 = this.r1 + dr;
    }

    public void increaseR2(float dr) {
        this.r2 = this.r2 + dr;
    }

    public double area() {
        return Math.PI * r1 * r2;
    }

    public float getR1() {
        return r1;
    }

    public float getR2() {
        return r2;
    }

}

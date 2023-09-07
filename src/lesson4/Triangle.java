package src.lesson4;

public class Triangle implements IShape{


    private double  a;
    private  double b;
    private  double c;
    private  double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5*a*h;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String getName() {
        return "triagle";
    }
}

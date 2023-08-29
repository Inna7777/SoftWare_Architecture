package lesson1.ModelElements;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Flash() {
        this.location = new Point3D(0, 0, 0);
        this.angle = new Angle3D(0, 0, 0);
        this.color = null;
        this.power = null;
    }

    public void rotate(Angle3D angle) {
        this.angle.add(angle);
    }

    public void move(Point3D direction) {
        this.location.add(direction);
    }
}
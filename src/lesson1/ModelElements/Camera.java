package lesson1.ModelElements;

public class Camera {

    public lesson1.ModelElements.Point3D location;
    public Angle3D angle;


    public Camera(Point3D location, Angle3D angle){
        this.location = location;
        this.angle = angle;
    }
    public void rotate(Angle3D angle) {
        this.angle.add(angle);
    }
    public void move(Point3D location){
        this.location.add(location);

    }


}

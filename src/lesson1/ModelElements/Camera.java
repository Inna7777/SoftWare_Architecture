package lesson1.ModelElements;

//класс Camera, который описывает камеру в трехмерном пространстве.
// Класс содержит свойства location и angle, которые представляют положение камеры

public class Camera {

    public lesson1.ModelElements.Point3D location;
    public Angle3D angle;


    public Camera(Point3D location, Angle3D angle){
        this.location = location;
        this.angle = angle;
    }


    // Методы rotate() и move() - изменять угол поворота и положение камеры.
    public void rotate(Angle3D angle) {
        this.angle.add(angle);
    }
    public void move(Point3D location){
        this.location.add(location);

    }


}

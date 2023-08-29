package lesson1.ModelElements;
//  Kласс Point3D отображает  точку в трехмерном пространстве.
//  Класс инициализирует  x, y и z,
//  которые представляют координаты точки по осям x, y и z.

public class Point3D {
    private double x;
    private double y;
    private double z;
    //  Конструктор класса принимает параметры x, y и z,
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void add(Point3D point){
        this.x += point.x;
        this.y += point.y;
        this.z += point.z;
    }

}

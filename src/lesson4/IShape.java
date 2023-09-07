package src.lesson4;
//интерфейс для геометрических фигур

public interface IShape {

    //Площадь фигуры
    public  double getArea();
    //Периметр фигуры
    public  double getPerimeter();

    public String getName();
}

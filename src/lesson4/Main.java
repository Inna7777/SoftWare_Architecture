package src.lesson4;

public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = GeometryFigure.getInstance();
        System.out.println(figureBox);
        //Проверяем действительно-ли у нас создан только один экземпляр класса GeometryFigure-паттерн Singleton
        GeometryFigure figureBox2 = GeometryFigure.getInstance();
        System.out.println(figureBox2);
        System.out.println();

        Circle circle1 = new Circle(10);
        figureBox.add(circle1);
        figureBox.getInfo(0);
        Circle circle3 = new Circle(13);
        figureBox.add(circle3);
        figureBox.getInfo(1);
        figureBox.remove(circle3);

        figureBox.getInfo(1);
        figureBox.add(circle3);
        System.out.println(figureBox.find(2));

        Triangle triangle1 = new Triangle(3,4,5,3);
        figureBox.add(triangle1);
        figureBox.getInfo(2);

        Rectangle rectangle1 = new Rectangle(5,6);
        figureBox.add(rectangle1);
        figureBox.getInfo(3);

    }
}

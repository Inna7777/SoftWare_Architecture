package src.lesson3;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "red", "heshback", "бензин", "auto", 4, 2.5, false);
        Toyota mycar2 = new Toyota("Prado", "red", "heshback", "бензин", "auto", 3, 2.5, false);
        Camaz camaz = new Camaz("Prado", "red", "heshback", "бензин", "auto", 3, 2.5, false);
        camaz.isLight_on(true);
        mycar2.isLight_on(true);
        FlyCar mycarFly = new FlyCar("Fly1", "456", "red", "heshback", "бензин", "auto", 3, 2.5, false);

        mycarFly.movement(); //вызов метода из класса Car
        mycarFly.fly(); //вызов метода из класса FlyCar
        //Проверка принципа LSP -объекты дочерних классов должны быть полностью совместимы с объектами родительского класса.
        // Если при вызове метода test мы заменим объект класса Car на объект класса FlyingCar, то программа должна  работать корректно cо всеми объектами.
        Car car = new Car("F", "0", "n", "n", "n", "n", 4, 2.5, false);
        test(car);
        test(mycarFly);

        // Проверка принципа ISP. Данный метод не можен быть реализован, тк. машина Toyotа не имеет метода подметать улицы
        //System.out.println(mycar.isSweepingStreet(true));
        //Этот метод реализуется потому что Камаз имеет метод подметать улицы унаследованый от интерфейса ISwwep
        System.out.println(camaz.isSweepingStreet(true));

        camaz.wipingWindshield();
        toyota.wipingWindshield();

        //Проверка принципа DIP
        // При заправке объекты классов Toyota и Camaz зависят только от интерфейса IGasStation
        toyota.refueling("дизель");
        camaz.refueling("дизель");

    }

    public static void test(Car car) {
        car.cargo();
    }
}


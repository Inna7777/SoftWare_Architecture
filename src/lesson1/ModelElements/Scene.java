package lesson1.ModelElements;
// класс Scene описывает сцену в трехмерном пространстве.
// Класс содержит свойства id, models и flashes,

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;

    // Конструктор класса принимает параметры id, models и flashes, которые используются для инициализации свойств объекта.
    public Scene(int id, PoligonalModel models, Flash flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;

    }

    // методы работы с моделями
   /* public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }*/
}




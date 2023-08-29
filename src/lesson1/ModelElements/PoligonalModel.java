package lesson1.ModelElements;
//  класс PoligonalModel описывает полигональную модель.
// содержит свойства polygons и texture.

public class PoligonalModel {
    public Poligon polygons;
    public Texture texture;
// Конструктор класса принимает параметры polygons и texture.
    public PoligonalModel(Poligon polygons) {
        this.polygons = polygons;
        this.texture = texture;
    }
}


package src.lesson4;


import java.util.ArrayList;
import java.util.List;
//паттерн Singleton

public class GeometryFigure {
    private static GeometryFigure singletonFigure;

      private static List<IShape> toolbox;
        private GeometryFigure() {
        toolbox = new ArrayList<>();
    }

    //метод возвращает единственный экземпляр класса GeometryFigure
        public static GeometryFigure getInstance() {
            if (singletonFigure == null) { // если экземпляр класса не создан
                singletonFigure = new GeometryFigure();
                return singletonFigure;//создай
            }
            return singletonFigure; //возвращаем единственный экземпляр класса
        }


    //Метод для добавления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }

    //Метод для удаления новой фигуры
    public void  remove(IShape figure){
        toolbox.remove(figure);
    }


    //Метод поиска фигуры
    public IShape find(int num){
        if(num >= toolbox.size()){
            return null;
        } else
            return  toolbox.get(num);
    }

    //Метод отображения информации о фигуре

    public void getInfo(int num){
        IShape figure = find(num);
        if( figure != null ){
            System.out.println(figure.getName()+":  "+"S="+figure.getArea()+"    "+"P="+ figure.getPerimeter());
        }else {
            System.out.println("Фигуры нет");
        }

        }


}

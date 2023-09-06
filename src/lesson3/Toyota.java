package src.lesson3;


//Создать конкретный автомобиль путём наследования класса «Car».
public class Toyota extends Car implements IGasStation, IWiping{


    boolean is_versicale =false;
    public Toyota( String model, String color, String exter, String fluel_type, String control, int num_wheells, double vol_ege, boolean light_on) {
        super("Toyta", model, color, exter, fluel_type, control, num_wheells, vol_ege, light_on);
    }

    //Методы унаследованные от родительского класса

    @Override
    public void isLight_on(boolean light_on) {
        System.out.println("Фары выключены");;
    }

    @Override
    public void cargo() {
        System.out.println("Мах груз 200кг");
    }


    //метод интерфейса IGasStation
    @Override
    public void refueling(String fuel) {
        if(fuel.equalsIgnoreCase("бензин")) {
            System.out.println("Машина заправлена");
        }else {
            System.out.println("Этим топливом машину нельзя заправлять");
        }

    }

    @Override
    public void wipingWindshield() {
        System.out.println("Стекло чистое");

    }
}

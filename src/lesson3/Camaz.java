package src.lesson3;

public class Camaz extends Car implements ISweep, IGasStation, IWiping{


    public Camaz( String model, String color, String exter, String fluel_type, String control, int num_wheells, double vol_ege, boolean light_on) {
        super("Camaz", model, color, exter, fluel_type, control, num_wheells, vol_ege, light_on);
    }

    //метод подметания улиц имплементированный от интерфейса
    @Override
    public boolean isSweepingStreet(boolean isSweeping) {
        return true;
    }

    //метод протирки стекла имплементированный от интерфейса IWiping
    @Override
    public void wipingWindshield() {
        System.out.println("Протерли лобовое стекло");

    }

    //метод включения фар унаследованый от родительского  класса
    @Override
    public void isLight_on(boolean light_on) {
        System.out.println("Фары включены");
    }


    //метод перевозки груза унаследованый от родительского  класса
    @Override
    public void cargo() {
        System.out.println("Грузовик загружен");
    }


    @Override
    public void refueling(String fuel) {
        if(fuel.equalsIgnoreCase("дизель")) {
            System.out.println("Машина заправлена");
        }else {
            System.out.println("Этим топливом машину нельзя заправлять");
        }
    }
}

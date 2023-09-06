package src.lesson3;

public class FlyCar extends Car{
    public FlyCar(String mark, String model, String color, String exter, String fluel_type, String control, int num_wheells, double vol_ege, boolean light_on) {
        super(mark, model, color, exter, fluel_type, control, num_wheells, vol_ege, light_on);
    }

    public void fly() {
        System.out.println("Автомобиль летит");
    }
}

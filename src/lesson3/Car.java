package src.lesson3;
//Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет,
// тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар,.


//родительский класс
public class Car implements ILight,ICargo {
    protected String mark, model, color, exter, fluel_type, control;
    protected int num_wheells;
    protected double vol_ege;
    private boolean light_on;

    //КОНСТРУКТОР
    public Car(String mark, String model, String color, String exter, String fluel_type, String control, int num_wheells, double vol_ege, boolean light_on) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.exter = exter;
        this.fluel_type = fluel_type;
        this.control = control;
        this.num_wheells = num_wheells;
        this.vol_ege = vol_ege;
        this.light_on = light_on;
    }



    //метод движения
    protected String movement(){
        return " ";
    }

    //метод обслуживания
    protected String service(){
        return  " ";
    }
    //метод переключения коробки передач
    public void changeControl(String control_mode) {

    }

    //имплемитированный  метод включения фар
    @Override
    public void isLight_on(boolean light_on) {
        System.out.printf("Фары включены");

    }
    //имплемитированный  метод включения  противотуманных фар
    @Override
    public void FogLights_on() {

    }


    @Override
    public void cargo() {
         System.out.println("Груз доставлен");


    }
}

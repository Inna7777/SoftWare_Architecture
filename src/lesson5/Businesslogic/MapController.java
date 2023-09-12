package src.lesson5.Businesslogic;


public class MapController {
    private NetController netController;

    public MapController() {
        this.netController = new NetController();
    }

    // метод для получения карты из сети
    public Map getMap() {
        return netController.getMap();
    }
}



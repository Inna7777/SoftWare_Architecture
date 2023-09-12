package src.lesson5.Businesslogic;

public class RouteController {
    private NetController netController;

    public RouteController() {
        this.netController = new NetController();
    }

    // метод для получения маршрута из сети
    public Route getRoute() {
        return netController.getRoute();
    }
}

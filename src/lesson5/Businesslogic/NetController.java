package src.lesson5.Businesslogic;


import src.lesson5.NetWork.ICamerasRepository;
import src.lesson5.NetWork.IRoadsRepository;

public class NetController implements ICamerasRepository, IRoadsRepository {
    // методы для получения карты, маршрута и путешествия из сети
    public Map getMap() {
        // код для получения карты из сети
         Map map = new Map();
         return map;
    }

    public Route getRoute() {
        // код для получения маршрута из сети
        Route route = new Route();
        return route;
    }

    public Trip getTrip() {
        // код для получения путешествия из сети
        Route route = new Route();
        Trip trip = new Trip();
        return trip;
    }

    // методы для создания, обновления и удаления путешествия
    public void createTrip(Trip trip) {
        // код для создания нового путешествия в сети
    }

    public void updateTrip(Trip trip) {
        // код для обновления существующего путешествия в сети
    }

    public void deleteTrip(Trip trip) {
        // код для удаления путешествия из сети
    }
}

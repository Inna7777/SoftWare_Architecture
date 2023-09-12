package src.lesson5.UserIntrface;

import src.lesson5.Businesslogic.ApplicationController;
import src.lesson5.Businesslogic.Map;
import src.lesson5.Businesslogic.Route;
import src.lesson5.Businesslogic.Trip;

public class UXController implements IUserInterfase {
    private ApplicationController applicationController;

    public UXController(ApplicationController applicationController) {
        this.applicationController = applicationController;
    }

    // методы для отображения карты, маршрута и поездки


    @Override
    public void showMap(Map map) {
        Map mapData = applicationController.getMap();
        // отображение карты на основе полученных данных
    }

    @Override
    public void showRoute(Route route) {
        Route routeData = applicationController.getRoute();
        // отображение маршрута на основе полученных данных
    }

    @Override
    public void showTrip(Trip trip) {
        Trip tripData = applicationController.getTrip();
        // отображение поездки на основе полученных данных
    }
}

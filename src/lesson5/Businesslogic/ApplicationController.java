package src.lesson5.Businesslogic;



public class ApplicationController {
    private MapController mapController;
    private RouteController routeController;
    private TripController tripController;

    public ApplicationController() {
        this.mapController = new MapController();
        this.routeController = new RouteController();
        this.tripController = new TripController();
    }

    // методы для получения информации о карте, маршруте и поездке
    public Map getMap() {
        return mapController.getMap();
    }

    public Route getRoute() {
        return routeController.getRoute();
    }

    public Trip getTrip() {
        return tripController.getTrip();
    }
}


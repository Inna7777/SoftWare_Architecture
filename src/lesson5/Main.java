package src.lesson5;

import src.lesson5.Businesslogic.ApplicationController;
import src.lesson5.Businesslogic.TripController;
import src.lesson5.UserIntrface.UXController;

public class Main {
    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController();
        UXController uxController = new UXController(applicationController);

        TripController tripController = new TripController();

        uxController.showMap(applicationController.getMap());
        uxController.showRoute(applicationController.getRoute());
        uxController.showTrip(applicationController.getTrip());

    }
}

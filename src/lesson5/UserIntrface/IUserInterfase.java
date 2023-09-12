package src.lesson5.UserIntrface;

import src.lesson5.Businesslogic.Map;
import src.lesson5.Businesslogic.Route;
import src.lesson5.Businesslogic.Trip;



public interface IUserInterfase {
    void showMap(Map map);
    void showRoute(Route route);
    void showTrip(Trip trip);
}


package src.lesson5.Businesslogic;

public class TripController {
    private NetController netController;

    public TripController() {
        this.netController = new NetController();
    }

    // метод для получения путешествия из сети
    public Trip getTrip() {
        return netController.getTrip();
    }

    // метод для создания нового путешествия
    public void createTrip(Trip trip) {
        netController.createTrip(trip);
    }

    // метод для обновления существующего путешествия
    public void updateTrip(Trip trip) {
        netController.updateTrip(trip);
    }

    // метод для удаления путешествия
    public void deleteTrip(Trip trip) {
        netController.deleteTrip(trip);
    }
}


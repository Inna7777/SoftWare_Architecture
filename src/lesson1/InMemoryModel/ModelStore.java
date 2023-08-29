package lesson1.InMemoryModel;
import lesson1.ModelElements.*;
// класс ModelStore хранит объекты модели (models, scenes, flashes, cameras)
// и реализует интерфейс IModelChanger.
//  Метод notifyChange() используется для уведомления других объектов об изменении модели.

public class ModelStore implements IModelChanger {
    public final PoligonalModel models;
    public final Scene scenes;
    public final Flash flashes;
    public final Camera cameras;
    private IModelChangeObserver changeObserver;
    // Создается конструктор, который принимает объект IModelChangeObserver в качестве параметра.
    public  ModelStore(IModelChangeObserver changeObserver) {
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel(new Poligon(new Point3D[]{new Point3D(0,0,0), new Point3D(0,0,0), new Point3D(0,0,0)}));
        this.cameras = new Camera(new Point3D(0,0,0.),new Angle3D(0,0,0));
        this.flashes = new Flash(new Point3D(0, 0, 0), new Angle3D(0, 0, 0), null, null);         ;
        this.scenes = new  Scene(1, this.models, this.flashes);

    }

    public Scene getScenes(int n) {
        return this.scenes;
    }


    @java.lang.Override
    public void notifyChange(IModelChanger sender) {

    }
}

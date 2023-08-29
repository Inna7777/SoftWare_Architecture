package lesson1.InMemoryModel;
import lesson1.ModelElements.*;

public class ModelStore implements IModelChanger {
    public final PoligonalModel models;
    public final Scene scenes;
    public final Flash flashes;
    public final Camera cameras;
    private IModelChangeObserver changeObserver;

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

package lesson1.InMemoryModel;
// интерфейс IModelChanger с методом который уведомляет другие объекты
// об изменении модели.
public interface IModelChanger {
     void notifyChange(IModelChanger sender);
}

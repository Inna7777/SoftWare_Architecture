package lesson1.InMemoryModel;
// интерфейс IModelChangeObserver с  методом ApplyUpdateModel(),
// который должен выполнять  действия для обновления модели.
public interface IModelChangeObserver {
    public void ApplyUpdateModel();
}

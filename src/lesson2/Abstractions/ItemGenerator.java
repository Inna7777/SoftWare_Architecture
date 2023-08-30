package src.lesson2.Abstractions;
//Абстракция класса фабрики

public abstract class ItemGenerator  {
    //Метод взаимодейсвия с абстрактной продукцией
    // return: содержимое из разных сундуков
    public String openReward() {
        IGameItem gameItem = creatItem();
        return gameItem.open();

    }
    //метод создания экземпляра продукта
    //return : экземпляр продукта
        public abstract IGameItem creatItem();
}

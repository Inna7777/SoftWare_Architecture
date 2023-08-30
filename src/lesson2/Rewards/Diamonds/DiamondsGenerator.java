package src.lesson2.Rewards.Diamonds;

import src.lesson2.Abstractions.IGameItem;
import src.lesson2.Abstractions.ItemGenerator;

public class DiamondsGenerator extends ItemGenerator {
    @Override
    public IGameItem creatItem() {
        return new DiamondsRewards();
    }
}

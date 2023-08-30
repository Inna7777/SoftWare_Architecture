package src.lesson2.Rewards.Gold;

import src.lesson2.Abstractions.IGameItem;
import src.lesson2.Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem creatItem() {
        return new GoldRewards();
    }
}

package src.lesson2.Rewards.Silver;

import src.lesson2.Abstractions.IGameItem;
import src.lesson2.Abstractions.ItemGenerator;

public class SilverGenerator extends ItemGenerator {
    @Override
    public IGameItem creatItem() {
        return new SilverRewards();
    }
}

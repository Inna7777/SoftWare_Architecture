package src.lesson2.Rewards.Gold;

import src.lesson2.Abstractions.IGameItem;

public class GoldRewards implements IGameItem {
    @Override
    public String open() {
        return "Gold";
    }
}

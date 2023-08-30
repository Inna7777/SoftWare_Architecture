package src.lesson2.Rewards.Diamonds;

import src.lesson2.Abstractions.IGameItem;

public class DiamondsRewards implements IGameItem {
    @Override
    public String open() {
        return "Diamond";
    }
}

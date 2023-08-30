package src.lesson2.Rewards.BlackLabel;

import src.lesson2.Abstractions.IGameItem;
import src.lesson2.Abstractions.ItemGenerator;


public class BlackLabelGenerator extends ItemGenerator {
    @Override
    public IGameItem creatItem() {
        return new BlackLabelRewerds();
    }
}

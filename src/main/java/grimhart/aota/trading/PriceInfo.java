package grimhart.aota.trading;

import net.minecraft.util.Tuple;

import java.util.Random;

public class PriceInfo extends Tuple<Integer, Integer> {
    public PriceInfo(int boundOne, int boundTwo) {
        super(boundOne, boundTwo);
    }

    public int getPrice(Random rand) {
        return this.getFirst() >= this.getSecond() ? this.getSecond() + rand.nextInt(this.getFirst() - this.getSecond() + 1) : this.getFirst() + rand.nextInt(this.getSecond() - this.getFirst() + 1);
    }
}

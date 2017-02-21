package grimhart.aota.trading;

import grimhart.aota.AOTA;
import net.minecraft.util.Tuple;

import java.util.Random;

public class PriceInfo extends Tuple<Integer, Integer>
{
    public PriceInfo(int minPrice, int maxPrice)
    {
        super(minPrice, maxPrice);

        if (maxPrice < minPrice)
        {
            AOTA.logError(String.format("PriceRange(%d, %d) invalid, %d smaller than %d", minPrice, maxPrice, maxPrice, minPrice));
        }
    }

    public int getPrice(Random rand)
    {
        return this.getFirst() >= this.getSecond() ? this.getFirst() : this.getFirst() + rand.nextInt(this.getSecond() - this.getFirst() + 1);
    }
}

package grimhart.aota.trading;

import net.minecraft.util.Tuple;

import java.util.Random;

public class PriceInfo extends Tuple<Integer, Integer>
{
    public PriceInfo(int minPrice, int maxPrice)
    {
        super(Integer.valueOf(minPrice), Integer.valueOf(maxPrice));

        if (maxPrice < minPrice)
        {
            System.out.println(String.format("PriceRange({}, {}) invalid, {} smaller than {}", new Object[] {Integer.valueOf(minPrice), Integer.valueOf(maxPrice), Integer.valueOf(maxPrice), Integer.valueOf(minPrice)}));
        }
    }

    public int getPrice(Random rand)
    {
        return this.getFirst().intValue() >= this.getSecond().intValue() ? this.getFirst().intValue() : this.getFirst().intValue() + rand.nextInt(this.getSecond().intValue() - this.getFirst().intValue() + 1);
    }
}

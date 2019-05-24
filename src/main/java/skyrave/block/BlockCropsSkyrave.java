package skyrave.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import skyrave.Skyrave;

public class BlockCropsSkyrave extends BlockCrops {
    private Item seed;
    private Item crop;

    @Override
    public Item getSeed() {
        return seed;
    }

    @Override
    public Item getCrop() {
        return crop;
    }

    public void setDrops(Item crop) {
        setDrops(crop, crop);
    }

    public void setDrops(Item seed, Item crop) {
        this.seed = seed;
        this.crop = crop;
    }

    @Override
    public Block setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

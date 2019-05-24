package skyrave.item;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

public class ItemSeedsSkyrave extends ItemSeeds {
    public ItemSeedsSkyrave(Block crops) {
        // Soil parameter is unused, so default to farmland
        super(crops, Blocks.farmland);
        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

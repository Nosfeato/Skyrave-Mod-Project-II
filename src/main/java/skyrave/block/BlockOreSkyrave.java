package skyrave.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

public class BlockOreSkyrave extends BlockOre {
    public BlockOreSkyrave() {
        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundTypePiston);
    }

    @Override
    public Block setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

package skyrave.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

public class BlockSkyrave extends Block {
    public BlockSkyrave(Material material) {
        super(material);
        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Block setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

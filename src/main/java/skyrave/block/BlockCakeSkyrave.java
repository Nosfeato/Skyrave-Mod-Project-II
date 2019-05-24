package skyrave.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.client.particle.EntityCrit2FX;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;


public class BlockCakeSkyrave extends BlockCake{
    public BlockCakeSkyrave(){
    setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);


}


    @Override
    public Block setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}


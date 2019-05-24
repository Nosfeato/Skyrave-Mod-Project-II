package skyrave.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;



public class ItemShovelSkyrave extends ItemSpade {
    public ItemShovelSkyrave(ToolMaterial material){
        super (material);

        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

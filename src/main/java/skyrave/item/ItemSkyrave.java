package skyrave.item;

import net.minecraft.item.Item;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

public class ItemSkyrave extends Item {
    public ItemSkyrave() {
        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

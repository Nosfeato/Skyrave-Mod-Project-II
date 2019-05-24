package skyrave.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

/**
 * Created by Lone Wolf on 28/03/2015.
 */
public class ItemSwordSkyrave extends ItemSword{
    public ItemSwordSkyrave(Item.ToolMaterial material){
        super (material);

        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

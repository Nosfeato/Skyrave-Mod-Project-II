package skyrave.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;


public class ItemHoeSkyrave extends ItemHoe{
    public ItemHoeSkyrave(Item.ToolMaterial material){
        super (material);

        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

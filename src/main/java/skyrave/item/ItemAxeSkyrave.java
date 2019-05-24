package skyrave.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

/**
 * Created by Lone Wolf on 28/03/2015.
 */
public class ItemAxeSkyrave extends ItemAxe{
    public ItemAxeSkyrave(ToolMaterial material){
        super (material);

        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

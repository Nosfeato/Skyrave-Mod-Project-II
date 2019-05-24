package skyrave.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;


public class ItemPickaxeSkyrave extends ItemPickaxe{

    public ItemPickaxeSkyrave(ToolMaterial material){
        super (material);

        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

        @Override
        public Item setUnlocalizedName(String unlocalizedName) {
            return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

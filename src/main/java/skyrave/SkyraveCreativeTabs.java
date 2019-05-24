package skyrave;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import skyrave.item.SkyraveItems;

public abstract class SkyraveCreativeTabs extends CreativeTabs {
    public static final CreativeTabs PLACEHOLDER = new SkyraveCreativeTabs("placeholder") {
        @Override
        public Item getTabIconItem() {
            return SkyraveItems.AMBER_INGOT;
        }
    };

    public SkyraveCreativeTabs(String label) {
        super(Skyrave.MOD_ID + "." + label);
    }
}

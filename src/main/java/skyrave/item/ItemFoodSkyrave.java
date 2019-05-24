package skyrave.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;

public class ItemFoodSkyrave extends ItemFood {
    public ItemFoodSkyrave(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }

    public ItemFoodSkyrave(int amount, boolean isWolfFood) {
        this(amount, 0.6F, isWolfFood);
    }


    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }
}

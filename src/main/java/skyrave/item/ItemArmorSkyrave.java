package skyrave.item;


import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import skyrave.Skyrave;
import skyrave.SkyraveCreativeTabs;


public class ItemArmorSkyrave extends ItemArmor {
    public ItemArmorSkyrave(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        setCreativeTab(SkyraveCreativeTabs.PLACEHOLDER);
    }


    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Skyrave.setUnlocalizedName(unlocalizedName));
    }

}
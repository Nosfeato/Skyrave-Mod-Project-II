package skyrave;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ProxyCommon {
    public void init() {}

    public void registerItem(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    public void registerBlock(Block block, String name) {
        registerBlock(block, ItemBlock.class, name);
    }

    public void registerBlock(Block block, Class<? extends ItemBlock> itemClass, String name) {
        GameRegistry.registerBlock(block, itemClass, name);
    }
}

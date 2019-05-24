package skyrave;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.FMLClientHandler;
import skyrave.block.BlockCakeSkyrave;
import skyrave.block.SkyraveBlocks;

import java.util.HashMap;
import java.util.Map;

public class ProxyClient extends ProxyCommon {
    private static final HashMap<Item, String> itemTextures = new HashMap<Item, String>();
    private static boolean hasLoaded = false;

    @Override
    public void init() {
        hasLoaded = true;


        for (Map.Entry<Item, String> entry : itemTextures.entrySet()) {
            registerTexture(entry.getKey(), entry.getValue());

        }

    }

    @Override
    public void registerItem(Item item, String name) {
        super.registerItem(item, name);
        registerTexture(item, name);
    }

    @Override
    public void registerBlock(Block block, String name) {
        super.registerBlock(block, name);
        registerTexture(Item.getItemFromBlock(block), name);
    }

    public void registerTexture(Item item, String name) {
        if (!hasLoaded) {
            itemTextures.put(item, name);
        } else {
            FMLClientHandler.instance().getClient().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Skyrave.setTextureName(name), "inventory"));
        }
    }
}

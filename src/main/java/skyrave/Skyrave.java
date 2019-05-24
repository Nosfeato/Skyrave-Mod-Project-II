package skyrave;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skyrave.block.SkyraveBlocks;
import skyrave.item.SkyraveItems;


@Mod(modid = Skyrave.MOD_ID, name = "Skyrave", version = Skyrave.VERSION)
public class Skyrave {
    public static final String MOD_ID = "skyrave";
    public static final String VERSION = "@VERSION@";


    @SidedProxy(clientSide = "skyrave.ProxyClient", serverSide = "skyrave.ProxyCommon")
    public static ProxyCommon proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {


        SkyraveBlocks.registerBlocks();
        SkyraveItems.registerItems();
        Recipes.addRecipes();

        //ModelLoader.setCustomModelRessourceLocation(Item.getItemFromBlock(SkyraveBlocks.STRAWBERRY_CAKE),0,new ModelResourceLocation("skyrave:strawberry_cake","inventory"));

        //Item/Block init and registering + config handling

        GameRegistry.registerWorldGenerator(new OreGenerator(), 100);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        //Proxy, TileEntity, entity, GUI and Packet Registering
    }


    public static String setUnlocalizedName(String unlocalizedName) {
        return MOD_ID + "." + unlocalizedName;
    }

    public static String setTextureName(String textureName) {
        return MOD_ID + ":" + textureName;
    }
}

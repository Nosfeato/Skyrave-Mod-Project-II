package skyrave.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import skyrave.Skyrave;
import skyrave.item.SkyraveItems;

public class SkyraveBlocks {


    public static final Block BLUE_BRICK = new BlockSkyrave(Material.rock).setUnlocalizedName("brickBlue");

    public static final Block AMBER_ORE = new BlockOreSkyrave().setUnlocalizedName("oreAmber");
    public static final Block AMETHYST_ORE = new BlockOreSkyrave().setUnlocalizedName("oreAmethyst");
    public static final Block BERYL_ORE = new BlockOreSkyrave().setUnlocalizedName("oreBeryl");
    public static final Block CITRINE_ORE = new BlockOreSkyrave().setUnlocalizedName("oreCitrine");
    public static final Block COPPER_ORE = new BlockOreSkyrave().setUnlocalizedName("oreCopper");
    public static final Block CORDIERITE_ORE = new BlockOreSkyrave().setUnlocalizedName("oreCordierite");
    public static final Block GARNET_ORE = new BlockOreSkyrave().setUnlocalizedName("oreGarnet");
    public static final Block PERIDOT_ORE = new BlockOreSkyrave().setUnlocalizedName("orePeridot");
    public static final Block PLATINUM_ORE = new BlockOreSkyrave().setUnlocalizedName("orePlatinum");
    public static final Block RUBY_ORE = new BlockOreSkyrave().setUnlocalizedName("oreRuby");
    public static final Block SAPPHIRE_ORE = new BlockOreSkyrave().setUnlocalizedName("oreSapphire");
    public static final Block SILVER_ORE = new BlockOreSkyrave().setUnlocalizedName("oreSilver");
    public static final Block TANZANITE_ORE = new BlockOreSkyrave().setUnlocalizedName("oreTanzanite");
    public static final Block TIN_ORE = new BlockOreSkyrave().setUnlocalizedName("oreTin");
    public static final Block TOPAZ_ORE = new BlockOreSkyrave().setUnlocalizedName("oreTopaz");
    public static final Block TOURMALINE_ORE = new BlockOreSkyrave().setUnlocalizedName("oreTourmaline");
    public static final Block ZIRCON_ORE = new BlockOreSkyrave().setUnlocalizedName("oreZircon");

    public static final BlockCropsSkyrave GRAPES = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("grapes");
    public static final BlockCropsSkyrave PINEAPPLE = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("pineapple");
    public static final BlockCropsSkyrave CORN = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("corn");
    public static final BlockCropsSkyrave CUCUMBER = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("cucumber");
    public static final BlockCropsSkyrave ONION = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("onion");
    public static final BlockCropsSkyrave RADISH = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("radish");
    public static final BlockCropsSkyrave SALAD = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("salad");
    public static final BlockCropsSkyrave TOMATO = (BlockCropsSkyrave) new BlockCropsSkyrave().setUnlocalizedName("tomato");

    public static final BlockCakeSkyrave STRAWBERRY_CAKE = (BlockCakeSkyrave) new BlockCakeSkyrave().setUnlocalizedName("cakeStrawberry");


    static {
        // Grapes block is not null when seeds item initializes
        GRAPES.setDrops(SkyraveItems.GRAPE_SEEDS, SkyraveItems.PURPLE_GRAPES);
        PINEAPPLE.setDrops(SkyraveItems.PINEAPPLE_SEEDS, SkyraveItems.PINEAPPLE);
        CORN.setDrops(SkyraveItems.CORN_SEEDS, SkyraveItems.CORN);
        CUCUMBER.setDrops(SkyraveItems.CUCUMBER_SEEDS, SkyraveItems.CUCUMBER);
        ONION.setDrops(SkyraveItems.ONION_SEEDS, SkyraveItems.ONION);
        RADISH.setDrops(SkyraveItems.RADISH_SEEDS, SkyraveItems.RADISH);
        SALAD.setDrops(SkyraveItems.SALAD_SEEDS, SkyraveItems.SALAD);
        TOMATO.setDrops(SkyraveItems.TOMATO_SEEDS, SkyraveItems.TOMATO);
    }

    public static void registerBlocks() {

        Skyrave.proxy.registerBlock(BLUE_BRICK, "blue_brick");

        Skyrave.proxy.registerBlock(AMBER_ORE, "amber_ore");
        Skyrave.proxy.registerBlock(AMETHYST_ORE, "amethyst_ore");
        Skyrave.proxy.registerBlock(BERYL_ORE, "beryl_ore");
        Skyrave.proxy.registerBlock(CITRINE_ORE, "citrine_ore");
        Skyrave.proxy.registerBlock(COPPER_ORE, "copper_ore");
        Skyrave.proxy.registerBlock(CORDIERITE_ORE, "cordierite_ore");
        Skyrave.proxy.registerBlock(GARNET_ORE, "garnet_ore");
        Skyrave.proxy.registerBlock(PERIDOT_ORE, "peridot_ore");
        Skyrave.proxy.registerBlock(PLATINUM_ORE, "platinum_ore");
        Skyrave.proxy.registerBlock(RUBY_ORE, "ruby_ore");
        Skyrave.proxy.registerBlock(SAPPHIRE_ORE, "sapphire_ore");
        Skyrave.proxy.registerBlock(SILVER_ORE, "silver_ore");
        Skyrave.proxy.registerBlock(TANZANITE_ORE, "tanzanite_ore");
        Skyrave.proxy.registerBlock(TIN_ORE, "tin_ore");
        Skyrave.proxy.registerBlock(TOPAZ_ORE, "topaz_ore");
        Skyrave.proxy.registerBlock(TOURMALINE_ORE, "tourmaline_ore");
        Skyrave.proxy.registerBlock(ZIRCON_ORE, "zircon_ore");

        Skyrave.proxy.registerBlock(GRAPES, null, "grapes");
        Skyrave.proxy.registerBlock(PINEAPPLE, null, "pineapple");
        Skyrave.proxy.registerBlock(CORN, null, "corn");
        Skyrave.proxy.registerBlock(CUCUMBER, null, "cucumber");
        Skyrave.proxy.registerBlock(ONION, null, "onion");
        Skyrave.proxy.registerBlock(RADISH, null, "radish");
        Skyrave.proxy.registerBlock(SALAD, null, "salad");
        Skyrave.proxy.registerBlock(TOMATO, null, "tomato");

        Skyrave.proxy.registerBlock(STRAWBERRY_CAKE,"strawberry_cake");
    }
}

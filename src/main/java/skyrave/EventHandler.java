package skyrave;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import skyrave.block.SkyraveBlocks;

import java.util.Random;

public class EventHandler {
    // Iron size: 9, count: 20, min height: 0, max height: 64
    public static final WorldGenMinable TIN_GEN = new WorldGenMinable(SkyraveBlocks.TIN_ORE.getDefaultState(), 9);
    public static final WorldGenMinable COPPER_GEN = new WorldGenMinable(SkyraveBlocks.COPPER_ORE.getDefaultState(), 9);
    public static final WorldGenMinable AMETHYST_GEN = new WorldGenMinable(SkyraveBlocks.AMETHYST_ORE.getDefaultState(), 9);
    public static final WorldGenMinable BERYL_GEN = new WorldGenMinable(SkyraveBlocks.BERYL_ORE.getDefaultState(), 9);
    public static final WorldGenMinable AMBER_GEN = new WorldGenMinable(SkyraveBlocks.AMBER_ORE.getDefaultState(), 9);
    public static final WorldGenMinable TANZANITE_GEN = new WorldGenMinable(SkyraveBlocks.TANZANITE_ORE.getDefaultState(), 9);
    public static final WorldGenMinable PERIDOT_GEN = new WorldGenMinable(SkyraveBlocks.PERIDOT_ORE.getDefaultState(), 9);
    public static final WorldGenMinable SILVER_GEN = new WorldGenMinable(SkyraveBlocks.SILVER_ORE.getDefaultState(), 9);
    public static final WorldGenMinable TOURMALINE_GEN = new WorldGenMinable(SkyraveBlocks.TOURMALINE_ORE.getDefaultState(), 9);
    public static final WorldGenMinable ZIRCON_GEN = new WorldGenMinable(SkyraveBlocks.ZIRCON_ORE.getDefaultState(), 9);
    public static final WorldGenMinable TOPAZ_GEN = new WorldGenMinable(SkyraveBlocks.TOPAZ_ORE.getDefaultState(), 9);
    public static final WorldGenMinable CITRINE_GEN = new WorldGenMinable(SkyraveBlocks.CITRINE_ORE.getDefaultState(), 9);
    public static final WorldGenMinable CORDIERITE_GEN = new WorldGenMinable(SkyraveBlocks.CORDIERITE_ORE.getDefaultState(), 9);
    public static final WorldGenMinable GARNET_GEN = new WorldGenMinable(SkyraveBlocks.GARNET_ORE.getDefaultState(), 9);

    // Gold size: 9, count: 2, min height: 0, max height: 32
    public static final WorldGenMinable SAPPHIRE_GEN = new WorldGenMinable(SkyraveBlocks.SAPPHIRE_ORE.getDefaultState(), 9);
    public static final WorldGenMinable RUBY_GEN = new WorldGenMinable(SkyraveBlocks.RUBY_ORE.getDefaultState(), 9);

    @SubscribeEvent
    public void onOresGenerated(OreGenEvent.Post event) {
        World world = event.world;
        Random random = event.rand;
        BlockPos pos = event.pos;

        genStandardOre1(world, random, pos, 17, TIN_GEN, 56, 61);
        genStandardOre1(world, random, pos, 17, COPPER_GEN, 56, 61);
        genStandardOre1(world, random, pos, 16, AMETHYST_GEN, 53, 58);
        genStandardOre1(world, random, pos, 15, BERYL_GEN, 50, 55);
        genStandardOre1(world, random, pos, 14, AMBER_GEN, 47, 52);
        genStandardOre1(world, random, pos, 13, TANZANITE_GEN, 44, 49);
        genStandardOre1(world, random, pos, 12, PERIDOT_GEN, 41, 46);
        genStandardOre1(world, random, pos, 11, SILVER_GEN, 38, 43);
        genStandardOre1(world, random, pos, 10, TOURMALINE_GEN, 35, 40);
        genStandardOre1(world, random, pos, 9, ZIRCON_GEN, 32, 37);
        genStandardOre1(world, random, pos, 8, TOPAZ_GEN, 29, 34);
        genStandardOre1(world, random, pos, 7, CITRINE_GEN, 26, 31);
        genStandardOre1(world, random, pos, 6, CORDIERITE_GEN, 23, 28);
        genStandardOre1(world, random, pos, 5, GARNET_GEN, 17, 22);

        genStandardOre1(world, random, pos, 2, SAPPHIRE_GEN, 20, 25);
        genStandardOre1(world, random, pos, 2, RUBY_GEN, 5, 19);

        int platinumCount = 3 + random.nextInt(6);

        for (int j = 0; j < platinumCount; ++j) {
            BlockPos randGenPos = pos.add(random.nextInt(16), random.nextInt(4) + 5, random.nextInt(16));

            if (world.getBlockState(randGenPos).getBlock().isReplaceableOreGen(world, randGenPos, BlockHelper.forBlock(Blocks.stone))) {
                world.setBlockState(randGenPos, SkyraveBlocks.PLATINUM_ORE.getDefaultState(), 2);
            }
        }
    }

    /**
     * @see net.minecraft.world.biome.BiomeDecorator#genStandardOre1
     */
    public static void genStandardOre1(World world, Random random, BlockPos pos, int count, WorldGenerator generator, int minHeight, int maxHeight) {
        if (TerrainGen.generateOre(world, random, generator, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM)) {
            if (maxHeight < minHeight) {
                int i = minHeight;
                minHeight = maxHeight;
                maxHeight = i;
            } else if (maxHeight == minHeight) {
                if (minHeight < 255) {
                    ++maxHeight;
                } else {
                    --minHeight;
                }
            }

            for (int i = 0; i < count; ++i) {
                BlockPos randGenPos = pos.add(random.nextInt(16), random.nextInt(maxHeight - minHeight + 1) + minHeight, random.nextInt(16));
                generator.generate(world, random, randGenPos);
            }
        }
    }
}

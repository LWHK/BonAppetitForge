package net.bonappetit.register;

import java.util.function.Supplier;

import net.bonappetit.BonAppetit;
import net.bonappetit.common.ModOreBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {

    public static final RegistryObject<Block> HALITE_ORE = register("halite_ore", () -> new ModOreBlock(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(2f, 3f).sound(SoundType.NETHER_GOLD).setRequiresTool()));
    public static final RegistryObject<Block> LIMESTONE = register("limestone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(1.25f, 3f).sound(SoundType.NETHERRACK).setRequiresTool()));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = register("limestone_stairs", () -> new StairsBlock(LIMESTONE.get().getDefaultState(), AbstractBlock.Properties.from(LIMESTONE.get())));
    public static final RegistryObject<Block> LIMESTONE_SLAB = register("limestone_slab", () -> new SlabBlock(AbstractBlock.Properties.from(LIMESTONE.get())));
    public static final RegistryObject<Block> LIMESTONE_WALL = register("limestone_wall", () -> new WallBlock(AbstractBlock.Properties.from(LIMESTONE.get())));
    public static final RegistryObject<Block> LIMESTONE_POLISHED = register("limestone_polished", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(1.75f, 4f).sound(SoundType.NETHERRACK).setRequiresTool()));
    public static final RegistryObject<Block> LIMESTONE_POLISHED_STAIRS = register("limestone_polished_stairs", () -> new StairsBlock(LIMESTONE_POLISHED.get().getDefaultState(), AbstractBlock.Properties.from(LIMESTONE_POLISHED.get())));
    public static final RegistryObject<Block> LIMESTONE_POLISHED_SLAB = register("limestone_polished_slab", () -> new SlabBlock(AbstractBlock.Properties.from(LIMESTONE_POLISHED.get())));
    public static final RegistryObject<Block> QUARTZ_TILES = register("quartz_tiles", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(2f, 6f).sound(SoundType.STONE).setRequiresTool()));
    public static final RegistryObject<Block> SALT_BLOCK = register("salt_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(2f, 4f).sound(SoundType.NETHERRACK).setRequiresTool()));
    public static final RegistryObject<Block> BUTTER_BLOCK = register("butter_block", () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC).harvestTool(ToolType.HOE).harvestLevel(0).hardnessAndResistance(0.25f, 0.25f).sound(SoundType.HONEY).slipperiness(0.9f)));
    public static final RegistryObject<Block> CHEESE_BLOCK = register("cheese_block", () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC).harvestTool(ToolType.HOE).harvestLevel(0).hardnessAndResistance(0.25f, 0.25f).sound(SoundType.HONEY)));

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(BonAppetit.ITEM_GROUP)));
        return ret;
    }

    public static void init() { }
}

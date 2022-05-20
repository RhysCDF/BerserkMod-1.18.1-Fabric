package net.rhysc.berserkmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rhysc.berserkmod.BerserkMod;

public class ModBlocks {

    public static final Block BLOODIRON_ORE = registerBlock("bloodiron_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.MISC);

    public static final Block BLOODIRON_BLOCK = registerBlock("bloodiron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BerserkMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BerserkMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        BerserkMod.LOGGER.info("Registering Modblocks for " + BerserkMod.MOD_ID);
    }

}

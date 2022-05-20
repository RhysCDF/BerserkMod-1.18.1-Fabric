package net.rhysc.berserkmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.rhysc.berserkmod.BerserkMod;
import static net.rhysc.berserkmod.BerserkMod.MOD_ID;

import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DRAGONSLAYER_SWORD = registerItem("dragonslayer_sword", (Item)new SwordItem(ToolMaterials.NETHERITE, 5, -2.0f, new Item.Settings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item BEHELIT = registerItem("behelit",
            new Item(new FabricItemSettings().group(ModItemGroup.BERSERKGROUP)));

    public static final Item RAW_BLOODIRON = registerItem("raw_bloodiron",
            new Item(new FabricItemSettings().group(ModItemGroup.BERSERKGROUP)));

    public static final Item BLOODIRON_CLUMP = registerItem("bloodiron_heap_crafting.json",
            new Item(new FabricItemSettings().group(ModItemGroup.BERSERKGROUP)));

    public static final Item BLOODIRON_INGOT = registerItem("bloodiron_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BERSERKGROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BerserkMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BerserkMod.LOGGER.info("Registering Mod Items for " + MOD_ID);
    }

}

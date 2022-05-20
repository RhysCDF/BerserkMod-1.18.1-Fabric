package net.rhysc.berserkmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rhysc.berserkmod.BerserkMod;

public class ModItemGroup {
    public static final ItemGroup BERSERKGROUP = FabricItemGroupBuilder.build(new Identifier(BerserkMod.MOD_ID, "berserkgroup"),
            () -> new ItemStack(ModItems.BEHELIT));
}

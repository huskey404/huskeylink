package net.huskey.huskeylink.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.huskey.huskeylink.HuskeyLINK;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(HuskeyLINK.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        HuskeyLINK.LOGGER.info("Registering ModBlocks for " + HuskeyLINK.MOD_ID);
    }
}

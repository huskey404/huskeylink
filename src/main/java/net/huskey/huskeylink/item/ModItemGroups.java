package net.huskey.huskeylink.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.huskey.huskeylink.HuskeyLINK;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups{
    public static final ItemGroup HUSKEYLINK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HuskeyLINK.MOD_ID, "huskeylink"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.huskeylink"))
                    .icon(() -> new ItemStack(ModItems.ITEMGROUPICON)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LINKCHIP);
                        entries.add(ModItems.LINKCONTROLLER);
                        entries.add(ModItems.COPPERWIRE);
                    }).build());

    public static void registerItemGroups() {
        HuskeyLINK.LOGGER.info("Registering item groups for " +  HuskeyLINK.MOD_ID);
    }
}

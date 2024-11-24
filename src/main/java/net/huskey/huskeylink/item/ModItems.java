package net.huskey.huskeylink.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.huskey.huskeylink.HuskeyLINK;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LINKCHIP = registeritem("linkchip", new Item(new FabricItemSettings()));
    public static final Item LINKCONTROLLER = registeritem("linkcontroller", new Item(new FabricItemSettings()));
    public static final Item ITEMGROUPICON = registeritem("itemgroupicon", new Item(new FabricItemSettings()));
    public static final Item COPPERWIRE = registeritem("copper_wire", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LINKCHIP);
        entries.add(LINKCONTROLLER);
        entries.add(ITEMGROUPICON);
        entries.add(COPPERWIRE);
    }

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HuskeyLINK.MOD_ID, name), item);
    }
    public static void registerModItems() {
        HuskeyLINK.LOGGER.info("Loading items for " + HuskeyLINK.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

package grindingballadditions;


import net.enderio.grindingballadditions.GrindingballAdditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GrindingItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GrindingballAdditions.MOD_ID);

    public static final DeferredItem<Item> allthemodium_grindingball = ITEMS.register(
            "allthemodium_grindingball",
            () -> createRegisteredItem("allthemodium_grindingball"));

    public static final DeferredItem<Item> vibranium_grindingball = ITEMS.register(
            "vibranium_grindingball",
            () -> createRegisteredItem("vibranium_grindingball"));

    public static final DeferredItem<Item> unobtainium_grindingball = ITEMS.register(
            "unobtainium_grindingball",
            () -> createRegisteredItem("unobtainium_grindingball"));

    public static final DeferredItem<Item> infinite_grindingball = ITEMS.register(
            "infinite_grindingball",
            () -> createRegisteredItem("infinite_grindingball"));

    private static Item createRegisteredItem(String name) {
        var itemKey = ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(GrindingballAdditions.MOD_ID, name)
        );
        return new Item(new Item.Properties().setId(itemKey));
    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

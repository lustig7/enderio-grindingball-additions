package grindingballadditions;

import grindingballadditions.grindingball.CustomGrindingBall;
import grindingballadditions.grindingball.GrindingBall;
import net.enderio.grindingballadditions.GrindingballAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GrindingItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GrindingballAdditions.MOD_ID);

    public static final DeferredItem<Item> allthemodium_grindingball = ITEMS.register(
            "allthemodium_grindingball",
            () -> new CustomGrindingBall(new Item.Properties(),
                    GrindingBall::getAllthemodiumGrindBall));

    public static final DeferredItem<Item> vibranium_grindingball = ITEMS.register(
            "vibranium_grindingball",
            () -> new CustomGrindingBall(new Item.Properties(),
                    GrindingBall::getVibraniumGrindBall));

    public static final DeferredItem<Item> unobtainium_grindingball = ITEMS.register(
            "unobtainium_grindingball",
            () -> new CustomGrindingBall(new Item.Properties(),
                    GrindingBall::getUnobtaniumGrindBall));

    public static final DeferredItem<Item> infinite_grindingball = ITEMS.register(
            "infinite_grindingball",
            () -> new CustomGrindingBall(new Item.Properties(),
                    GrindingBall::getInfiniteGrindBall));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

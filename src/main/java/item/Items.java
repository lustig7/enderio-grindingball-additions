package item;


import item.grindingball.CustomGrindingBall;
import item.grindingball.GrindingBall;
import net.enderio.grindingballadditions.GrindingballAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GrindingballAdditions.MOD_ID);

        public static final DeferredItem<Item> allthemodium_grindingball = ITEMS.register(
                        "allthemodium_grindingball",
                        () -> new CustomGrindingBall(new Item.Properties(),
                                GrindingBall.ALLTHEMODIUM_GRINDBALL));

        public static final DeferredItem<Item> vibranium_grindingball = ITEMS.register(
                "vibranium_grindingball",
                () -> new CustomGrindingBall(new Item.Properties(),
                        GrindingBall.VIBRANIUM_GRINDBALL));

        public static final DeferredItem<Item> unobtainium_grindingball = ITEMS.register(
                "unobtainium_grindingball",
                () -> new CustomGrindingBall(new Item.Properties(),
                        GrindingBall.UNOBTAINIUM_GRINDBALL));

        public static final DeferredItem<Item> infinite_grindingball = ITEMS.register(
            "infinite_grindingball",
            () -> new CustomGrindingBall(new Item.Properties(),
                    GrindingBall.INFINITE_GRINDBALL));


        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}

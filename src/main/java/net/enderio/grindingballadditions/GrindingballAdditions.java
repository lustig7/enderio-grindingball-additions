package net.enderio.grindingballadditions;


import grindingballadditions.GrindingItems;
import net.enderio.grindingballadditions.component.ModDataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(GrindingballAdditions.MOD_ID)
public class GrindingballAdditions {

    public static final String MOD_ID = "grindingballadditions";
    private static final Logger LOGGER = LoggerFactory.getLogger(GrindingballAdditions.class);
    private static final boolean HAS_CAPACITOR_MOD = ModList.get().isLoaded("capacitoradditions");

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    // Only create GRINDING_BALL_TAB if capacitoradditions is NOT loaded
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GRINDING_BALL_TAB =
        !HAS_CAPACITOR_MOD ? CREATIVE_MODE_TABS.register("grindingball_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("tab.grindingballadditions.grindingball"))
                    .icon(() -> GrindingItems.unobtainium_grindingball.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(GrindingItems.allthemodium_grindingball.get());
                        output.accept(GrindingItems.vibranium_grindingball.get());
                        output.accept(GrindingItems.unobtainium_grindingball.get());
                        output.accept(GrindingItems.infinite_grindingball.get());
                    }).build()) : null;

    public GrindingballAdditions(IEventBus modEventBus, ModContainer modContainer) {
        // Register configuration FIRST before registering items
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        modEventBus.addListener(this::commonSetup);
        GrindingItems.register(modEventBus);

        // Only register CREATIVE_MODE_TABS if capacitoradditions is NOT loaded
        if (!HAS_CAPACITOR_MOD) {
            CREATIVE_MODE_TABS.register(modEventBus);
        }

        ModDataComponents.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // If capacitoradditions is loaded, add to capacitor tab
        if (HAS_CAPACITOR_MOD && event.getTabKey().location().toString().equals("capacitoradditions:capacitor_tab")) {
            event.accept(GrindingItems.allthemodium_grindingball.get());
            event.accept(GrindingItems.vibranium_grindingball.get());
            event.accept(GrindingItems.unobtainium_grindingball.get());
            event.accept(GrindingItems.infinite_grindingball.get());
        }
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

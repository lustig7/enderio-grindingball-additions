package grindingballadditions.grindingball;

import com.enderio.enderio.api.EnderIODataComponents;
import com.enderio.enderio.api.components.GrindingBallData;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class CustomGrindingBall extends Item {

    private final Supplier<GrindingBallData> grindingBallDataSupplier;
    private GrindingBallData cachedData;

    public CustomGrindingBall(Properties properties, Supplier<GrindingBallData> grindingBallDataSupplier) {
        super(properties);
        this.grindingBallDataSupplier = grindingBallDataSupplier;
    }

    public GrindingBallData getGrindingBallData(@NotNull ItemStack stack) {
        if (cachedData == null) {
            cachedData = grindingBallDataSupplier.get();
        }
        return cachedData;
    }

    @Override
    public void verifyComponentsAfterLoad(ItemStack stack) {
        if(stack.get(EnderIODataComponents.GRINDING_BALL) == null) {
            stack.set(EnderIODataComponents.GRINDING_BALL, getGrindingBallData(stack));
        }
    }
}

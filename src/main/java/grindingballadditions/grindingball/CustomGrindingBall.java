package grindingballadditions.grindingball;

import net.enderio.grindingballadditions.component.ModDataComponents;
import com.enderio.base.api.grindingball.GrindingBallData;

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
        if(stack.get(ModDataComponents.GRINDING_BALL_DATA_TYPE.value()) == null) {
            stack.set(ModDataComponents.GRINDING_BALL_DATA_TYPE.value(), getGrindingBallData(stack));
        }
    }
}

package grindingballadditions.grindingball;


import com.enderio.base.api.grindingball.GrindingBallData;
import net.enderio.grindingballadditions.Config;


public class GrindingBall {

    /**
     * Super lazy - create suppliers on demand without any initialization
     */
    public static GrindingBallData getAllthemodiumGrindBall() {
        return new GrindingBallData(
            Config.ALLTHEMODIUM_SPEED.get().floatValue(),
            Config.ALLTHEMODIUM_EFFICIENCY.get().floatValue(),
            Config.ALLTHEMODIUM_UNBREAKING.get().floatValue(),
            Config.ALLTHEMODIUM_DURABILITY.get()
        );
    }

    public static GrindingBallData getVibraniumGrindBall() {
        return new GrindingBallData(
            Config.VIBRANIUM_SPEED.get().floatValue(),
            Config.VIBRANIUM_EFFICIENCY.get().floatValue(),
            Config.VIBRANIUM_UNBREAKING.get().floatValue(),
            Config.VIBRANIUM_DURABILITY.get()
        );
    }

    public static GrindingBallData getUnobtaniumGrindBall() {
        return new GrindingBallData(
            Config.UNOBTAINIUM_SPEED.get().floatValue(),
            Config.UNOBTAINIUM_EFFICIENCY.get().floatValue(),
            Config.UNOBTAINIUM_UNBREAKING.get().floatValue(),
            Config.UNOBTAINIUM_DURABILITY.get()
        );
    }

    public static GrindingBallData getInfiniteGrindBall() {
        return new GrindingBallData(
            Config.INFINITE_SPEED.get().floatValue(),
            Config.INFINITE_EFFICIENCY.get().floatValue(),
            Config.INFINITE_UNBREAKING.get().floatValue(),
            Config.INFINITE_DURABILITY.get()
        );
    }
}

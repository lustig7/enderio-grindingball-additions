package item.grindingball;


import com.enderio.base.api.grindingball.GrindingBallData;


public class GrindingBall {


    public static final GrindingBallData ALLTHEMODIUM_GRINDBALL = new GrindingBallData(
        1.8f,
        2.0f,
        1.4f,
        90000
    );


    public static final GrindingBallData VIBRANIUM_GRINDBALL = new GrindingBallData(
        2.0f,
        4.0f,
        2.0f,
        240000
    );


    public static final GrindingBallData UNOBTAINIUM_GRINDBALL = new GrindingBallData(
        3.0f,
        2.0f,
        1.0f,
        300000
    );

    /**
     * Infinite Durability Grinding Ball
     * An unlimited grinding ball with infinite durability.
     * Uses the highest possible float value for effectively infinite lifespan.
     */
    public static final GrindingBallData INFINITE_GRINDBALL = new GrindingBallData(
        3.0f,
        3.0f,
        3.0f,
        Integer.MAX_VALUE
    );
}

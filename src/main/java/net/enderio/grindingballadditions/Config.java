package net.enderio.grindingballadditions;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.DoubleValue ALLTHEMODIUM_SPEED = BUILDER
            .comment("Speed multiplier for Allthemodium Grinding Ball")
            .defineInRange("allthemodium_speed", 1.8, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue ALLTHEMODIUM_EFFICIENCY = BUILDER
            .comment("Efficiency multiplier for Allthemodium Grinding Ball")
            .defineInRange("allthemodium_efficiency", 2.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue ALLTHEMODIUM_UNBREAKING = BUILDER
            .comment("Unbreaking level multiplier for Allthemodium Grinding Ball")
            .defineInRange("allthemodium_unbreaking", 1.4, 0.1, 10.0);

    public static final ModConfigSpec.IntValue ALLTHEMODIUM_DURABILITY = BUILDER
            .comment("Durability (in uses) for Allthemodium Grinding Ball")
            .defineInRange("allthemodium_durability", 360000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue VIBRANIUM_SPEED = BUILDER
            .comment("Speed multiplier for Vibranium Grinding Ball")
            .defineInRange("vibranium_speed", 2.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue VIBRANIUM_EFFICIENCY = BUILDER
            .comment("Efficiency multiplier for Vibranium Grinding Ball")
            .defineInRange("vibranium_efficiency", 4.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue VIBRANIUM_UNBREAKING = BUILDER
            .comment("Unbreaking level multiplier for Vibranium Grinding Ball")
            .defineInRange("vibranium_unbreaking", 2.0, 0.1, 10.0);

    public static final ModConfigSpec.IntValue VIBRANIUM_DURABILITY = BUILDER
            .comment("Durability (in uses) for Vibranium Grinding Ball")
            .defineInRange("vibranium_durability", 1060000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue UNOBTAINIUM_SPEED = BUILDER
            .comment("Speed multiplier for Unobtainium Grinding Ball")
            .defineInRange("unobtainium_speed", 3.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue UNOBTAINIUM_EFFICIENCY = BUILDER
            .comment("Efficiency multiplier for Unobtainium Grinding Ball")
            .defineInRange("unobtainium_efficiency", 2.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue UNOBTAINIUM_UNBREAKING = BUILDER
            .comment("Unbreaking level multiplier for Unobtainium Grinding Ball")
            .defineInRange("unobtainium_unbreaking", 1.0, 0.1, 10.0);

    public static final ModConfigSpec.IntValue UNOBTAINIUM_DURABILITY = BUILDER
            .comment("Durability (in uses) for Unobtainium Grinding Ball")
            .defineInRange("unobtainium_durability", 1600000, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec.DoubleValue INFINITE_SPEED = BUILDER
            .comment("Speed multiplier for Infinite Grinding Ball")
            .defineInRange("infinite_speed", 3.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue INFINITE_EFFICIENCY = BUILDER
            .comment("Efficiency multiplier for Infinite Grinding Ball")
            .defineInRange("infinite_efficiency", 3.0, 0.1, 10.0);

    public static final ModConfigSpec.DoubleValue INFINITE_UNBREAKING = BUILDER
            .comment("Unbreaking level multiplier for Infinite Grinding Ball")
            .defineInRange("infinite_unbreaking", 3.0, 0.1, 10.0);

    public static final ModConfigSpec.IntValue INFINITE_DURABILITY = BUILDER
            .comment("Durability (in uses) for Infinite Grinding Ball (use Integer.MAX_VALUE for infinite)")
            .defineInRange("infinite_durability", Integer.MAX_VALUE, 1, Integer.MAX_VALUE);

    public static final ModConfigSpec SPEC = BUILDER.build();
}

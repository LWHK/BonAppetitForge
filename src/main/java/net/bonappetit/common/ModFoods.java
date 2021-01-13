package net.bonappetit.common;

import net.minecraft.item.Food;

public class ModFoods {
    public static final Food SCALLION = new Food.Builder().hunger(1).saturation(0.1f).build();
    public static final Food ONION = new Food.Builder().hunger(1).saturation(0.1f).build();
    public static final Food TOMATO = new Food.Builder().hunger(1).saturation(0.1f).build();
    public static final Food GARLIC = new Food.Builder().hunger(1).saturation(0.1f).build();
    public static final Food CHEESE = new Food.Builder().hunger(2).saturation(0.4f).build();
    public static final Food CHEESE_CROQUETTES = new Food.Builder().hunger(2).saturation(0.3f).fastToEat().build();
    public static final Food PANCAKES = new Food.Builder().hunger(3).saturation(0.4f).build();
    public static final Food FRIED_EGG = new Food.Builder().hunger(4).saturation(0.3f).build();
    public static final Food CHEESE_SOUP = new Food.Builder().hunger(4).saturation(0.4f).build();
    public static final Food ONION_SOUP = new Food.Builder().hunger(4).saturation(0.4f).build();
    public static final Food CARROT_SALAD = new Food.Builder().hunger(4).saturation(0.5f).build();

    public static final Food JUICE_APPLE = new Food.Builder().hunger(4).saturation(0.2f).setAlwaysEdible().build();
    public static final Food JUICE_PUMPKIN = new Food.Builder().hunger(5).saturation(0.2f).setAlwaysEdible().build();
    public static final Food JUICE_CARROT = new Food.Builder().hunger(3).saturation(0.2f).setAlwaysEdible().build();
    public static final Food JUICE_TOMATO = new Food.Builder().hunger(2).saturation(0.1f).setAlwaysEdible().build();
    public static final Food JUICE_MELON = new Food.Builder().hunger(2).saturation(0.1f).setAlwaysEdible().build();
    public static final Food JUICE_BERRIES = new Food.Builder().hunger(2).saturation(0.1f).setAlwaysEdible().build();
}

package net.bonappetit.register;

import net.bonappetit.BonAppetit;
import net.bonappetit.common.CompostableItem;
import net.bonappetit.common.CookingItem;
import net.bonappetit.common.JuiceItem;
import net.bonappetit.common.ModFoods;
import net.bonappetit.common.ModItem;
import net.bonappetit.common.ModSoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    // COOKING TOOLS
    public static final RegistryObject<Item> JUICER = register("juicer", new CookingItem(new Item.Properties().group(BonAppetit.ITEM_GROUP).maxStackSize(1)));
    public static final RegistryObject<Item> CUTTING_BOARD = register("cutting_board", new CookingItem(new Item.Properties().group(BonAppetit.ITEM_GROUP).maxStackSize(1)));
    public static final RegistryObject<Item> PAN = register("cooking_pan", new CookingItem(new Item.Properties().group(BonAppetit.ITEM_GROUP).maxStackSize(1)));
    public static final RegistryObject<Item> POT = register("cooking_pot", new CookingItem(new Item.Properties().group(BonAppetit.ITEM_GROUP).maxStackSize(1)));
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = register("cooking_mortar_and_pestle", new CookingItem(new Item.Properties().group(BonAppetit.ITEM_GROUP).maxStackSize(1)));
    public static final RegistryObject<Item> BAKEWARE = register("cooking_bakeware", new CookingItem(new Item.Properties().group(BonAppetit.ITEM_GROUP).maxStackSize(1)));
    // ITEMS
    public static final RegistryObject<Item> SALT = register("salt", new ModItem(new Item.Properties()));
    public static final RegistryObject<Item> CREAM = register("cream", new ModItem(new Item.Properties()));
    public static final RegistryObject<Item> BUTTER = register("butter", new ModItem(new Item.Properties()));
    public static final RegistryObject<Item> FLOUR = register("flour", new ModItem(new Item.Properties()));
    public static final RegistryObject<Item> DOUGH = register("dough", new ModItem(new Item.Properties()));
    // FOOD
    public static final RegistryObject<Item> SCALLION = register("scallion", new CompostableItem(new Item.Properties().food(ModFoods.SCALLION), 0.65F));
    public static final RegistryObject<Item> ONION = register("onion", new CompostableItem(new Item.Properties().food(ModFoods.ONION), 0.65F));
    public static final RegistryObject<Item> SEEDS_ONION = register("seeds_onion", new CompostableItem(new Item.Properties(), 0.30f));
    public static final RegistryObject<Item> TOMATO = register("tomato", new CompostableItem(new Item.Properties().food(ModFoods.TOMATO), 0.65F));
    public static final RegistryObject<Item> SEEDS_TOMATO = register("seeds_tomato", new CompostableItem(new Item.Properties(), 0.30f));
    public static final RegistryObject<Item> GARLIC = register("garlic", new CompostableItem(new Item.Properties().food(ModFoods.GARLIC), 0.65F));
    public static final RegistryObject<Item> SEEDS_GARLIC = register("seeds_garlic", new CompostableItem(new Item.Properties(), 0.30f));
    public static final RegistryObject<Item> CHEESE = register("cheese", new ModItem(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> CHEESE_CROQUETTES = register("cheese_croquettes", new ModItem(new Item.Properties().food(ModFoods.CHEESE_CROQUETTES)));
    public static final RegistryObject<Item> PANCAKES = register("pancakes", new ModItem(new Item.Properties().food(ModFoods.PANCAKES)));
    public static final RegistryObject<Item> FRIED_EGG = register("fried_egg", new ModItem(new Item.Properties().food(ModFoods.FRIED_EGG)));
    public static final RegistryObject<Item> CHEESE_SOUP = register("cheese_soup", new ModItem(new Item.Properties().food(ModFoods.CHEESE_SOUP)));
    public static final RegistryObject<Item> ONION_SOUP = register("onion_soup", new ModItem(new Item.Properties().food(ModFoods.ONION_SOUP)));
    public static final RegistryObject<Item> CARROT_SALAD = register("carrot_salad", new ModItem(new Item.Properties().food(ModFoods.CARROT_SALAD)));
    // DRINKS
    public static final RegistryObject<Item> JUICE_APPLE = register("juice_apple", new JuiceItem(16776960, new Item.Properties().food(ModFoods.JUICE_APPLE)));
    public static final RegistryObject<Item> JUICE_PUMPKIN = register("juice_pumpkin", new JuiceItem(16762880, new Item.Properties().food(ModFoods.JUICE_PUMPKIN)));
    public static final RegistryObject<Item> JUICE_CARROT = register("juice_carrot", new JuiceItem(16751365, new Item.Properties().food(ModFoods.JUICE_CARROT)));
    public static final RegistryObject<Item> JUICE_TOMATO = register("juice_tomato", new JuiceItem(14435840, new Item.Properties().food(ModFoods.JUICE_TOMATO)));
    public static final RegistryObject<Item> JUICE_MELON = register("juice_melon", new JuiceItem(16711680, new Item.Properties().food(ModFoods.JUICE_MELON)));
    public static final RegistryObject<Item> JUICE_BERRIES = register("juice_berries", new JuiceItem(16711835, new Item.Properties().food(ModFoods.JUICE_BERRIES)));
    // MISC
    public static final RegistryObject<Item> MUSIC_DISC_AFTERNOON = register("music_disc_afternoon", new MusicDiscItem(0, ModSoundEvents.DISC_AFTERNOON_LAZY.get(), new Item.Properties().maxStackSize(1).group(BonAppetit.ITEM_GROUP).rarity(Rarity.RARE)));

    private static RegistryObject<Item> register(String id, Item item) {
        return Registration.ITEMS.register(id, () -> item);
    }

    public static void init() { }
}

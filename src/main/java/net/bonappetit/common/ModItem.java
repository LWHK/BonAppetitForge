package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.minecraft.item.Item;

public class ModItem extends Item {

    public ModItem(Properties properties) {
        super(properties.group(BonAppetit.ITEM_GROUP));
    }
    
}

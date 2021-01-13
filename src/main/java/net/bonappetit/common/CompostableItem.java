package net.bonappetit.common;

import net.minecraft.block.ComposterBlock;

public class CompostableItem extends ModItem {

    public CompostableItem(Properties properties, float chance) {
        super(properties);
        ComposterBlock.CHANCES.put(this, chance);
    }
    
}

package net.bonappetit.common;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CookingItem extends Item {

        public CookingItem(Properties properties) {
                super(properties);
        }

        @Override
        public final boolean hasContainerItem(ItemStack itemStack) {
                return true;
        }

        @Override
        public final ItemStack getContainerItem(ItemStack itemStack) {
                return new ItemStack(this);
        }
        
}
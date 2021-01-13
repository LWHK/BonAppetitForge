package net.bonappetit.common;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class JuiceItem extends ModItem {

    private final int color;

    public JuiceItem(int color, Properties settings) {
        super(settings);
        this.color = color;
    }
    
    public int getMaxUseTime(ItemStack stack) {
        return 28;
    }
  
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ITEM_BOTTLE_EMPTY;
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (isInGroup(group)) {
            ItemStack stack = new ItemStack(this);
            Minecraft.getInstance().getItemColors().register(new IItemColor(){
                @Override
                public int getColor(ItemStack stack, int tintIndex) {
                    return tintIndex == 0 ? color : 0xFFFFFF;
                }
            }, this);
            items.add(stack);
        }
    }
}
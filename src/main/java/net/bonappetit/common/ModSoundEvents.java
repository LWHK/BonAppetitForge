package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BonAppetit.MOD_ID);
    
    public static final Lazy<SoundEvent> DISC_AFTERNOON_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(BonAppetit.MOD_ID, "music_disc_afternoon")));
    public static final RegistryObject<SoundEvent> AFTERNOON_DISC = SOUNDS.register("music_disc_afternoon", DISC_AFTERNOON_LAZY);

    public static void init() { }
}

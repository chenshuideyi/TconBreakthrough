package com.csdy.tconbreakthrough;


import com.csdy.tconbreakthrough.modifier.Register;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModMain.MODID)
@Mod.EventBusSubscriber(modid = ModMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModMain {

    public static final String MODID = "tconbreakthrough";

    public ModMain() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Register.MODIFIERS.register(bus);
    }

}


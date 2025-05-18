package com.csdy.tconbreakthrough.modifier;

import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

import static com.csdy.tconbreakthrough.ModMain.MODID;


public class Register {
    public static ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(MODID);
    public static final StaticModifier<Test> TEST_STATIC_MODIFIER = MODIFIERS.register("test", Test::new);
}

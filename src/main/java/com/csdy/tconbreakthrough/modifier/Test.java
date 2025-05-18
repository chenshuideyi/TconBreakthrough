package com.csdy.tconbreakthrough.modifier;

import slimeknights.tconstruct.library.modifiers.ModifierEntry;
import slimeknights.tconstruct.library.modifiers.ModifierHooks;
import slimeknights.tconstruct.library.modifiers.hook.build.ToolStatsModifierHook;
import slimeknights.tconstruct.library.modifiers.impl.NoLevelsModifier;
import slimeknights.tconstruct.library.module.ModuleHookMap;
import slimeknights.tconstruct.library.tools.nbt.IToolContext;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class Test extends NoLevelsModifier implements ToolStatsModifierHook {

    @Override
    public void addToolStats(IToolContext context, ModifierEntry entry, ModifierStatsBuilder builder) {
        float rate = Float.POSITIVE_INFINITY;
        ToolStats.DRAW_SPEED.multiply(builder, 1 * rate);
        ToolStats.MINING_SPEED.multiply(builder, 1 * rate);
        ToolStats.DURABILITY.multiply(builder, 1 * rate);
        ToolStats.ATTACK_SPEED.multiply(builder, 1 * rate);
        ToolStats.ATTACK_DAMAGE.multiply(builder, 1 * rate);
        ToolStats.VELOCITY.multiply(builder, 1 * rate);
        ToolStats.ACCURACY.multiply(builder, 1 * rate);
        ToolStats.PROJECTILE_DAMAGE.multiply(builder, 1 * rate);
        ToolStats.ARMOR.multiply(builder, 1 * rate);
        ToolStats.ARMOR_TOUGHNESS.multiply(builder, 1 * rate);
    }


    @Override
    protected void registerHooks(ModuleHookMap.Builder hookBuilder) {
        hookBuilder.addHook(this, ModifierHooks.TOOL_STATS);
    }
}

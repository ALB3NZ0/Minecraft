package net.rustam.mptmod.item;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class Amberhoe extends HoeItem {
    public Amberhoe(Tier tier, int attackDamageModifier, float attackSpeedModifier, Item.Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }
}

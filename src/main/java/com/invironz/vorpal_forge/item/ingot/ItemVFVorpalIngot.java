package com.invironz.vorpal_forge.item.ingot;

import com.invironz.vorpal_forge.item.ItemVFIngot;
import com.invironz.vorpal_forge.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public final class ItemVFVorpalIngot extends ItemVFIngot
{
    public ItemVFVorpalIngot()
    {
        super(Names.Item.Ingot.VORPAL);
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStack)
    {
        return EnumRarity.epic;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack, int pass)
    {
        return true;
    }
}

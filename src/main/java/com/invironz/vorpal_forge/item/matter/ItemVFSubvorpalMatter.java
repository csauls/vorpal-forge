package com.invironz.vorpal_forge.item.matter;

import com.invironz.vorpal_forge.item.ItemVFMatter;
import com.invironz.vorpal_forge.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public final class ItemVFSubvorpalMatter extends ItemVFMatter
{
    public ItemVFSubvorpalMatter()
    {
        super(Names.Item.Matter.SUBVORPAL);
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStack)
    {
        return EnumRarity.rare;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack, int pass)
    {
        return true;
    }
}

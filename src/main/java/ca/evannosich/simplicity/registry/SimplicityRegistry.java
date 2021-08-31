package ca.evannosich.simplicity.registry;

import ca.evannosich.simplicity.item.combat.*;
import ca.evannosich.simplicity.item.miscellaneous.*;
import ca.evannosich.simplicity.item.tools.*;
import ca.evannosich.simplicity.lists.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SimplicityRegistry {
    // Create ItemGroup.COMBAT items.
    public static final ArmorItem EMERALD_HELMET = new EmeraldArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem EMERALD_CHESTPLATE = new EmeraldArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem EMERALD_LEGGINGS = new EmeraldArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem EMERALD_BOOTS = new EmeraldArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final SwordItem EMERALD_SWORD = new EmeraldSwordItem(EmeraldToolMaterial.INSTANCE, 7, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem OBSIDIAN_HELMET = new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem OBSIDIAN_LEGGINGS = new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem OBSIDIAN_BOOTS = new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final SwordItem OBSIDIAN_SWORD = new ObsidianSwordItem(ObsidianToolMaterial.INSTANCE, 7, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    // Create ItemGroup.TOOLS items.
    public static final ToolItem EMERALD_PICKAXE = new EmeraldPickaxeItem(EmeraldToolMaterial.INSTANCE, 6, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem EMERALD_SHOVEL = new EmeraldShovelItem(EmeraldToolMaterial.INSTANCE, 5.5F, -3F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem EMERALD_AXE = new EmeraldAxeItem(EmeraldToolMaterial.INSTANCE, 8.1F, -3F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem EMERALD_HOE = new EmeraldHoeItem(EmeraldToolMaterial.INSTANCE, 4, 0F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem OBSIDIAN_PICKAXE = new ObsidianPickaxeItem(ObsidianToolMaterial.INSTANCE, 6, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem OBSIDIAN_SHOVEL = new ObsidianShovelItem(ObsidianToolMaterial.INSTANCE, 5.5F, -3F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem OBSIDIAN_AXE = new ObsidianAxeItem(ObsidianToolMaterial.INSTANCE, 8.1F, -3F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem OBSIDIAN_HOE = new ObsidianHoeItem(ObsidianToolMaterial.INSTANCE, 4, 0F, new FabricItemSettings().group(ItemGroup.TOOLS));
    // Create ItemGroup.MISC items.
    public static final HorseArmorItem EMERALD_HORSE_ARMOR = new EmeraldHorseArmorItem(11, "emerald_horse_armor", new FabricItemSettings().group(ItemGroup.MISC));
    public static final HorseArmorItem OBSIDIAN_HORSE_ARMOR = new ObsidianHorseArmorItem(11, "obsidian_horse_armor", new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item OBSIDIAN_SHARD = new ObsidianShardItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));

    public static void register() {
        // Register ItemGroup.COMBAT items.
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_boots"), EMERALD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_boots"), OBSIDIAN_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_sword"), OBSIDIAN_SWORD);
        // Register ItemGroup.TOOLS items.
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_shovel"), EMERALD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_hoe"), EMERALD_HOE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_hoe"), OBSIDIAN_HOE);
        // Register ItemGroup.MISC items.
        Registry.register(Registry.ITEM, new Identifier("simplicity", "emerald_horse_armor"), EMERALD_HORSE_ARMOR);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_horse_armor"), OBSIDIAN_HORSE_ARMOR);
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_shard"), OBSIDIAN_SHARD);
    }
}
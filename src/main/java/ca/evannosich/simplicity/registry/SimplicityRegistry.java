package ca.evannosich.simplicity.registry;

import ca.evannosich.simplicity.item.miscellaneous.ObsidianShard;
import ca.evannosich.simplicity.lists.EmeraldArmorMaterial;
import ca.evannosich.simplicity.lists.EmeraldToolMaterial;
import ca.evannosich.simplicity.lists.ObsidianArmorMaterial;
import ca.evannosich.simplicity.lists.ObsidianToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SimplicityRegistry {
    // Create ItemGroup.COMBAT items.
    public static final Item EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 7, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_HELMET = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_BOOTS = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_SWORD = new SwordItem(ObsidianToolMaterial.INSTANCE, 7, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    // Create ItemGroup.TOOLS items.
    public static final Item EMERALD_PICKAXE = new ToolItem(EmeraldToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item EMERALD_SHOVEL = new ToolItem(EmeraldToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item EMERALD_AXE = new ToolItem(EmeraldToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item EMERALD_HOE = new ToolItem(EmeraldToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_PICKAXE = new ToolItem(ObsidianToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_SHOVEL = new ToolItem(ObsidianToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_AXE = new ToolItem(ObsidianToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_HOE = new ToolItem(ObsidianToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS));
    // Create ItemGroup.MISC items.
    public static final Item EMERALD_HORSE_ARMOR = new HorseArmorItem(11, "emerald_horse_armor", new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item OBSIDIAN_HORSE_ARMOR = new HorseArmorItem(11, "obsidian_horse_armor", new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item OBSIDIAN_SHARD = new ObsidianShard(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));

    public static void register() {
        // Register new material item.
        Registry.register(Registry.ITEM, new Identifier("simplicity", "obsidian_shard"), OBSIDIAN_SHARD);
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

    }
}
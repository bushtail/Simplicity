package ca.evannosich.simplicity.init;


import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;

public class LootTables {
    public static final List<Identifier> INJECT_TABLE = Arrays.asList(
            new Identifier("minecraft", "chests/village/village_armorer"),
            new Identifier("minecraft", "chests/village/village_butcher"),
            new Identifier("minecraft", "chests/village/village_tannery"),
            new Identifier("minecraft", "chests/village/village_temple"),
            new Identifier("minecraft", "chests/village/village_toolsmith"),
            new Identifier("minecraft", "chests/village/village_weaponsmith"),
            new Identifier("minecraft", "chests/village/village_desert_house"),
            new Identifier("minecraft", "chests/village/village_plains_house"),
            new Identifier("minecraft", "chests/village/village_savanna_house"),
            new Identifier("minecraft", "chests/village/village_snowy_house"),
            new Identifier("minecraft", "chests/village/village_taiga_house"),
            new Identifier("minecraft", "chests/abandoned_mineshaft"),
            new Identifier("minecraft", "chests/bastion_hoglin_stable"),
            new Identifier("minecraft", "chests/bastion_treasure"),
            new Identifier("minecraft", "chests/buried_treasure"),
            new Identifier("minecraft", "chests/desert_pyramid"),
            new Identifier("minecraft", "chests/end_city_treasure"),
            new Identifier("minecraft", "chests/jungle_temple"),
            new Identifier("minecraft", "chests/nether_bridge"),
            new Identifier("minecraft", "chests/pillager_outpost"),
            new Identifier("minecraft", "chests/ruined_portal"),
            new Identifier("minecraft", "chests/shipwreck_treasure"),
            new Identifier("minecraft", "chests/spawn_bonus_chest"),
            new Identifier("minecraft", "chests/stronghold_corridor"),
            new Identifier("minecraft", "chests/underwater_ruin_big"),
            new Identifier("minecraft", "chests/woodland_mansion")
    );
    public static void loot() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if(INJECT_TABLE.contains(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(1, 0.025f))
                        .with(ItemEntry.builder(SimplicityRegistry.HORSE_ARMOR_OBSIDIAN))
                        .with(ItemEntry.builder(SimplicityRegistry.HORSE_ARMOR_EMERALD));
                supplier.pool(poolBuilder);
            }
        }));
    }
}

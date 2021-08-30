package ca.evannosich.simplicity;

import net.fabricmc.api.ModInitializer;
import ca.evannosich.simplicity.registry.SimplicityRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class Simplicity implements ModInitializer {
    private static final Identifier OBSIDIAN_LOOT_TABLE_ID = Blocks.OBSIDIAN.getLootTableId();
    public static final String MOD_ID ="simplicity";
    public static final String NAME = "Simplicity";

    @Override
    public void onInitialize() {
        SimplicityRegistry.register();
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if(OBSIDIAN_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(10, 0.1f))
                        .with(ItemEntry.builder(SimplicityRegistry.OBSIDIAN_SHARD));
                supplier.pool(poolBuilder);
            }
        });
    }
}

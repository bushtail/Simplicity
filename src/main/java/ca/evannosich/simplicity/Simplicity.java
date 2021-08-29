package ca.evannosich.simplicity;

import net.fabricmc.api.ModInitializer;
import ca.evannosich.simplicity.registry.SimplicityRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.block.Blocks;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class Simplicity implements ModInitializer {
    public static final Identifier OBSIDIAN_LOOT_TABLE_ID = Blocks.OBSIDIAN.getLootTableId();
    public static final String MOD_ID ="simplicity";
    public static final String NAME = "Simplicity";

    @Override
    public void onInitialize() {

    }

    LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) ->{
        if(OBSIDIAN_LOOT_TABLE_ID.equals(id)) {
            FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(SimplicityRegistry.OBSIDIAN_SHARD));
            table.pool(poolBuilder);
        }
    });
}

package ca.evannosich.simplicity;

import net.fabricmc.api.ModInitializer;
import ca.evannosich.simplicity.init.SimplicityRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.block.Blocks;
import net.minecraft.loot.BinomialLootTableRange;
import ca.evannosich.simplicity.init.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

public class Simplicity implements ModInitializer {
    private static final Identifier OBSIDIAN_LOOT_TABLE_ID = Blocks.OBSIDIAN.getLootTableId();
    public static final String MOD_ID ="simplicity";
    public static final String NAME = "Simplicity";

    @Override
    public void onInitialize() {
        SimplicityRegistry.register();
        LootTables.loot();
    }
}

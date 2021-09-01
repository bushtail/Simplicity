package ca.evannosich.simplicity;

import net.fabricmc.api.ModInitializer;
import ca.evannosich.simplicity.init.SimplicityRegistry;
import ca.evannosich.simplicity.init.LootTables;

public class Simplicity implements ModInitializer {
    @Override
    public void onInitialize() {
        SimplicityRegistry.register();
        LootTables.loot();
    }
}

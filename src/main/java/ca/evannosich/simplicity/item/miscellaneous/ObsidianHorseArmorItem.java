package ca.evannosich.simplicity.item.miscellaneous;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.Identifier;

public class ObsidianHorseArmorItem extends HorseArmorItem {
    private final int bonus;
    private String entityTexture;

    public ObsidianHorseArmorItem(int bonus, String name, Settings settings) {
        super(bonus, name, settings);
        this.bonus = bonus;
        this.entityTexture = "textures/entity/horse/armor/horse_armor_" + name + ".png";
    }
    @Environment(EnvType.CLIENT)
    public Identifier getEntityTexture() {
        return new Identifier(this.entityTexture);
    }

    public int getBonus() {
        return this.bonus;
    }
}

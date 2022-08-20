package mrperson.amongus.item;


import mrperson.amongus.AmongUs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item RAW_AMONG_US = new Item(new FabricItemSettings().group(AmongUs.ITEMGROUP));
    public static final Item AMONG_US_INGOT = new Item(new FabricItemSettings().group(AmongUs.ITEMGROUP));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("amongus", "raw_among_us"), RAW_AMONG_US);
        Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_ingot"), AMONG_US_INGOT);
    }
}

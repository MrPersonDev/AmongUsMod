package mrperson.amongus.item;

import mrperson.amongus.AmongUs;
import mrperson.amongus.entity.EntityRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item RAW_AMONG_US = new Item(new FabricItemSettings().group(AmongUs.ITEMGROUP));
    public static final Item AMONG_US_INGOT = new Item(new FabricItemSettings().group(AmongUs.ITEMGROUP));
    public static final Item AMONG_US_NUGGET = new Item(new FabricItemSettings().group(AmongUs.ITEMGROUP));

    public static final ToolItem KNIFE = new SwordItem(KnifeToolMaterial.INSTANCE, 0, -1.4F, new Item.Settings().group(AmongUs.ITEMGROUP));

    public static final ArmorMaterial AMONG_US_ARMOR_MATERIAL = new AmongUsArmorMaterial();
    public static final Item AMONG_US_HELMET = new ArmorItem(AMONG_US_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(AmongUs.ITEMGROUP));
    public static final Item AMONG_US_CHESTPLATE = new ArmorItem(AMONG_US_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(AmongUs.ITEMGROUP));
	public static final Item AMONG_US_LEGGINGS = new ArmorItem(AMONG_US_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(AmongUs.ITEMGROUP));
	public static final Item AMONG_US_BOOTS = new ArmorItem(AMONG_US_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(AmongUs.ITEMGROUP));

    public static final Item IMPOSTER_SPAWN_EGG = new SpawnEggItem(EntityRegistry.IMPOSTER, 16729400, 6032134, new Item.Settings().group(AmongUs.ITEMGROUP));
    
    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("amongus", "raw_among_us"), RAW_AMONG_US);
        Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_ingot"), AMONG_US_INGOT);
        Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_nugget"), AMONG_US_NUGGET);

        Registry.register(Registry.ITEM, new Identifier("amongus", "knife"), KNIFE);

        Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_helmet"), AMONG_US_HELMET);
		Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_chestplate"), AMONG_US_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_leggings"), AMONG_US_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("amongus", "among_us_boots"), AMONG_US_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("amongus", "imposter_spawn_egg"), IMPOSTER_SPAWN_EGG);
    }
}

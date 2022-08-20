package mrperson.amongus;

import mrperson.amongus.item.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AmongUs implements ModInitializer {
	public static ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
		new Identifier("amongus", "amongus"),
		() -> new ItemStack(ItemRegistry.AMONG_US_INGOT));

	@Override
	public void onInitialize() {
		ItemRegistry.init();
	}
}

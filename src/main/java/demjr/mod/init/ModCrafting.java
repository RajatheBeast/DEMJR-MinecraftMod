package demjr.mod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.salt), "SSS", "SSS", "SSS", 'S', ModItems.salt);
	}
	
}

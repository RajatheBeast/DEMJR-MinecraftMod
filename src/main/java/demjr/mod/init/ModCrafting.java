package demjr.mod.init;

import jline.console.completer.ArgumentCompleter.WhitespaceArgumentDelimiter;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.salt), "SSS", "SSS", "SSS", 'S', ModItems.salt);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), Items.WHEAT);
	}
	
}

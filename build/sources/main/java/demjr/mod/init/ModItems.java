package demjr.mod.init;

import demjr.mod.items.ItemFlour;
import demjr.mod.items.ItemSalt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item salt;
	public static Item flour;
	
	public static void init() {
		salt = new ItemSalt();
		flour = new ItemFlour();
	
	}
	public static void register() {
		GameRegistry.register(salt);
		GameRegistry.register(flour);
	
	}
		
	public static void registerRenders() {
		registerRender(salt);
		registerRender(flour);
	}
		
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		

}



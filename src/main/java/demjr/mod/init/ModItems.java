package demjr.mod.init;

<<<<<<< HEAD
import demjr.mod.items.ItemChocolateChips;
import demjr.mod.items.ItemCookieDough;
import demjr.mod.items.ItemDough;
import demjr.mod.items.ItemFlour;
import demjr.mod.items.ItemSalt;
import demjr.mod.items.ItemTrumpGem;
=======
import demjr.mod.items.*;
>>>>>>> 8a0eb6048eb07132d5ad6533354a737816cfb5fb
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item salt;
	public static Item flour;
	public static Item trumpgem;
	public static Item cookiedough;
	public static Item dough;
	public static Item chocolatechips;
	
	public static void init() {
		salt = new ItemSalt();
		flour = new ItemFlour();
		trumpgem = new ItemTrumpGem();
		cookiedough = new ItemCookieDough();
		dough = new ItemDough();
		chocolatechips = new ItemChocolateChips();
	
	}
	public static void register() {
		GameRegistry.register(salt);
		GameRegistry.register(flour);
		GameRegistry.register(trumpgem);
		GameRegistry.register(cookiedough);
		GameRegistry.register(dough);
		GameRegistry.register(chocolatechips);
	
	}
		
	public static void registerRenders() {
		registerRender(salt);
		registerRender(flour);
		registerRender(trumpgem);
		registerRender(cookiedough);
		registerRender(dough);
		registerRender(chocolatechips);
	}
		
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		

}



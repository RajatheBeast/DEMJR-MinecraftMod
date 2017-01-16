package demjr.mod.init;

import demjr.mod.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ToolMaterial trumptool = EnumHelper.addToolMaterial("trumptool", 10, 2000, 15F, 15F, 10);
	public static ArmorMaterial trumparmor = EnumHelper.addArmorMaterial("trump", "demjr:items/trump", 35, new int[]{3, 6, 8, 3}, 20, null, 2.0F);
    public static Item salt;
	public static Item flour;
	public static Item trumpgem;
	public static Item cookiedough;
	public static Item dough;
	public static Item chocolatechips;
	public static Item applepie;
	public static Item trumpsword;
	public static Item trumphelmet;

	
	public static void init() {
		salt = new ItemSalt();
		flour = new ItemFlour();
		trumpgem = new ItemTrumpGem();
		cookiedough = new ItemCookieDough();
		dough = new ItemDough();
		chocolatechips = new ItemChocolateChips();
		applepie = new ItemApplePie();
		trumpsword = new ItemTrumpSword(trumptool);
		trumphelmet = new ItemTrumpHelmet(trumparmor, 0, EntityEquipmentSlot.HEAD, );
	
	}
	public static void register() {
		GameRegistry.register(salt);
		GameRegistry.register(flour);
		GameRegistry.register(trumpgem);
		GameRegistry.register(cookiedough);
		GameRegistry.register(dough);
		GameRegistry.register(chocolatechips);
		GameRegistry.register(applepie);
		GameRegistry.register(trumpsword);
	    GameRegistry.register(trumphelmet);
	}
		
	public static void registerRenders() {
		registerRender(salt);
		registerRender(flour);
		registerRender(trumpgem);
		registerRender(cookiedough);
		registerRender(dough);
		registerRender(chocolatechips);
		registerRender(applepie);
		registerRender(trumpsword);
		registerRender(trumphelmet);
	}
		
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		

}



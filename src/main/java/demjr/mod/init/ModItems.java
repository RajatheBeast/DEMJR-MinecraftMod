package demjr.mod.init;

import demjr.mod.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ToolMaterial trumptool = EnumHelper.addToolMaterial("trump", 10, 2000, 15F, 15F, 10);
	public static ArmorMaterial trumparmor = EnumHelper.addArmorMaterial("trump", "demjr:trump", 35, new int[]{3, 6, 8, 3}, 20, null, 3.0F);
    public static ToolMaterial dissapointiumtool = EnumHelper.addToolMaterial("dissapointium", 1, 2, 0.2F, 1F, 1);
    public static ArmorMaterial dissapointiumarmor = EnumHelper.addArmorMaterial("dissapointium", "demjr:dissapointium", 2, new int[]{0, 1, 0, 1}, 1, null, 0F);
	public static Item salt;
	public static Item flour;
	public static Item trumpgem;
	public static Item cookiedough;
	public static Item dough;
	public static Item chocolatechips;
	public static Item applepie;
	public static Item cementpowder;
	public static Item trumpsword;
	public static Item trumphelmet;
	public static Item trumppickaxe;
	public static Item trumpchest;
	public static Item trumpboots;
	public static Item trumplegs;
	public static Item trumpspade;
	public static Item trumphoe;
	public static Item trumpaxe;
	public static Item dissapointiumcrystal;

	
	public static void init() {
		salt = new ItemSalt();
		flour = new ItemFlour();
		trumpgem = new ItemTrumpGem();
		cookiedough = new ItemCookieDough();
		dough = new ItemDough();
		chocolatechips = new ItemChocolateChips();
		applepie = new ItemApplePie();
		cementpowder = new ItemCementPowder();
		trumpsword = new ItemTrumpSword(trumptool);
        trumphelmet = new ItemTrumpHelmet(trumparmor, 1, EntityEquipmentSlot.HEAD);
		trumppickaxe = new ItemTrumpPickaxe(trumptool);
		trumpchest = new ItemTrumpChestplate(trumparmor, 1, EntityEquipmentSlot.CHEST);
        trumpboots = new ItemTrumpBoots(trumparmor, 1, EntityEquipmentSlot.FEET);
        trumplegs = new ItemTrumpLeggings(trumparmor, 2, EntityEquipmentSlot.LEGS);
	    trumpspade = new ItemTrumpSpade(trumptool);
	    trumphoe = new ItemTrumpHoe(trumptool);
	    trumpaxe = new ItemTrumpAxe(trumptool, 8, 1.2F);

	}
	public static void register() {
        GameRegistry.register(salt);
        GameRegistry.register(flour);
        GameRegistry.register(trumpgem);
        GameRegistry.register(cookiedough);
        GameRegistry.register(dough);
        GameRegistry.register(chocolatechips);
        GameRegistry.register(applepie);
        GameRegistry.register(cementpowder);
        GameRegistry.register(trumpsword);
        GameRegistry.register(trumphelmet);
        GameRegistry.register(trumppickaxe);
        GameRegistry.register(trumpchest);
        GameRegistry.register(trumplegs);
        GameRegistry.register(trumpboots);
        GameRegistry.register(trumpspade);
        GameRegistry.register(trumphoe);
        GameRegistry.register(trumpaxe);
    }
		
	public static void registerRenders() {
		registerRender(salt);
		registerRender(flour);
		registerRender(trumpgem);
		registerRender(cookiedough);
		registerRender(dough);
		registerRender(chocolatechips);
		registerRender(applepie);
		registerRender(cementpowder);
		registerRender(trumpsword);
		registerRender(trumphelmet);
        registerRender(trumppickaxe);
        registerRender(trumpchest);
        registerRender(trumpboots);
        registerRender(trumplegs);
        registerRender(trumpspade);
        registerRender(trumphoe);
        registerRender(trumpaxe);
	}
		
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		

}



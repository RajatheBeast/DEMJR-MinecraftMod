package demjr.mod.init;

import demjr.mod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks {
	
	public static Block salt;
	public static Block trumpiumore;
	public static Block trumpiumblock;
    public static Block dissapointiumore;
    public static Block cement;


	public static void init() {

	    salt = new BlockSalt();
	    trumpiumore = new BlockTrumpiumOre();
	    trumpiumblock = new BlockTrumpiumBlock();
        dissapointiumore = new BlockDissapointiumOre();
        cement = new BlockCement();
	}
	public static void register() {

	    registerBlock(salt);
        registerBlock(trumpiumore);
        registerBlock(trumpiumblock);
        registerBlock(dissapointiumore);
        registerBlock(cement);
	}
		
	public static void registerRenders() {

	    registerRender(salt);
        registerRender(trumpiumore);
        registerRender(trumpiumblock);
        registerRender(dissapointiumore);
        registerRender(cement);
    }
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
	}
		
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}

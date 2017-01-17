package demjr.mod.init;

import demjr.mod.blocks.BlockSalt;
import demjr.mod.blocks.BlockTrumpiumBlock;
import demjr.mod.blocks.BlockTrumpiumOre;
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

	public static void init() {

	    salt = new BlockSalt();
	    trumpiumore = new BlockTrumpiumOre();
	    trumpiumblock = new BlockTrumpiumBlock();
	}
	public static void register() {

	    registerBlock(salt);
        registerBlock(trumpiumore);
        registerBlock(trumpiumblock);
	}
		
	public static void registerRenders() {

	    registerRender(salt);
        registerRender(trumpiumore);
        registerRender(trumpiumblock);
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

package demjr.mod;

import demjr.mod.init.ModBlocks;
import demjr.mod.init.ModCrafting;
import demjr.mod.init.ModItems;
import demjr.mod.init.ModSmelting;
import demjr.mod.proxy.CommonProxy;
import demjr.mod.world.WorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class DEMJR {

	@Instance
	public static DEMJR instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		proxy.init();
		ModCrafting.register();
        ModSmelting.register();
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Init");
	}

}

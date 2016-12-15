package demjr.mod.proxy;

import demjr.mod.init.ModBlocks;
import demjr.mod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();

	}
	
}

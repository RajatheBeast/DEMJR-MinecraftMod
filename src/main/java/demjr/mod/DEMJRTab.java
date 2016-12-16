package demjr.mod;

import demjr.mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DEMJRTab extends CreativeTabs {
	
	public DEMJRTab() {
		super("tabdemjr");
	
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.demjr_icon;
	}

}

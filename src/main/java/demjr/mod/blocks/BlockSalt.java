package demjr.mod.blocks;

import demjr.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSalt extends Block {

	public BlockSalt() {
		super(Material.ROCK);

		setUnlocalizedName(Reference.ModBlocks.SALT.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.SALT.getRegistryName());

	
	}

}

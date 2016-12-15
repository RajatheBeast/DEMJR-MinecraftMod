package demjr.mod.blocks;

import demjr.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTrumpiumOre extends Block {

    public BlockTrumpiumOre() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMORE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMORE.getRegistryName());
    }

}

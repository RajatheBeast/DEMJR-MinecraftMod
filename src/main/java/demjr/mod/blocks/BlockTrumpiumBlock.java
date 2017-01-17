package demjr.mod.blocks;

import demjr.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Elliott on 2017-01-16.
 */
public class BlockTrumpiumBlock extends Block {

    public BlockTrumpiumBlock(){
        super(Material.ROCK);
        setHardness(60);
        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMBLOCK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMBLOCK.getRegistryName());
    }

}

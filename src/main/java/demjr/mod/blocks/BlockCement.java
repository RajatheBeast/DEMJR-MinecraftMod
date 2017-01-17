package demjr.mod.blocks;

import demjr.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import scala.reflect.internal.Trees;

/**
 * Created by Dawson on 2017-01-17.
 */
public class BlockCement extends Block {

    public BlockCement() {
        super(Material.ROCK);

        setUnlocalizedName(Reference.ModBlocks.CEMENT.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CEMENT.getRegistryName());

        setHardness(20);
    }


}

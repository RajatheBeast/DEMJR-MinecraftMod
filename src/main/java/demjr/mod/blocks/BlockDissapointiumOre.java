package demjr.mod.blocks;

import demjr.mod.DEMJR;
import demjr.mod.Reference;
import demjr.mod.init.ModBlocks;
import demjr.mod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scala.util.Random;

import javax.annotation.Nullable;

/**
 * Created by Dawson on 2017-01-18.
 */
public class BlockDissapointiumOre extends Block {

    public BlockDissapointiumOre() {
        super(Material.ROCK);

        setUnlocalizedName(Reference.ModBlocks.DISSAPOINTIUMORE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.DISSAPOINTIUMORE.getRegistryName());
<<<<<<< HEAD
=======
        setCreativeTab(DEMJR.CREATIVE_TAB);
>>>>>>> d2821d45f2d67796f73238720e84c684a38c092f

        setHardness(20);
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return this == ModBlocks.dissapointiumore ? ModItems.dissapointiumcrystal :  Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random){
        return this == ModBlocks.trumpiumore ? 2 + random.nextInt(5) : 1;
    }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
}
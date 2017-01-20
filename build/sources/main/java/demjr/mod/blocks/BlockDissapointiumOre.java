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

        setCreativeTab(DEMJR.CREATIVE_TAB);
        setHardness(20);
    }
    @Nullable
    public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune){
        return this == ModBlocks.dissapointiumore ? ModItems.dissapointiumcrystal :  Item.getItemFromBlock(this);
    }

    public int quantityDropped(java.util.Random random){
        return this == ModBlocks.dissapointiumore ? 1 + random.nextInt(5) : 1;
    }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
}